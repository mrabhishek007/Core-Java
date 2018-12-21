//Banking.java         [Phase 2 ---Developing a Programmer Defined Common Class]
package org.igate;
import sathya.lang.PinException;
import sathya.lang.InSuffFundsException;
public class  Banking
{
	private int bal=10000;
   public void payCash(String pinno,String wamount) throws PinException,InSuffFundsException,NumberFormatException
	{
	   int pin=Integer.parseInt(pinno);
	   int wamnt=Integer.parseInt(wamount);
      if (pin!=1212)
      {
		  PinException pe = new PinException("Invalid Pin!");
		  throw(pe);
      }
	  else
		{
		  if ((bal-wamnt)>500)
		  {
			  bal=bal-wamnt;
			  System.out.println("Collect your cash");
			  System.out.println("Remaining Balance in your Account = "+bal);
		  }
		  else
			{
			  InSuffFundsException ife = new InSuffFundsException("Insuffuciant funds to withdraw amount");
			  throw ife;
		    }//else
            
	    }//else
    }//payCash()
}//Banking.java--------------development of programmer defined common class
