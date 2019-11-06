
package Implement;

import ObjectInterface.UserModule.User;
import ObjectInterface.UserModule.UserHolder;
import ObjectInterface.UserModule.UserInterfacePOA;
import Store.State;
import java.sql.Connection;
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
        String query = String.format("SELECT * FROM users");

        ArrayList<User> users = new ArrayList<User>();

        
        ResultSet rs = db.getData(query);
        
        try {
            while(rs.next()){
                //DTOCategory cat = new DTOCategory(rs.getInt("catID"), rs.getInt("catStatus"), rs.getString("catName"));
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
