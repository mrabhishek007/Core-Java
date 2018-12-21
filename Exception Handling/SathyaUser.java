//SathyaUser.java
import org.wip.Auth;
import sathya.ampt.NegValException;
import sathya.ampt.InvalidLoginException;
import mp.MulTable;
import java.util.Scanner;
class SathyaUser 
{
	public static void main(String[] args) 
	{
		String uname,passw;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter username to access MulTable : ");
		uname=s.nextLine();
		System.out.println("Enter Password : ");
		passw=s.nextLine();
         try
         {
		     Auth at = new Auth(uname,passw);	
         }
         catch (NumberFormatException obj)
         {
              System.err.println("Plz enter valid Number");
         } 

         catch (NegValException obj)
         {
              System.err.println("Plz enter positive value");
         } 

         catch (InvalidLoginException obj)
         {
              System.err.println("Plz enter valid username or password");
         } 

		 catch(Exception obj)
		{
		    obj.printStackTrace();
		 }

		 finally
		{
			 System.out.println("\t\t\t\t\t\tGOOD LUCK");
		 
		}



	}
}
