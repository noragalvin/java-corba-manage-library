package ObjectInterface.UserModule;

/**
* ObjectInterface/UserModule/UserInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/User.idl
* Thursday, December 5, 2019 9:25:21 PM ICT
*/

public final class UserInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public ObjectInterface.UserModule.UserInterface value = null;

  public UserInterfaceHolder ()
  {
  }

  public UserInterfaceHolder (ObjectInterface.UserModule.UserInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ObjectInterface.UserModule.UserInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ObjectInterface.UserModule.UserInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ObjectInterface.UserModule.UserInterfaceHelper.type ();
  }

}
