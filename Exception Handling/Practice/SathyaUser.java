import org.wip.AuthTable;
import sathya.ampt.InvalidLoginException;
import mp.MultTable;
import sathya.ampt.NegValException;
import java.util.Scanner;
class SathyaUser 
{

	
  
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Username and Password");
		String uname= s.nextLine();
		String password=s.nextLine();

        AuthTable at = new AuthTable();
		try
		{
		
		at.login(uname,password);

		}
		catch(InvalidLoginException ile )
		{
			System.err.println("Plz enter valid username and password");
		}
		catch(NegValException nve)
		{
		   System.err.println("Plz enter +ve val for MultTable");
		}
		catch(NumberFormatException nfe )
		{
		   System.err.println("Don't enter ANV for integer");
		}
		catch(Exception e )
		{
		   e.printStackTrace();
		}


	}
}
