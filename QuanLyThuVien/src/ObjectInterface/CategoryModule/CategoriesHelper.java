package ObjectInterface.CategoryModule;


/**
* ObjectInterface/CategoryModule/CategoriesHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Category.idl
* Thursday, November 7, 2019 10:59:28 PM ICT
*/

abstract public class CategoriesHelper
{
  private static String  _id = "IDL:ObjectInterface/CategoryModule/Categories:1.0";

  public static void insert (org.omg.CORBA.Any a, ObjectInterface.CategoryModule.Category[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ObjectInterface.CategoryModule.Category[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = ObjectInterface.CategoryModule.CategoryHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (ObjectInterface.CategoryModule.CategoriesHelper.id (), "Categories", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ObjectInterface.CategoryModule.Category[] read (org.omg.CORBA.portable.InputStream istream)
  {
    ObjectInterface.CategoryModule.Category value[] = null;
    int _len0 = istream.read_long ();
    value = new ObjectInterface.CategoryModule.Category[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = ObjectInterface.CategoryModule.CategoryHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ObjectInterface.CategoryModule.Category[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      ObjectInterface.CategoryModule.CategoryHelper.write (ostream, value[_i0]);
  }

}