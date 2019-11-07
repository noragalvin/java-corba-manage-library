/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Implement;

import ObjectInterface.ReaderModule.Reader;
import ObjectInterface.ReaderModule.ReaderInterfacePOA;
import ObjectInterface.UserModule.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omg.CORBA.ORB;

/**
 *
 * @author aboyb
 */
public class ReaderImplement extends ReaderInterfacePOA {
    private ORB orb;
    private Database db;
    private Connection conn;
    
    public ReaderImplement() {
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
    public String readerName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void readerName(String newReaderName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String birthday() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void birthday(String newBirthday) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String address() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void address(String newAddress) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String phoneNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void phoneNumber(String newPhoneNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String email() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void email(String newEmail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Reader getSingle(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Reader[] list() {
        String query = String.format("SELECT * FROM readers where status = 1");

        ArrayList<Reader> readers = new ArrayList<Reader>();
        
        ResultSet rs = db.getData(query);
        
        try {
            while(rs.next()){
                Reader r = new Reader(rs.getInt("id"), rs.getString("readerName"), rs.getString("birthday"), rs.getString("address"), rs.getString("phoneNumber"), rs.getString("email"), rs.getString("gender"));
                readers.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Reader result[] = new Reader[readers.size()];
        
        return readers.toArray(result);
    }

    @Override
    public int add(Reader o) {
        int n = 0;
        String query = "INSERT INTO readers(readerName, birthday, address, phoneNumber, gender, email) VALUES(?, ?, ?, ?, ?, ?)";
        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(query);
            
            pre.setString(1, o.readerName);
            pre.setString(2, o.birthday);
            pre.setString(3, o.address);
            pre.setString(4, o.phoneNumber);
            pre.setString(5, o.gender);
            pre.setString(6, o.email);

            
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    @Override
    public int delete(Reader o) {
        int n = 0;
                
        String query = "UPDATE readers SET status = 0 WHERE id = ?";
        PreparedStatement pre;
        
        try {
            pre = conn.prepareStatement(query);
            
            pre.setInt(1, o.id);
            
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return n;
    }

    @Override
    public int update(Reader o) {
        int n = 0;
        String query = "UPDATE readers SET readerName = ?, birthday = ?, address = ?, phoneNumber = ?, gender = ?, email = ? WHERE id = ?";
        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(query);
            
            pre.setString(1, o.readerName);
            pre.setString(2, o.birthday);
            pre.setString(3, o.address);
            pre.setString(4, o.phoneNumber);
            pre.setString(5, o.gender);
            pre.setString(6, o.email);
            pre.setInt(7, o.id);
            
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    @Override
    public String gender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gender(String newGender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
