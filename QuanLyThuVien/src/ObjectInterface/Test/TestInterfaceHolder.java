package ObjectInterface.Test;

/**
* ObjectInterface/Test/TestInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Test.idl
* Tuesday, November 5, 2019 11:15:28 PM ICT
*/

public final class TestInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public ObjectInterface.Test.TestInterface value = null;

  public TestInterfaceHolder ()
  {
  }

  public TestInterfaceHolder (ObjectInterface.Test.TestInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ObjectInterface.Test.TestInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ObjectInterface.Test.TestInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ObjectInterface.Test.TestInterfaceHelper.type ();
  }

}
