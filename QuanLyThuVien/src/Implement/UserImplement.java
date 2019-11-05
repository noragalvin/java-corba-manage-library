
package Implement;

import Entities.User;
import ObjectInterface.User.UserInterfacePOA;
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

    public void setORB(ORB orb_val) {
        orb = orb_val;
    }

    @Override
    public Object login(String username, String password) {
        return (Object) (new User());
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

    
}
