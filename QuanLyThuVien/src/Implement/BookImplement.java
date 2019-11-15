/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Implement;

import ObjectInterface.BookModule.Author;
import ObjectInterface.BookModule.Book;
import ObjectInterface.BookModule.BookInterfacePOA;
import ObjectInterface.BookModule.NXB;
import ObjectInterface.CategoryModule.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omg.CORBA.ORB;

/**
 *
 * @author aboyb
 */
public class BookImplement extends BookInterfacePOA {
    private ORB orb;
    private Database db;
    private Connection conn;

    public BookImplement() {
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
    public int inventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inventory(int newInventory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int borrowAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrowAmount(int newBorrowAmount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int categoryID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void categoryID(int newCategoryID) {
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
    public String publishingCompany() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void publishingCompany(String newPublishingCompany) {
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
    public String categoryName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void categoryName(String newCategoryName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book getSingle(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book[] list() {
        String query = String.format("SELECT books.*, categories.categoryName as categoryName FROM books inner join categories on categories.id = books.categoryID where books.status = 1");

        ArrayList<Book> books = new ArrayList<Book>();
        
        ResultSet rs = db.getData(query);
        
        try {
            while(rs.next()){
                Book b = new Book(rs.getInt("id"), rs.getInt("inventory"), rs.getInt("borrowAmount"), rs.getInt("categoryID"), rs.getInt("currentBorrow"), rs.getString("bookName"), rs.getString("publishingCompany"), rs.getString("createdAt"), rs.getString("categoryName"), rs.getString("author"));
                books.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        Book result[] = new Book[books.size()];
        
        return books.toArray(result);
    }

    @Override
    public String author() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void author(String newAuthor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int add(Book o) {
        int n = 0;
        String query = "insert into books(bookName, publishingCompany, createdAt, inventory, borrowAmount, categoryID, author) values (?,?,?,?,?,?,?);";
        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(query);
            
            pre.setString(1, o.bookName);
            pre.setString(2, o.publishingCompany);
            
            Calendar calendar = Calendar.getInstance();

            // get a java date (java.util.Date) from the Calendar instance.
            // this java date will represent the current date, or "now".
            java.util.Date currentDate = calendar.getTime();

            // now, create a java.sql.Date from the java.util.Date
            java.sql.Date date = new java.sql.Date(currentDate.getTime());
            pre.setDate(3, date);
            
            pre.setInt(4, o.inventory);
            pre.setInt(5, 0);
            pre.setInt(6, o.categoryID);
            pre.setString(7, o.author);

            
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    @Override
    public int delete(Book o) {
        int n = 0;
                
        String query = "UPDATE books SET status = 0 WHERE id = ?";
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
    public int update(Book o) {
        int n = 0;
        
        String query = "UPDATE books SET bookName = ?, publishingCompany = ?, inventory = ?, borrowAmount = ?, author = ?, categoryID = ? WHERE id = ?";
        PreparedStatement pre;
        
        try {
            pre = conn.prepareStatement(query);
            
            pre.setString(1, o.bookName);
            pre.setString(2, o.publishingCompany);
            pre.setInt(3, o.inventory);
            pre.setInt(4, o.borrowAmount);
            pre.setString(5, o.author);
            pre.setInt(6, o.categoryID);
            pre.setInt(7, o.id);


            System.out.println(pre.toString());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return n;
    }

    @Override
    public Author[] listAuthor() {
        
        String query = String.format("SELECT author FROM books GROUP BY author;");

        ArrayList<Author> authors = new ArrayList<Author>();
        
        ResultSet rs = db.getData(query);
        
        try {
            while(rs.next()){
                Author a = new Author(rs.getString("author"));
                authors.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        Author result[] = new Author[authors.size()];
        
        return authors.toArray(result);
    }

    @Override
    public NXB[] listNXB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book[] listByCatID(int id) {
        String query = String.format("SELECT books.*, categories.categoryName as categoryName FROM books inner join categories on categories.id = books.categoryID where books.status = 1 and categoryID = " + id);

        ArrayList<Book> books = new ArrayList<Book>();
        
        ResultSet rs = db.getData(query);
        
        try {
            while(rs.next()){
                Book b = new Book(rs.getInt("id"), rs.getInt("inventory"), rs.getInt("borrowAmount"), rs.getInt("categoryID"), 0, rs.getString("bookName"), rs.getString("publishingCompany"), rs.getString("createdAt"), rs.getString("categoryName"), rs.getString("author"));
                books.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        Book result[] = new Book[books.size()];
        
        return books.toArray(result);
    }

    @Override
    public Book[] listByBillID(int id) {
        String query = String.format("select books.*, bill_details.borrowAmount as currentBorrow from books inner join bill_details on bill_details.bookID = books.id inner join bills on bills.id = bill_details.billID where bill_details.status = 0 and bill_details.billID = %d", id);

        ArrayList<Book> books = new ArrayList<Book>();
        
        ResultSet rs = db.getData(query);
        
        try {
            while(rs.next()){
                Book b = new Book(rs.getInt("id"), rs.getInt("inventory"), rs.getInt("borrowAmount"), rs.getInt("categoryID"), rs.getInt("currentBorrow"), rs.getString("bookName"), rs.getString("publishingCompany"), rs.getString("createdAt"), "", rs.getString("author"));
                books.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObjectInterface.UserModule.User.class.getName()).log(Level.SEVERE, null, ex);
        }
        Book result[] = new Book[books.size()];
        
        return books.toArray(result);
    }

    @Override
    public int currentBorrow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void currentBorrow(int newCurrentBorrow) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
