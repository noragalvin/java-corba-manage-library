package ObjectInterface.CategoryModule;

/**
* ObjectInterface/CategoryModule/CategoryInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Category.idl
* Thursday, November 7, 2019 11:32:25 PM ICT
*/

public final class CategoryInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public ObjectInterface.CategoryModule.CategoryInterface value = null;

  public CategoryInterfaceHolder ()
  {
  }

  public CategoryInterfaceHolder (ObjectInterface.CategoryModule.CategoryInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ObjectInterface.CategoryModule.CategoryInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ObjectInterface.CategoryModule.CategoryInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ObjectInterface.CategoryModule.CategoryInterfaceHelper.type ();
  }

}
