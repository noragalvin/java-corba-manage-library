package MyAccount;


/**
* MyAccount/AccountOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from MyAccount/Account.idl
* Tuesday, November 5, 2019 2:49:18 PM ICT
*/

public interface AccountOperations 
{
  int accountNo ();
  void accountNo (int newAccountNo);
  void desposit (double amount);
  void withdraw (double amount);
  double reportBalance ();
} // interface AccountOperations