//Phase 3-------------Development of Programmer Defined Exception
//SathyaCust.java
import sathya.lang.PinException;
import sathya.lang.InSuffFundsException;
import org.igate.Banking;
import java.util.Scanner;
public class SathyaCust
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Plz enter your PIN ");
		String pin=s.nextLine();
		System.out.println("Plz enter Amount You Want To Withdraw ");
		String wamount=s.nextLine();
		Banking b = new Banking();

		try
		{
		b.payCash(pin,wamount);
		}

		/**catch(PinException ee)
		{
			System.err.println("Pin entered by user is incorrect");
		}***/

		catch(InSuffFundsException ee)
		{
			System.err.println("Insufficient funds,plz enter less amount");
		}

		catch(NumberFormatException ee)
		{
			System.err.println("Don't enter AlanumericValue for PIN/Wamount ");
		}

		catch(Exception ee)
		{
			System.err.println(ee);
		}

		finally
		{
			System.out.println("I am from finally block!");
		}

	}
}