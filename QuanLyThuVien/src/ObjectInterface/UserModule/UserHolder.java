package ObjectInterface.UserModule;

/**
* ObjectInterface/UserModule/UserHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/User.idl
* Friday, November 8, 2019 12:56:33 PM ICT
*/

public final class UserHolder implements org.omg.CORBA.portable.Streamable
{
  public ObjectInterface.UserModule.User value = null;

  public UserHolder ()
  {
  }

  public UserHolder (ObjectInterface.UserModule.User initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ObjectInterface.UserModule.UserHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ObjectInterface.UserModule.UserHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ObjectInterface.UserModule.UserHelper.type ();
  }

}
