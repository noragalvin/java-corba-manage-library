/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlythuvien;

import ObjectInterface.BookModule.BookInterface;
import ObjectInterface.BookModule.BookInterfaceHelper;
import ObjectInterface.CategoryModule.CategoryInterface;
import ObjectInterface.CategoryModule.CategoryInterfaceHelper;
import ObjectInterface.ReaderModule.ReaderInterface;
import ObjectInterface.ReaderModule.ReaderInterfaceHelper;
import ObjectInterface.UserModule.UserInterface;
import ObjectInterface.UserModule.UserInterfaceHelper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.InvalidName;
import org.omg.CosNaming.NamingContextPackage.NotFound;

/**
 *
 * @author aboyb
 */
public class QuanLyThuVien {
    static UserInterface userImpl;
    static BookInterface bookImpl;
    static CategoryInterface catImpl;
    static ReaderInterface readerImpl;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create and initialize the ORB
        try {
            ORB orb = ORB.init(args, null);

            // get the root naming context
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
        // Use NamingContextExt instead of NamingContext. This is
            // part of the Interoperable naming Service.
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // resolve the Object Reference in Naming
            userImpl = UserInterfaceHelper.narrow(ncRef.resolve_str("User"));
            catImpl = CategoryInterfaceHelper.narrow(ncRef.resolve_str("Category"));
            bookImpl = BookInterfaceHelper.narrow(ncRef.resolve_str("Book"));
            readerImpl = ReaderInterfaceHelper.narrow(ncRef.resolve_str("Reader"));
                    
            (new DangNhap()).setVisible(true);
            
        }catch (Exception e) {
            System.out.println("ERROR : " + e);
            e.printStackTrace(System.out);
        }
    }
    
}
