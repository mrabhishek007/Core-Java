//Makes use of division() of sp.Sathya class
//SathyaProg3.java
import java.util.Scanner;
import sp.Sathya;
class SathyaProg3
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any two Integer Value");
		String s1=s.nextLine(); 
		String s2=s.nextLine();
		Sathya ss = new Sathya();
		
		try
		{
			ss.division(s1,s2);
		}

		catch (NumberFormatException nfe)
		{
			System.err.println("Don't Enter Any Alfanumeric Value");
		}

		catch (ArithmeticException a)
		{
			System.err.println("Only enter Zero for Denominater");
		}

		finally
		{
			System.out.println("I am in finally bock in SathyaProg3 Class");
		}
	}
}
