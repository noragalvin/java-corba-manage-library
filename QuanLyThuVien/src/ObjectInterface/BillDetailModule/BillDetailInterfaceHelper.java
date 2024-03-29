package ObjectInterface.BillDetailModule;


/**
* ObjectInterface/BillDetailModule/BillDetailInterfaceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/BillDetail.idl
* Thursday, December 5, 2019 9:25:25 PM ICT
*/

abstract public class BillDetailInterfaceHelper
{
  private static String  _id = "IDL:ObjectInterface/BillDetailModule/BillDetailInterface:1.0";

  public static void insert (org.omg.CORBA.Any a, ObjectInterface.BillDetailModule.BillDetailInterface that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ObjectInterface.BillDetailModule.BillDetailInterface extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (ObjectInterface.BillDetailModule.BillDetailInterfaceHelper.id (), "BillDetailInterface");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ObjectInterface.BillDetailModule.BillDetailInterface read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_BillDetailInterfaceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ObjectInterface.BillDetailModule.BillDetailInterface value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static ObjectInterface.BillDetailModule.BillDetailInterface narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ObjectInterface.BillDetailModule.BillDetailInterface)
      return (ObjectInterface.BillDetailModule.BillDetailInterface)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      ObjectInterface.BillDetailModule._BillDetailInterfaceStub stub = new ObjectInterface.BillDetailModule._BillDetailInterfaceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static ObjectInterface.BillDetailModule.BillDetailInterface unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ObjectInterface.BillDetailModule.BillDetailInterface)
      return (ObjectInterface.BillDetailModule.BillDetailInterface)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      ObjectInterface.BillDetailModule._BillDetailInterfaceStub stub = new ObjectInterface.BillDetailModule._BillDetailInterfaceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
