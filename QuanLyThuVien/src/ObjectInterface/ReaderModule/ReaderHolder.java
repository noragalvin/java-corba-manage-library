package ObjectInterface.ReaderModule;

/**
* ObjectInterface/ReaderModule/ReaderHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Reader.idl
* Thursday, December 5, 2019 9:25:22 PM ICT
*/

public final class ReaderHolder implements org.omg.CORBA.portable.Streamable
{
  public ObjectInterface.ReaderModule.Reader value = null;

  public ReaderHolder ()
  {
  }

  public ReaderHolder (ObjectInterface.ReaderModule.Reader initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ObjectInterface.ReaderModule.ReaderHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ObjectInterface.ReaderModule.ReaderHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ObjectInterface.ReaderModule.ReaderHelper.type ();
  }

}
