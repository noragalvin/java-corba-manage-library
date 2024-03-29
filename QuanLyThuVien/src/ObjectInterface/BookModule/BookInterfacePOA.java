package ObjectInterface.BookModule;


/**
* ObjectInterface/BookModule/BookInterfacePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Book.idl
* Thursday, December 5, 2019 9:25:23 PM ICT
*/

public abstract class BookInterfacePOA extends org.omg.PortableServer.Servant
 implements ObjectInterface.BookModule.BookInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_id", new java.lang.Integer (0));
    _methods.put ("_set_id", new java.lang.Integer (1));
    _methods.put ("_get_inventory", new java.lang.Integer (2));
    _methods.put ("_set_inventory", new java.lang.Integer (3));
    _methods.put ("_get_borrowAmount", new java.lang.Integer (4));
    _methods.put ("_set_borrowAmount", new java.lang.Integer (5));
    _methods.put ("_get_categoryID", new java.lang.Integer (6));
    _methods.put ("_set_categoryID", new java.lang.Integer (7));
    _methods.put ("_get_currentBorrow", new java.lang.Integer (8));
    _methods.put ("_set_currentBorrow", new java.lang.Integer (9));
    _methods.put ("_get_bookName", new java.lang.Integer (10));
    _methods.put ("_set_bookName", new java.lang.Integer (11));
    _methods.put ("_get_publishingCompany", new java.lang.Integer (12));
    _methods.put ("_set_publishingCompany", new java.lang.Integer (13));
    _methods.put ("_get_createdAt", new java.lang.Integer (14));
    _methods.put ("_set_createdAt", new java.lang.Integer (15));
    _methods.put ("_get_categoryName", new java.lang.Integer (16));
    _methods.put ("_set_categoryName", new java.lang.Integer (17));
    _methods.put ("_get_author", new java.lang.Integer (18));
    _methods.put ("_set_author", new java.lang.Integer (19));
    _methods.put ("getSingle", new java.lang.Integer (20));
    _methods.put ("list", new java.lang.Integer (21));
    _methods.put ("listByCatID", new java.lang.Integer (22));
    _methods.put ("listByBillID", new java.lang.Integer (23));
    _methods.put ("add", new java.lang.Integer (24));
    _methods.put ("delete", new java.lang.Integer (25));
    _methods.put ("update", new java.lang.Integer (26));
    _methods.put ("listAuthor", new java.lang.Integer (27));
    _methods.put ("listNXB", new java.lang.Integer (28));
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
       case 0:  // ObjectInterface/BookModule/BookInterface/_get_id
       {
         int $result = (int)0;
         $result = this.id ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // ObjectInterface/BookModule/BookInterface/_set_id
       {
         int newId = in.read_long ();
         this.id (newId);
         out = $rh.createReply();
         break;
       }

       case 2:  // ObjectInterface/BookModule/BookInterface/_get_inventory
       {
         int $result = (int)0;
         $result = this.inventory ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 3:  // ObjectInterface/BookModule/BookInterface/_set_inventory
       {
         int newInventory = in.read_long ();
         this.inventory (newInventory);
         out = $rh.createReply();
         break;
       }

       case 4:  // ObjectInterface/BookModule/BookInterface/_get_borrowAmount
       {
         int $result = (int)0;
         $result = this.borrowAmount ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 5:  // ObjectInterface/BookModule/BookInterface/_set_borrowAmount
       {
         int newBorrowAmount = in.read_long ();
         this.borrowAmount (newBorrowAmount);
         out = $rh.createReply();
         break;
       }

       case 6:  // ObjectInterface/BookModule/BookInterface/_get_categoryID
       {
         int $result = (int)0;
         $result = this.categoryID ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 7:  // ObjectInterface/BookModule/BookInterface/_set_categoryID
       {
         int newCategoryID = in.read_long ();
         this.categoryID (newCategoryID);
         out = $rh.createReply();
         break;
       }

       case 8:  // ObjectInterface/BookModule/BookInterface/_get_currentBorrow
       {
         int $result = (int)0;
         $result = this.currentBorrow ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 9:  // ObjectInterface/BookModule/BookInterface/_set_currentBorrow
       {
         int newCurrentBorrow = in.read_long ();
         this.currentBorrow (newCurrentBorrow);
         out = $rh.createReply();
         break;
       }

       case 10:  // ObjectInterface/BookModule/BookInterface/_get_bookName
       {
         String $result = null;
         $result = this.bookName ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 11:  // ObjectInterface/BookModule/BookInterface/_set_bookName
       {
         String newBookName = in.read_string ();
         this.bookName (newBookName);
         out = $rh.createReply();
         break;
       }

       case 12:  // ObjectInterface/BookModule/BookInterface/_get_publishingCompany
       {
         String $result = null;
         $result = this.publishingCompany ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 13:  // ObjectInterface/BookModule/BookInterface/_set_publishingCompany
       {
         String newPublishingCompany = in.read_string ();
         this.publishingCompany (newPublishingCompany);
         out = $rh.createReply();
         break;
       }

       case 14:  // ObjectInterface/BookModule/BookInterface/_get_createdAt
       {
         String $result = null;
         $result = this.createdAt ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 15:  // ObjectInterface/BookModule/BookInterface/_set_createdAt
       {
         String newCreatedAt = in.read_string ();
         this.createdAt (newCreatedAt);
         out = $rh.createReply();
         break;
       }

       case 16:  // ObjectInterface/BookModule/BookInterface/_get_categoryName
       {
         String $result = null;
         $result = this.categoryName ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 17:  // ObjectInterface/BookModule/BookInterface/_set_categoryName
       {
         String newCategoryName = in.read_string ();
         this.categoryName (newCategoryName);
         out = $rh.createReply();
         break;
       }

       case 18:  // ObjectInterface/BookModule/BookInterface/_get_author
       {
         String $result = null;
         $result = this.author ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 19:  // ObjectInterface/BookModule/BookInterface/_set_author
       {
         String newAuthor = in.read_string ();
         this.author (newAuthor);
         out = $rh.createReply();
         break;
       }

       case 20:  // ObjectInterface/BookModule/BookInterface/getSingle
       {
         int id = in.read_long ();
         ObjectInterface.BookModule.Book $result = null;
         $result = this.getSingle (id);
         out = $rh.createReply();
         ObjectInterface.BookModule.BookHelper.write (out, $result);
         break;
       }

       case 21:  // ObjectInterface/BookModule/BookInterface/list
       {
         ObjectInterface.BookModule.Book $result[] = null;
         $result = this.list ();
         out = $rh.createReply();
         ObjectInterface.BookModule.BooksHelper.write (out, $result);
         break;
       }

       case 22:  // ObjectInterface/BookModule/BookInterface/listByCatID
       {
         int id = in.read_long ();
         ObjectInterface.BookModule.Book $result[] = null;
         $result = this.listByCatID (id);
         out = $rh.createReply();
         ObjectInterface.BookModule.BooksHelper.write (out, $result);
         break;
       }

       case 23:  // ObjectInterface/BookModule/BookInterface/listByBillID
       {
         int id = in.read_long ();
         ObjectInterface.BookModule.Book $result[] = null;
         $result = this.listByBillID (id);
         out = $rh.createReply();
         ObjectInterface.BookModule.BooksHelper.write (out, $result);
         break;
       }

       case 24:  // ObjectInterface/BookModule/BookInterface/add
       {
         ObjectInterface.BookModule.Book o = ObjectInterface.BookModule.BookHelper.read (in);
         int $result = (int)0;
         $result = this.add (o);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 25:  // ObjectInterface/BookModule/BookInterface/delete
       {
         ObjectInterface.BookModule.Book o = ObjectInterface.BookModule.BookHelper.read (in);
         int $result = (int)0;
         $result = this.delete (o);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 26:  // ObjectInterface/BookModule/BookInterface/update
       {
         ObjectInterface.BookModule.Book o = ObjectInterface.BookModule.BookHelper.read (in);
         int $result = (int)0;
         $result = this.update (o);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 27:  // ObjectInterface/BookModule/BookInterface/listAuthor
       {
         ObjectInterface.BookModule.Author $result[] = null;
         $result = this.listAuthor ();
         out = $rh.createReply();
         ObjectInterface.BookModule.AuthorsHelper.write (out, $result);
         break;
       }

       case 28:  // ObjectInterface/BookModule/BookInterface/listNXB
       {
         ObjectInterface.BookModule.NXB $result[] = null;
         $result = this.listNXB ();
         out = $rh.createReply();
         ObjectInterface.BookModule.NXBsHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ObjectInterface/BookModule/BookInterface:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public BookInterface _this() 
  {
    return BookInterfaceHelper.narrow(
    super._this_object());
  }

  public BookInterface _this(org.omg.CORBA.ORB orb) 
  {
    return BookInterfaceHelper.narrow(
    super._this_object(orb));
  }


} // class BookInterfacePOA
