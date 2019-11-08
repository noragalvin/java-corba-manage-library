package ObjectInterface.BookModule;


/**
* ObjectInterface/BookModule/BookHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Book.idl
* Friday, November 8, 2019 12:56:36 PM ICT
*/

abstract public class BookHelper
{
  private static String  _id = "IDL:ObjectInterface/BookModule/Book:1.0";

  public static void insert (org.omg.CORBA.Any a, ObjectInterface.BookModule.Book that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ObjectInterface.BookModule.Book extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [9];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[1] = new org.omg.CORBA.StructMember (
            "inventory",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[2] = new org.omg.CORBA.StructMember (
            "borrowAmount",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[3] = new org.omg.CORBA.StructMember (
            "categoryID",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "bookName",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[5] = new org.omg.CORBA.StructMember (
            "publishingCompany",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[6] = new org.omg.CORBA.StructMember (
            "createdAt",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[7] = new org.omg.CORBA.StructMember (
            "categoryName",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[8] = new org.omg.CORBA.StructMember (
            "author",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (ObjectInterface.BookModule.BookHelper.id (), "Book", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ObjectInterface.BookModule.Book read (org.omg.CORBA.portable.InputStream istream)
  {
    ObjectInterface.BookModule.Book value = new ObjectInterface.BookModule.Book ();
    value.id = istream.read_long ();
    value.inventory = istream.read_long ();
    value.borrowAmount = istream.read_long ();
    value.categoryID = istream.read_long ();
    value.bookName = istream.read_string ();
    value.publishingCompany = istream.read_string ();
    value.createdAt = istream.read_string ();
    value.categoryName = istream.read_string ();
    value.author = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ObjectInterface.BookModule.Book value)
  {
    ostream.write_long (value.id);
    ostream.write_long (value.inventory);
    ostream.write_long (value.borrowAmount);
    ostream.write_long (value.categoryID);
    ostream.write_string (value.bookName);
    ostream.write_string (value.publishingCompany);
    ostream.write_string (value.createdAt);
    ostream.write_string (value.categoryName);
    ostream.write_string (value.author);
  }

}
