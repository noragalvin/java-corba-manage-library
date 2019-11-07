package ObjectInterface.BillModule;


/**
* ObjectInterface/BillModule/BillInterfacePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Bill.idl
* Thursday, November 7, 2019 10:59:30 PM ICT
*/

public abstract class BillInterfacePOA extends org.omg.PortableServer.Servant
 implements ObjectInterface.BillModule.BillInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_id", new java.lang.Integer (0));
    _methods.put ("_set_id", new java.lang.Integer (1));
    _methods.put ("_get_status", new java.lang.Integer (2));
    _methods.put ("_set_status", new java.lang.Integer (3));
    _methods.put ("_get_readerID", new java.lang.Integer (4));
    _methods.put ("_set_readerID", new java.lang.Integer (5));
    _methods.put ("_get_createdAt", new java.lang.Integer (6));
    _methods.put ("_set_createdAt", new java.lang.Integer (7));
    _methods.put ("_get_deadline", new java.lang.Integer (8));
    _methods.put ("_set_deadline", new java.lang.Integer (9));
    _methods.put ("getSingle", new java.lang.Integer (10));
    _methods.put ("list", new java.lang.Integer (11));
    _methods.put ("borrowBook", new java.lang.Integer (12));
    _methods.put ("payBook", new java.lang.Integer (13));
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
       case 0:  // ObjectInterface/BillModule/BillInterface/_get_id
       {
         int $result = (int)0;
         $result = this.id ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // ObjectInterface/BillModule/BillInterface/_set_id
       {
         int newId = in.read_long ();
         this.id (newId);
         out = $rh.createReply();
         break;
       }

       case 2:  // ObjectInterface/BillModule/BillInterface/_get_status
       {
         int $result = (int)0;
         $result = this.status ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 3:  // ObjectInterface/BillModule/BillInterface/_set_status
       {
         int newStatus = in.read_long ();
         this.status (newStatus);
         out = $rh.createReply();
         break;
       }

       case 4:  // ObjectInterface/BillModule/BillInterface/_get_readerID
       {
         int $result = (int)0;
         $result = this.readerID ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 5:  // ObjectInterface/BillModule/BillInterface/_set_readerID
       {
         int newReaderID = in.read_long ();
         this.readerID (newReaderID);
         out = $rh.createReply();
         break;
       }

       case 6:  // ObjectInterface/BillModule/BillInterface/_get_createdAt
       {
         String $result = null;
         $result = this.createdAt ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 7:  // ObjectInterface/BillModule/BillInterface/_set_createdAt
       {
         String newCreatedAt = in.read_string ();
         this.createdAt (newCreatedAt);
         out = $rh.createReply();
         break;
       }

       case 8:  // ObjectInterface/BillModule/BillInterface/_get_deadline
       {
         String $result = null;
         $result = this.deadline ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 9:  // ObjectInterface/BillModule/BillInterface/_set_deadline
       {
         String newDeadline = in.read_string ();
         this.deadline (newDeadline);
         out = $rh.createReply();
         break;
       }

       case 10:  // ObjectInterface/BillModule/BillInterface/getSingle
       {
         int id = in.read_long ();
         ObjectInterface.BillModule.Bill $result = null;
         $result = this.getSingle (id);
         out = $rh.createReply();
         ObjectInterface.BillModule.BillHelper.write (out, $result);
         break;
       }

       case 11:  // ObjectInterface/BillModule/BillInterface/list
       {
         int readerID = in.read_long ();
         ObjectInterface.BillModule.Bill $result[] = null;
         $result = this.list (readerID);
         out = $rh.createReply();
         ObjectInterface.BillModule.BillsHelper.write (out, $result);
         break;
       }

       case 12:  // ObjectInterface/BillModule/BillInterface/borrowBook
       {
         int readerID = in.read_long ();
         int bookIDs[] = ObjectInterface.BillModule.longsHelper.read (in);
         String deadline = in.read_string ();
         this.borrowBook (readerID, bookIDs, deadline);
         out = $rh.createReply();
         break;
       }

       case 13:  // ObjectInterface/BillModule/BillInterface/payBook
       {
         int billID = in.read_long ();
         boolean $result = false;
         $result = this.payBook (billID);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ObjectInterface/BillModule/BillInterface:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public BillInterface _this() 
  {
    return BillInterfaceHelper.narrow(
    super._this_object());
  }

  public BillInterface _this(org.omg.CORBA.ORB orb) 
  {
    return BillInterfaceHelper.narrow(
    super._this_object(orb));
  }


} // class BillInterfacePOA
