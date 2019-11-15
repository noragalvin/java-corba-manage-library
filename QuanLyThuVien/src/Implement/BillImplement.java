/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Implement;

import ObjectInterface.BillModule.Bill;
import ObjectInterface.BillModule.BillInterfacePOA;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omg.CORBA.ORB;

/**
 *
 * @author aboyb
 */
public class BillImplement extends BillInterfacePOA {
    private ORB orb;
    private Database db;
    private Connection conn;
    private ObjectInterface.BillModule.Bill bill = null;

    public BillImplement  () {
        this.db = Store.State.db;
        this.conn = this.db.getConnection();
    }

    public void setORB(ORB orb_val) {
        orb = orb_val;
    }
    
    @Override
    public int id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void id(int newId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int status() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void status(int newStatus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int readerID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void readerID(int newReaderID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String createdAt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createdAt(String newCreatedAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String deadline() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deadline(String newDeadline) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Bill getSingle(int id) {
        String query = String.format("select bills.*, readers.readerName, books.bookName from bills inner join bill_details on bills.id = bill_details.billID inner join books on books.id = bill_details.bookID inner join readers on readers.id = bills.readerID where bill_details.status = 0 and bills.id = '%d'", id);
        
        ResultSet rs = db.getData(query);
        try {
            if(rs.next()) {
                this.bill = new Bill(rs.getInt("id"), rs.getInt("status"), rs.getInt("readerID"), rs.getString("createdAt"), rs.getString("deadline"), rs.getString("readerName"), rs.getString("bookName"));
            } else {
                this.bill = new Bill(0, 0,0,"","","","");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.bill;
    }

    @Override
    public Bill[] list(int readerID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrowBook(int readerID, int[] bookIDs, String deadline) {
        String query = "insert into bills(readerID, createdAt, deadline) values (?,?,?)";
        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(query);

            pre.setInt(1, readerID);

            Calendar calendar = Calendar.getInstance();
            java.util.Date currentDate = calendar.getTime();
            java.sql.Date date = new java.sql.Date(currentDate.getTime());
            pre.setDate(2, date);
            pre.setString(3, deadline);
            int n = pre.executeUpdate();
            System.out.println(n);
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        query = "SELECT TOP 1 * FROM bills ORDER BY id DESC;";
        Bill bill = null;
        ResultSet rs = db.getData(query);
        try {
            if(rs.next()) {
                bill = new Bill(rs.getInt("id"), 0, 0, "", "", "", "");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Map<Integer, Integer> hackMap = new HashMap<>();
        for(int i = 0; i < bookIDs.length; i++) {
          if(hackMap.containsKey(bookIDs[i])) {
            hackMap.put(bookIDs[i], hackMap.get(bookIDs[i]) + 1);
          } else {
            hackMap.put(bookIDs[i], 1);
          }
        }
        System.out.println(hackMap);

        Iterator it = hackMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
           
            
            query = "insert into bill_details(billID, bookID, borrowAmount) values (?,?,?)";

            try {
                pre = conn.prepareStatement(query);

                pre.setInt(1, bill.id);
                pre.setInt(2, (Integer) pair.getKey());
                pre.setInt(3, (Integer) pair.getValue());
                pre.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            it.remove(); // avoids a ConcurrentModificationException
        }
           
    }


    @Override
    public String readerName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void readerName(String newReaderName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String bookName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bookName(String newBookName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean payBook(int[] ids, int billID) {
        String query = "";
        PreparedStatement pre = null;
        try {
            for(int i = 0; i < ids.length; i++) {
                query = String.format("UPDATE bill_details set status = 1 where billID = %d and bookID = %d", billID, ids[i]);
                pre = conn.prepareStatement(query);
                System.out.println(pre.toString());
                pre.executeUpdate();
            }
        } catch(Exception e) {
            return false;
        }
        return true;
    }
    
    
    
}
