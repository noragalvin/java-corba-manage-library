package ObjectInterface.User;

/**
* ObjectInterface/User/UserInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Interface/User.idl
* Tuesday, November 5, 2019 4:34:50 PM ICT
*/

public final class UserInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public ObjectInterface.User.UserInterface value = null;

  public UserInterfaceHolder ()
  {
  }

  public UserInterfaceHolder (ObjectInterface.User.UserInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ObjectInterface.User.UserInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ObjectInterface.User.UserInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ObjectInterface.User.UserInterfaceHelper.type ();
  }

}
