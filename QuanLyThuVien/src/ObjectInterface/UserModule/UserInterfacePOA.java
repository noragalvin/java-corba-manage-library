package ObjectInterface.UserModule;


/**
* ObjectInterface/UserModule/UserInterfacePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/User.idl
* Thursday, November 7, 2019 10:59:27 PM ICT
*/

public abstract class UserInterfacePOA extends org.omg.PortableServer.Servant
 implements ObjectInterface.UserModule.UserInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_id", new java.lang.Integer (0));
    _methods.put ("_set_id", new java.lang.Integer (1));
    _methods.put ("_get_name", new java.lang.Integer (2));
    _methods.put ("_set_name", new java.lang.Integer (3));
    _methods.put ("_get_username", new java.lang.Integer (4));
    _methods.put ("_set_username", new java.lang.Integer (5));
    _methods.put ("_get_password", new java.lang.Integer (6));
    _methods.put ("_set_password", new java.lang.Integer (7));
    _methods.put ("_get_type", new java.lang.Integer (8));
    _methods.put ("_set_type", new java.lang.Integer (9));
    _methods.put ("login", new java.lang.Integer (10));
    _methods.put ("getSingle", new java.lang.Integer (11));
    _methods.put ("list", new java.lang.Integer (12));
    _methods.put ("add", new java.lang.Integer (13));
    _methods.put ("delete", new java.lang.Integer (14));
    _methods.put ("update", new java.lang.Integer (15));
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
       case 0:  // ObjectInterface/UserModule/UserInterface/_get_id
       {
         int $result = (int)0;
         $result = this.id ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // ObjectInterface/UserModule/UserInterface/_set_id
       {
         int newId = in.read_long ();
         this.id (newId);
         out = $rh.createReply();
         break;
       }

       case 2:  // ObjectInterface/UserModule/UserInterface/_get_name
       {
         String $result = null;
         $result = this.name ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // ObjectInterface/UserModule/UserInterface/_set_name
       {
         String newName = in.read_string ();
         this.name (newName);
         out = $rh.createReply();
         break;
       }

       case 4:  // ObjectInterface/UserModule/UserInterface/_get_username
       {
         String $result = null;
         $result = this.username ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 5:  // ObjectInterface/UserModule/UserInterface/_set_username
       {
         String newUsername = in.read_string ();
         this.username (newUsername);
         out = $rh.createReply();
         break;
       }

       case 6:  // ObjectInterface/UserModule/UserInterface/_get_password
       {
         String $result = null;
         $result = this.password ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 7:  // ObjectInterface/UserModule/UserInterface/_set_password
       {
         String newPassword = in.read_string ();
         this.password (newPassword);
         out = $rh.createReply();
         break;
       }

       case 8:  // ObjectInterface/UserModule/UserInterface/_get_type
       {
         String $result = null;
         $result = this.type ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 9:  // ObjectInterface/UserModule/UserInterface/_set_type
       {
         String newType = in.read_string ();
         this.type (newType);
         out = $rh.createReply();
         break;
       }

       case 10:  // ObjectInterface/UserModule/UserInterface/login
       {
         String username = in.read_string ();
         String password = in.read_string ();
         ObjectInterface.UserModule.User $result = null;
         $result = this.login (username, password);
         out = $rh.createReply();
         ObjectInterface.UserModule.UserHelper.write (out, $result);
         break;
       }

       case 11:  // ObjectInterface/UserModule/UserInterface/getSingle
       {
         int id = in.read_long ();
         ObjectInterface.UserModule.User $result = null;
         $result = this.getSingle (id);
         out = $rh.createReply();
         ObjectInterface.UserModule.UserHelper.write (out, $result);
         break;
       }

       case 12:  // ObjectInterface/UserModule/UserInterface/list
       {
         ObjectInterface.UserModule.User $result[] = null;
         $result = this.list ();
         out = $rh.createReply();
         ObjectInterface.UserModule.UsersHelper.write (out, $result);
         break;
       }

       case 13:  // ObjectInterface/UserModule/UserInterface/add
       {
         ObjectInterface.UserModule.User u = ObjectInterface.UserModule.UserHelper.read (in);
         int $result = (int)0;
         $result = this.add (u);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 14:  // ObjectInterface/UserModule/UserInterface/delete
       {
         ObjectInterface.UserModule.User u = ObjectInterface.UserModule.UserHelper.read (in);
         int $result = (int)0;
         $result = this.delete (u);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 15:  // ObjectInterface/UserModule/UserInterface/update
       {
         ObjectInterface.UserModule.User u = ObjectInterface.UserModule.UserHelper.read (in);
         int $result = (int)0;
         $result = this.update (u);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ObjectInterface/UserModule/UserInterface:1.0"};

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
