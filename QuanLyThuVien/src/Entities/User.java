/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

/**
 *
 * @author aboyb
 */
public class User  {
    long id;
    String username, name, password, type;

    public User(long id, String username, String name, String password, String type) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.password = password;
        this.type = type;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    
}
