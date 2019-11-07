package ObjectInterface.UserModule;


/**
* ObjectInterface/UserModule/UsersHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/User.idl
* Thursday, November 7, 2019 10:59:27 PM ICT
*/

abstract public class UsersHelper
{
  private static String  _id = "IDL:ObjectInterface/UserModule/Users:1.0";

  public static void insert (org.omg.CORBA.Any a, ObjectInterface.UserModule.User[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ObjectInterface.UserModule.User[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = ObjectInterface.UserModule.UserHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (ObjectInterface.UserModule.UsersHelper.id (), "Users", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ObjectInterface.UserModule.User[] read (org.omg.CORBA.portable.InputStream istream)
  {
    ObjectInterface.UserModule.User value[] = null;
    int _len0 = istream.read_long ();
    value = new ObjectInterface.UserModule.User[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = ObjectInterface.UserModule.UserHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ObjectInterface.UserModule.User[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      ObjectInterface.UserModule.UserHelper.write (ostream, value[_i0]);
  }

}
