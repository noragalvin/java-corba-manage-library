package ObjectInterface.BillDetailModule;


/**
* ObjectInterface/BillDetailModule/BillDetailHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/BillDetail.idl
* Thursday, November 7, 2019 10:59:30 PM ICT
*/

abstract public class BillDetailHelper
{
  private static String  _id = "IDL:ObjectInterface/BillDetailModule/BillDetail:1.0";

  public static void insert (org.omg.CORBA.Any a, ObjectInterface.BillDetailModule.BillDetail that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ObjectInterface.BillDetailModule.BillDetail extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "billID",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[1] = new org.omg.CORBA.StructMember (
            "bookID",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[2] = new org.omg.CORBA.StructMember (
            "borrowAmount",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (ObjectInterface.BillDetailModule.BillDetailHelper.id (), "BillDetail", _members0);
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

  public static ObjectInterface.BillDetailModule.BillDetail read (org.omg.CORBA.portable.InputStream istream)
  {
    ObjectInterface.BillDetailModule.BillDetail value = new ObjectInterface.BillDetailModule.BillDetail ();
    value.billID = istream.read_long ();
    value.bookID = istream.read_long ();
    value.borrowAmount = istream.read_long ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ObjectInterface.BillDetailModule.BillDetail value)
  {
    ostream.write_long (value.billID);
    ostream.write_long (value.bookID);
    ostream.write_long (value.borrowAmount);
  }

}