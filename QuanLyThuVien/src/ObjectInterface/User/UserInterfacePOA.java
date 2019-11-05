package ObjectInterface.User;


/**
* ObjectInterface/User/UserInterfacePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Interface/User.idl
* Tuesday, November 5, 2019 4:34:50 PM ICT
*/

public abstract class UserInterfacePOA extends org.omg.PortableServer.Servant
 implements ObjectInterface.User.UserInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_username", new java.lang.Integer (0));
    _methods.put ("_set_username", new java.lang.Integer (1));
    _methods.put ("_get_password", new java.lang.Integer (2));
    _methods.put ("_set_password", new java.lang.Integer (3));
    _methods.put ("login", new java.lang.Integer (4));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // ObjectInterface/User/UserInterface/_get_username
       {
         String $result = null;
         $result = this.username ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // ObjectInterface/User/UserInterface/_set_username
       {
         String newUsername = in.read_string ();
         this.username (newUsername);
         out = $rh.createReply();
         break;
       }

       case 2:  // ObjectInterface/User/UserInterface/_get_password
       {
         String $result = null;
         $result = this.password ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // ObjectInterface/User/UserInterface/_set_password
       {
         String newPassword = in.read_string ();
         this.password (newPassword);
         out = $rh.createReply();
         break;
       }

       case 4:  // ObjectInterface/User/UserInterface/login
       {
         String username = in.read_string ();
         String password = in.read_string ();
         org.omg.CORBA.Object $result = null;
         $result = this.login (username, password);
         out = $rh.createReply();
         org.omg.CORBA.ObjectHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ObjectInterface/User/UserInterface:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public UserInterface _this() 
  {
    return UserInterfaceHelper.narrow(
    super._this_object());
  }

  public UserInterface _this(org.omg.CORBA.ORB orb) 
  {
    return UserInterfaceHelper.narrow(
    super._this_object(orb));
  }


} // class UserInterfacePOA