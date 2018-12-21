//Illustarte the concept of throws keyword  used as part of predefined common method
//SathyaProg1.java
import java.util.Scanner;
class SathyaProg1 
{
	public static void main(String[] args) 
	{

		Scanner s= new Scanner(System.in);
		System.out.println("Enter Your Marks");
		String smarks = s.nextLine();
		
		try
		{
			int imarks=Integer.parseInt(smarks);//Coalling Predefined Common Exception Method
			System.out.println("Student Marks ="+imarks);
		}

		catch (NumberFormatException nfe)
		{
           System.err.println("Don't enter any Alfanumeric Value,enter only Integer Value");
		}

		finally
		{
			System.out.println("I am from Finally Block");
		}

	}
}
