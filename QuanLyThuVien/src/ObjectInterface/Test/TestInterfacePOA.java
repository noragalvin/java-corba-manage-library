package ObjectInterface.Test;


/**
* ObjectInterface/Test/TestInterfacePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Module/Test.idl
* Tuesday, November 5, 2019 11:15:28 PM ICT
*/

public abstract class TestInterfacePOA extends org.omg.PortableServer.Servant
 implements ObjectInterface.Test.TestInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("test", new java.lang.Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // ObjectInterface/Test/TestInterface/test
       {
         boolean $result = false;
         $result = this.test ();
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ObjectInterface/Test/TestInterface:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public TestInterface _this() 
  {
    return TestInterfaceHelper.narrow(
    super._this_object());
  }

  public TestInterface _this(org.omg.CORBA.ORB orb) 
  {
    return TestInterfaceHelper.narrow(
    super._this_object(orb));
  }


} // class TestInterfacePOA
