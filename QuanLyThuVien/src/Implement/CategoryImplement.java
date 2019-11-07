/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Implement;

import ObjectInterface.CategoryModule.Category;
import ObjectInterface.CategoryModule.CategoryInterfacePOA;
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
public class CategoryImplement extends CategoryInterfacePOA {
    private ORB orb;
    private Database db;
    private Connection conn;
    
    public CategoryImplement() {
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
    public String categoryName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void categoryName(String newCategoryName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Category getSingle(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Category[] list() {
        String query = String.format("SELECT * FROM categories where status = 1");

        ArrayList<Category> categories = new ArrayList<Category>();
        
        ResultSet rs = db.getData(query);
        
        try {
            while(rs.next()){
                Category c = new Category(rs.getInt("id"), rs.getString("categoryName"));
                categories.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        Category result[] = new Category[categories.size()];
        
        return categories.toArray(result);
    }

    @Override
    public int add(Category o) {
        int n = 0;
        String query = "INSERT INTO categories(categoryName) VALUES(?)";
        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(query);
            
            pre.setString(1, o.categoryName);

            
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    @Override
    public int delete(Category o) {
        int n = 0;
                
        String query = "UPDATE categories SET status = 0 WHERE id = ?";
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
    public int update(Category o) {
        int n = 0;
        String query = "UPDATE categories SET categoryName = ? WHERE id = ?";
        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(query);
            
            pre.setString(1, o.categoryName);
            pre.setInt(2, o.id);
            
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    
}
