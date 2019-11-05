package ObjectInterface.Test;


/**
* ObjectInterface/Test/TestInterfaceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Interface/Test.idl
* Tuesday, November 5, 2019 4:34:51 PM ICT
*/

abstract public class TestInterfaceHelper
{
  private static String  _id = "IDL:ObjectInterface/Test/TestInterface:1.0";

  public static void insert (org.omg.CORBA.Any a, ObjectInterface.Test.TestInterface that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ObjectInterface.Test.TestInterface extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (ObjectInterface.Test.TestInterfaceHelper.id (), "TestInterface");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ObjectInterface.Test.TestInterface read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_TestInterfaceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ObjectInterface.Test.TestInterface value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static ObjectInterface.Test.TestInterface narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ObjectInterface.Test.TestInterface)
      return (ObjectInterface.Test.TestInterface)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      ObjectInterface.Test._TestInterfaceStub stub = new ObjectInterface.Test._TestInterfaceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static ObjectInterface.Test.TestInterface unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ObjectInterface.Test.TestInterface)
      return (ObjectInterface.Test.TestInterface)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      ObjectInterface.Test._TestInterfaceStub stub = new ObjectInterface.Test._TestInterfaceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}