package ObjectInterface.ReaderModule;

/**
* ObjectInterface/ReaderModule/ReaderInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Reader.idl
* Thursday, November 7, 2019 10:59:28 PM ICT
*/

public final class ReaderInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public ObjectInterface.ReaderModule.ReaderInterface value = null;

  public ReaderInterfaceHolder ()
  {
  }

  public ReaderInterfaceHolder (ObjectInterface.ReaderModule.ReaderInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ObjectInterface.ReaderModule.ReaderInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ObjectInterface.ReaderModule.ReaderInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ObjectInterface.ReaderModule.ReaderInterfaceHelper.type ();
  }

}