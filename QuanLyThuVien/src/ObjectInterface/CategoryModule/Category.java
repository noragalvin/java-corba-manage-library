package ObjectInterface.CategoryModule;


/**
* ObjectInterface/CategoryModule/Category.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Category.idl
* Thursday, November 7, 2019 10:59:28 PM ICT
*/

public final class Category implements org.omg.CORBA.portable.IDLEntity
{
  public int id = (int)0;
  public String categoryName = null;

  public Category ()
  {
  } // ctor

  public Category (int _id, String _categoryName)
  {
    id = _id;
    categoryName = _categoryName;
  } // ctor

} // class Category