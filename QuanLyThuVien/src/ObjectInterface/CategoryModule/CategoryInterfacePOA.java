package ObjectInterface.CategoryModule;


/**
* ObjectInterface/CategoryModule/CategoryInterfacePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Category.idl
* Thursday, November 7, 2019 10:59:28 PM ICT
*/

public abstract class CategoryInterfacePOA extends org.omg.PortableServer.Servant
 implements ObjectInterface.CategoryModule.CategoryInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_id", new java.lang.Integer (0));
    _methods.put ("_set_id", new java.lang.Integer (1));
    _methods.put ("_get_categoryName", new java.lang.Integer (2));
    _methods.put ("_set_categoryName", new java.lang.Integer (3));
    _methods.put ("getSingle", new java.lang.Integer (4));
    _methods.put ("list", new java.lang.Integer (5));
    _methods.put ("add", new java.lang.Integer (6));
    _methods.put ("delete", new java.lang.Integer (7));
    _methods.put ("update", new java.lang.Integer (8));
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
       case 0:  // ObjectInterface/CategoryModule/CategoryInterface/_get_id
       {
         int $result = (int)0;
         $result = this.id ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // ObjectInterface/CategoryModule/CategoryInterface/_set_id
       {
         int newId = in.read_long ();
         this.id (newId);
         out = $rh.createReply();
         break;
       }

       case 2:  // ObjectInterface/CategoryModule/CategoryInterface/_get_categoryName
       {
         String $result = null;
         $result = this.categoryName ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // ObjectInterface/CategoryModule/CategoryInterface/_set_categoryName
       {
         String newCategoryName = in.read_string ();
         this.categoryName (newCategoryName);
         out = $rh.createReply();
         break;
       }

       case 4:  // ObjectInterface/CategoryModule/CategoryInterface/getSingle
       {
         int id = in.read_long ();
         ObjectInterface.CategoryModule.Category $result = null;
         $result = this.getSingle (id);
         out = $rh.createReply();
         ObjectInterface.CategoryModule.CategoryHelper.write (out, $result);
         break;
       }

       case 5:  // ObjectInterface/CategoryModule/CategoryInterface/list
       {
         ObjectInterface.CategoryModule.Category $result[] = null;
         $result = this.list ();
         out = $rh.createReply();
         ObjectInterface.CategoryModule.CategoriesHelper.write (out, $result);
         break;
       }

       case 6:  // ObjectInterface/CategoryModule/CategoryInterface/add
       {
         ObjectInterface.CategoryModule.Category o = ObjectInterface.CategoryModule.CategoryHelper.read (in);
         int $result = (int)0;
         $result = this.add (o);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 7:  // ObjectInterface/CategoryModule/CategoryInterface/delete
       {
         ObjectInterface.CategoryModule.Category o = ObjectInterface.CategoryModule.CategoryHelper.read (in);
         int $result = (int)0;
         $result = this.delete (o);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 8:  // ObjectInterface/CategoryModule/CategoryInterface/update
       {
         ObjectInterface.CategoryModule.Category o = ObjectInterface.CategoryModule.CategoryHelper.read (in);
         int $result = (int)0;
         $result = this.update (o);
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
    "IDL:ObjectInterface/CategoryModule/CategoryInterface:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public CategoryInterface _this() 
  {
    return CategoryInterfaceHelper.narrow(
    super._this_object());
  }

  public CategoryInterface _this(org.omg.CORBA.ORB orb) 
  {
    return CategoryInterfaceHelper.narrow(
    super._this_object(orb));
  }


} // class CategoryInterfacePOA
