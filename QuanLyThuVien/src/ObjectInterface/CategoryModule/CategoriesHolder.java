package ObjectInterface.CategoryModule;


/**
* ObjectInterface/CategoryModule/CategoriesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Category.idl
* Wednesday, November 6, 2019 11:16:35 PM ICT
*/

public final class CategoriesHolder implements org.omg.CORBA.portable.Streamable
{
  public ObjectInterface.CategoryModule.Category value[] = null;

  public CategoriesHolder ()
  {
  }

  public CategoriesHolder (ObjectInterface.CategoryModule.Category[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ObjectInterface.CategoryModule.CategoriesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ObjectInterface.CategoryModule.CategoriesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ObjectInterface.CategoryModule.CategoriesHelper.type ();
  }

}
