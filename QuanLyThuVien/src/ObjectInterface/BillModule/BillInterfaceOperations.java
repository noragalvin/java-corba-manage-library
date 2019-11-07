package ObjectInterface.BillModule;


/**
* ObjectInterface/BillModule/BillInterfaceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Bill.idl
* Thursday, November 7, 2019 10:59:30 PM ICT
*/

public interface BillInterfaceOperations 
{
  int id ();
  void id (int newId);
  int status ();
  void status (int newStatus);
  int readerID ();
  void readerID (int newReaderID);
  String createdAt ();
  void createdAt (String newCreatedAt);
  String deadline ();
  void deadline (String newDeadline);
  ObjectInterface.BillModule.Bill getSingle (int id);
  ObjectInterface.BillModule.Bill[] list (int readerID);
  void borrowBook (int readerID, int[] bookIDs, String deadline);
  boolean payBook (int billID);
} // interface BillInterfaceOperations
