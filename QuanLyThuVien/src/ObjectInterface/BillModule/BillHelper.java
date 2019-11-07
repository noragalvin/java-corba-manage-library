package ObjectInterface.BillModule;


/**
* ObjectInterface/BillModule/BillHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Bill.idl
* Thursday, November 7, 2019 10:59:30 PM ICT
*/

abstract public class BillHelper
{
  private static String  _id = "IDL:ObjectInterface/BillModule/Bill:1.0";

  public static void insert (org.omg.CORBA.Any a, ObjectInterface.BillModule.Bill that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ObjectInterface.BillModule.Bill extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [5];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[1] = new org.omg.CORBA.StructMember (
            "status",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[2] = new org.omg.CORBA.StructMember (
            "readerID",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "createdAt",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "deadline",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (ObjectInterface.BillModule.BillHelper.id (), "Bill", _members0);
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

  public static ObjectInterface.BillModule.Bill read (org.omg.CORBA.portable.InputStream istream)
  {
    ObjectInterface.BillModule.Bill value = new ObjectInterface.BillModule.Bill ();
    value.id = istream.read_long ();
    value.status = istream.read_long ();
    value.readerID = istream.read_long ();
    value.createdAt = istream.read_string ();
    value.deadline = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ObjectInterface.BillModule.Bill value)
  {
    ostream.write_long (value.id);
    ostream.write_long (value.status);
    ostream.write_long (value.readerID);
    ostream.write_string (value.createdAt);
    ostream.write_string (value.deadline);
  }

}