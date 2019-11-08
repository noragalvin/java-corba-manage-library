
import Implement.BillImplement;
import Implement.BookImplement;
import Implement.CategoryImplement;
import Implement.Database;
import Implement.ReaderImplement;
import Implement.UserImplement;
import ObjectInterface.BillModule.BillInterface;
import ObjectInterface.BillModule.BillInterfaceHelper;
import ObjectInterface.BookModule.BookInterface;
import ObjectInterface.BookModule.BookInterfaceHelper;
import ObjectInterface.CategoryModule.CategoryInterface;
import ObjectInterface.CategoryModule.CategoryInterfaceHelper;
import ObjectInterface.ReaderModule.ReaderInterface;
import ObjectInterface.ReaderModule.ReaderInterfaceHelper;
import ObjectInterface.UserModule.UserInterface;
import ObjectInterface.UserModule.UserInterfaceHelper;
import Store.State;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;


public class Server {

    public static void main(String args[]) {
        try {
            Store.State.db = new Database();
            // create and initialize the ORB
            ORB orb = ORB.init(args, null);

            // get reference to rootpoa & activate the POAManager
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();
            
            // Create servant and register it with the ORB
            UserImplement userImpl = new UserImplement() {};
            userImpl.setORB(orb);
            CategoryImplement catImpl = new CategoryImplement() {};
            catImpl.setORB(orb);
            ReaderImplement readerImpl = new ReaderImplement() {};
            readerImpl.setORB(orb);
            BookImplement bookImpl = new BookImplement() {};
            bookImpl.setORB(orb);
            BillImplement billImpl = new BillImplement() {};
            billImpl.setORB(orb);

            // get object reference from the servant            
            // User
            org.omg.CORBA.Object refUser = rootpoa.servant_to_reference(userImpl);
            UserInterface hrefUser = UserInterfaceHelper.narrow(refUser);
            // Category
            org.omg.CORBA.Object refCat = rootpoa.servant_to_reference(catImpl);
            CategoryInterface hrefCat = CategoryInterfaceHelper.narrow(refCat);
            // Reader
            org.omg.CORBA.Object refReader = rootpoa.servant_to_reference(readerImpl);
            ReaderInterface hrefReader = ReaderInterfaceHelper.narrow(refReader);
            // Book
            org.omg.CORBA.Object refBook = rootpoa.servant_to_reference(bookImpl);
            BookInterface hrefBook = BookInterfaceHelper.narrow(refBook);
            // Bill
            org.omg.CORBA.Object refBill = rootpoa.servant_to_reference(billImpl);
            BillInterface hrefBill = BillInterfaceHelper.narrow(refBill);

            // get the root naming context
            // NameService invokes the name service
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            // Use NamingContextExt which is part of the Interoperable
            // Naming Service (INS) specification.
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            
            // bind the Object Reference in Naming
            NameComponent pathUser[] = ncRef.to_name("User");
            ncRef.rebind(pathUser, hrefUser);
            NameComponent pathCat[] = ncRef.to_name("Category");
            ncRef.rebind(pathCat, hrefCat);
            NameComponent pathReader[] = ncRef.to_name("Reader");
            ncRef.rebind(pathReader, hrefReader);
            NameComponent pathBook[] = ncRef.to_name("Book");
            ncRef.rebind(pathBook, hrefBook);
            NameComponent pathBill[] = ncRef.to_name("Bill");
            ncRef.rebind(pathBill, hrefBill);

            System.out.println("Ready..");

            
            
            // wait for invocations from clients
            orb.run();
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }

        System.out.println("Exiting ...");

    }
}
