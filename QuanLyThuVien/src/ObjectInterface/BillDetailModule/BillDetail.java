package ObjectInterface.BillDetailModule;


/**
* ObjectInterface/BillDetailModule/BillDetail.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/BillDetail.idl
* Thursday, December 5, 2019 9:25:25 PM ICT
*/

public final class BillDetail implements org.omg.CORBA.portable.IDLEntity
{
  public int billID = (int)0;
  public int bookID = (int)0;
  public int borrowAmount = (int)0;
  public int status = (int)0;

  public BillDetail ()
  {
  } // ctor

  public BillDetail (int _billID, int _bookID, int _borrowAmount, int _status)
  {
    billID = _billID;
    bookID = _bookID;
    borrowAmount = _borrowAmount;
    status = _status;
  } // ctor

} // class BillDetail
