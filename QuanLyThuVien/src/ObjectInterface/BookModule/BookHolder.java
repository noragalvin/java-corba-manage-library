package ObjectInterface.BookModule;

/**
* ObjectInterface/BookModule/BookHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Book.idl
* Thursday, December 5, 2019 9:25:23 PM ICT
*/

public final class BookHolder implements org.omg.CORBA.portable.Streamable
{
  public ObjectInterface.BookModule.Book value = null;

  public BookHolder ()
  {
  }

  public BookHolder (ObjectInterface.BookModule.Book initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ObjectInterface.BookModule.BookHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ObjectInterface.BookModule.BookHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ObjectInterface.BookModule.BookHelper.type ();
  }

}
