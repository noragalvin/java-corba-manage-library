package ObjectInterface.BookModule;

/**
* ObjectInterface/BookModule/BookInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Book.idl
* Thursday, November 7, 2019 11:32:27 PM ICT
*/

public final class BookInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public ObjectInterface.BookModule.BookInterface value = null;

  public BookInterfaceHolder ()
  {
  }

  public BookInterfaceHolder (ObjectInterface.BookModule.BookInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ObjectInterface.BookModule.BookInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ObjectInterface.BookModule.BookInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ObjectInterface.BookModule.BookInterfaceHelper.type ();
  }

}
