package ObjectInterface.User;


/**
* ObjectInterface/User/UserInterfaceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Interface/User.idl
* Tuesday, November 5, 2019 4:34:50 PM ICT
*/

public interface UserInterfaceOperations 
{
  String username ();
  void username (String newUsername);
  String password ();
  void password (String newPassword);
  org.omg.CORBA.Object login (String username, String password);
} // interface UserInterfaceOperations