package ObjectInterface.ReaderModule;


/**
* ObjectInterface/ReaderModule/ReaderInterfaceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Reader.idl
* Thursday, November 7, 2019 10:59:28 PM ICT
*/

public interface ReaderInterfaceOperations 
{
  int id ();
  void id (int newId);
  String readerName ();
  void readerName (String newReaderName);
  String birthday ();
  void birthday (String newBirthday);
  String address ();
  void address (String newAddress);
  String phoneNumber ();
  void phoneNumber (String newPhoneNumber);
  String email ();
  void email (String newEmail);
  ObjectInterface.ReaderModule.Reader getSingle (int id);
  ObjectInterface.ReaderModule.Reader[] list ();
  int add (ObjectInterface.ReaderModule.Reader o);
  int delete (ObjectInterface.ReaderModule.Reader o);
  int update (ObjectInterface.ReaderModule.Reader o);
} // interface ReaderInterfaceOperations
