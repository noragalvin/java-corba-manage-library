package ObjectInterface.BillModule;


/**
* ObjectInterface/BillModule/Bill.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Bill.idl
* Friday, November 15, 2019 3:32:32 PM ICT
*/

public final class Bill implements org.omg.CORBA.portable.IDLEntity
{
  public int id = (int)0;
  public int status = (int)0;
  public int readerID = (int)0;
  public String createdAt = null;
  public String deadline = null;
  public String readerName = null;
  public String bookName = null;

  public Bill ()
  {
  } // ctor

  public Bill (int _id, int _status, int _readerID, String _createdAt, String _deadline, String _readerName, String _bookName)
  {
    id = _id;
    status = _status;
    readerID = _readerID;
    createdAt = _createdAt;
    deadline = _deadline;
    readerName = _readerName;
    bookName = _bookName;
  } // ctor

} // class Bill
