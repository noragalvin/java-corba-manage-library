package ObjectInterface.BookModule;


/**
* ObjectInterface/BookModule/Book.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Book.idl
* Thursday, December 5, 2019 9:25:23 PM ICT
*/

public final class Book implements org.omg.CORBA.portable.IDLEntity
{
  public int id = (int)0;
  public int inventory = (int)0;
  public int borrowAmount = (int)0;
  public int categoryID = (int)0;
  public int currentBorrow = (int)0;
  public String bookName = null;
  public String publishingCompany = null;
  public String createdAt = null;
  public String categoryName = null;
  public String author = null;

  public Book ()
  {
  } // ctor

  public Book (int _id, int _inventory, int _borrowAmount, int _categoryID, int _currentBorrow, String _bookName, String _publishingCompany, String _createdAt, String _categoryName, String _author)
  {
    id = _id;
    inventory = _inventory;
    borrowAmount = _borrowAmount;
    categoryID = _categoryID;
    currentBorrow = _currentBorrow;
    bookName = _bookName;
    publishingCompany = _publishingCompany;
    createdAt = _createdAt;
    categoryName = _categoryName;
    author = _author;
  } // ctor

} // class Book
