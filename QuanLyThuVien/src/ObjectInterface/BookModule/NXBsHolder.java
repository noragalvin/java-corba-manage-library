package ObjectInterface.BookModule;


/**
* ObjectInterface/BookModule/NXBsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Book.idl
* Thursday, November 7, 2019 11:32:27 PM ICT
*/

public final class NXBsHolder implements org.omg.CORBA.portable.Streamable
{
  public ObjectInterface.BookModule.NXB value[] = null;

  public NXBsHolder ()
  {
  }

  public NXBsHolder (ObjectInterface.BookModule.NXB[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ObjectInterface.BookModule.NXBsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ObjectInterface.BookModule.NXBsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ObjectInterface.BookModule.NXBsHelper.type ();
  }

}
