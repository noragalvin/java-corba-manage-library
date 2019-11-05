
import Implement.Database;
import Implement.UserImplement;
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

            // get object reference from the servant            
            org.omg.CORBA.Object refUser = rootpoa.servant_to_reference(userImpl);
            UserInterface hrefUser = UserInterfaceHelper.narrow(refUser);

            // get the root naming context
            // NameService invokes the name service
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            // Use NamingContextExt which is part of the Interoperable
            // Naming Service (INS) specification.
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            
            // bind the Object Reference in Naming
            NameComponent pathUser[] = ncRef.to_name("User");
            ncRef.rebind(pathUser, hrefUser);

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
