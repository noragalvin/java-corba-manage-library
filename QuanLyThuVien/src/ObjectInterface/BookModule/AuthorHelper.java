package ObjectInterface.BookModule;


/**
* ObjectInterface/BookModule/AuthorHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Book.idl
* Friday, November 8, 2019 12:56:36 PM ICT
*/

abstract public class AuthorHelper
{
  private static String  _id = "IDL:ObjectInterface/BookModule/Author:1.0";

  public static void insert (org.omg.CORBA.Any a, ObjectInterface.BookModule.Author that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ObjectInterface.BookModule.Author extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [1];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "name",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (ObjectInterface.BookModule.AuthorHelper.id (), "Author", _members0);
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

  public static ObjectInterface.BookModule.Author read (org.omg.CORBA.portable.InputStream istream)
  {
    ObjectInterface.BookModule.Author value = new ObjectInterface.BookModule.Author ();
    value.name = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ObjectInterface.BookModule.Author value)
  {
    ostream.write_string (value.name);
  }

}
