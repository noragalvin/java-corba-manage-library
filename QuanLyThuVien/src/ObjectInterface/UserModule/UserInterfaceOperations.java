package ObjectInterface.UserModule;


/**
* ObjectInterface/UserModule/UserInterfaceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/User.idl
* Tuesday, November 5, 2019 11:15:28 PM ICT
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
  boolean login (String username, String password);
} // interface UserInterfaceOperations
