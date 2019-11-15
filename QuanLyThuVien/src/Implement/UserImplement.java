
package Implement;

import ObjectInterface.UserModule.User;
import ObjectInterface.UserModule.UserHolder;
import ObjectInterface.UserModule.UserInterfacePOA;
import Store.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aboyb
 */
public class UserImplement extends UserInterfacePOA {
    private ORB orb;
    private Database db;
    private Connection conn;
    private ObjectInterface.UserModule.User user = null;

    public UserImplement() {
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
    public String name() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void name(String newName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String username() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void username(String newUsername) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String password() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void password(String newPassword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String type() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void type(String newType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ObjectInterface.UserModule.User login(String username, String password) {
        String query = String.format("SELECT * FROM users WHERE username='%s' AND password='%s'", username, password);
        
        ResultSet rs = db.getData(query);
        try {
            if(rs.next()) {
                this.user = new ObjectInterface.UserModule.User(rs.getInt("id"), rs.getString("name"), rs.getString("username"), rs.getString("type"), rs.getString("password"));
            } else {
                this.user = new ObjectInterface.UserModule.User(0, "", "", "", "");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.user;
    }

    @Override
    public User[] list() {
        String query = String.format("SELECT * FROM users where status = 1");

        ArrayList<User> users = new ArrayList<User>();
        
        ResultSet rs = db.getData(query);
        
        try {
            while(rs.next()){
                User u = new User(rs.getInt("id"), rs.getString("name"), rs.getString("username"), rs.getString("type"), rs.getString("password"));
                users.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        User result[] = new User[users.size()];
        
        return users.toArray(result);
    }

    @Override
    public User getSingle(int id) {
        String query = String.format("SELECT * FROM users WHERE id = '%d'", id);
        
        ResultSet rs = db.getData(query);
        try {
            if(rs.next()) {
                this.user = new ObjectInterface.UserModule.User(rs.getInt("id"), rs.getString("name"), rs.getString("username"), rs.getString("type"), rs.getString("password"));
            } else {
                this.user = new ObjectInterface.UserModule.User(0, "", "", "", "");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.user;
    }

    @Override
    public int add(User u) {
        int n = 0;
        String query = "insert into users(name, username, password, type) values (?, ?, ?, ?)";
        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(query);
            
            pre.setString(1, u.name);
            pre.setString(2, u.username);
            pre.setString(3, u.password);
            pre.setString(4, u.type);

            
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    @Override
    public int delete(User u) {
        int n = 0;
                
        String query = "UPDATE users SET status = 0 WHERE id = ?";
        PreparedStatement pre;
        
        try {
            pre = conn.prepareStatement(query);
            
            pre.setInt(1, u.id);
            
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return n;
    }

    @Override
    public int update(User u) {
        int n = 0;
        
        String query = "UPDATE users SET name = ?, username = ?, password = ?, type = ? WHERE id = ?";
        PreparedStatement pre;
        
        try {
            pre = conn.prepareStatement(query);
            
            pre.setString(1, u.name);
            pre.setString(2, u.username);
            pre.setString(3, u.password);
            pre.setString(4, u.type);
            pre.setInt(5, u.id);

            System.out.println(pre.toString());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return n;
    }
    
}
