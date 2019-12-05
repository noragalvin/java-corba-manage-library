package ObjectInterface.UserModule;


/**
* ObjectInterface/UserModule/UserInterfaceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/User.idl
* Thursday, December 5, 2019 9:25:21 PM ICT
*/

public interface UserInterfaceOperations 
{
  int id ();
  void id (int newId);
  String name ();
  void name (String newName);
  String username ();
  void username (String newUsername);
  String password ();
  void password (String newPassword);
  String type ();
  void type (String newType);
  ObjectInterface.UserModule.User login (String username, String password);
  ObjectInterface.UserModule.User getSingle (int id);
  ObjectInterface.UserModule.User[] list ();
  int add (ObjectInterface.UserModule.User u);
  int delete (ObjectInterface.UserModule.User u);
  int update (ObjectInterface.UserModule.User u);
} // interface UserInterfaceOperations
