package ObjectInterface.CategoryModule;


/**
* ObjectInterface/CategoryModule/CategoryInterfaceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Category.idl
* Friday, November 15, 2019 3:32:30 PM ICT
*/

public interface CategoryInterfaceOperations 
{
  int id ();
  void id (int newId);
  String categoryName ();
  void categoryName (String newCategoryName);
  ObjectInterface.CategoryModule.Category getSingle (int id);
  ObjectInterface.CategoryModule.Category[] list ();
  int add (ObjectInterface.CategoryModule.Category o);
  int delete (ObjectInterface.CategoryModule.Category o);
  int update (ObjectInterface.CategoryModule.Category o);
} // interface CategoryInterfaceOperations
