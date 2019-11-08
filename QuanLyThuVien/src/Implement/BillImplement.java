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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                bill = new Bill(rs.getInt("id"), 0, 0, "", "");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        for(int i = 0; i < bookIDs.length; i++) {
            query = "insert into bill_details(billID, bookID, borrowAmount) values (?,?,?)";

            try {
                pre = conn.prepareStatement(query);

                pre.setInt(1, bill.id);
                pre.setInt(2, i);
                pre.setInt(3, 1);
                pre.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean payBook(int billID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
