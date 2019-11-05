package MyAccount;


/**
* MyAccount/AccountHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from MyAccount/Account.idl
* Tuesday, November 5, 2019 2:49:18 PM ICT
*/

abstract public class AccountHelper
{
  private static String  _id = "IDL:MyAccount/Account:1.0";

  public static void insert (org.omg.CORBA.Any a, MyAccount.Account that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static MyAccount.Account extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (MyAccount.AccountHelper.id (), "Account");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static MyAccount.Account read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_AccountStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, MyAccount.Account value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static MyAccount.Account narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof MyAccount.Account)
      return (MyAccount.Account)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      MyAccount._AccountStub stub = new MyAccount._AccountStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static MyAccount.Account unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof MyAccount.Account)
      return (MyAccount.Account)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      MyAccount._AccountStub stub = new MyAccount._AccountStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
