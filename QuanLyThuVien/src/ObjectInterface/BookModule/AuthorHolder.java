package ObjectInterface.BookModule;

/**
* ObjectInterface/BookModule/AuthorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Book.idl
* Friday, November 15, 2019 3:32:31 PM ICT
*/

public final class AuthorHolder implements org.omg.CORBA.portable.Streamable
{
  public ObjectInterface.BookModule.Author value = null;

  public AuthorHolder ()
  {
  }

  public AuthorHolder (ObjectInterface.BookModule.Author initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ObjectInterface.BookModule.AuthorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ObjectInterface.BookModule.AuthorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ObjectInterface.BookModule.AuthorHelper.type ();
  }

}
