package ObjectInterface.BookModule;


/**
* ObjectInterface/BookModule/BooksHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Book.idl
* Friday, November 15, 2019 3:32:31 PM ICT
*/

abstract public class BooksHelper
{
  private static String  _id = "IDL:ObjectInterface/BookModule/Books:1.0";

  public static void insert (org.omg.CORBA.Any a, ObjectInterface.BookModule.Book[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ObjectInterface.BookModule.Book[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = ObjectInterface.BookModule.BookHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (ObjectInterface.BookModule.BooksHelper.id (), "Books", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ObjectInterface.BookModule.Book[] read (org.omg.CORBA.portable.InputStream istream)
  {
    ObjectInterface.BookModule.Book value[] = null;
    int _len0 = istream.read_long ();
    value = new ObjectInterface.BookModule.Book[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = ObjectInterface.BookModule.BookHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ObjectInterface.BookModule.Book[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      ObjectInterface.BookModule.BookHelper.write (ostream, value[_i0]);
  }

}
