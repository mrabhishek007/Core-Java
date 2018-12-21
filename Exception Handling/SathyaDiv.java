//SathyaDiv.java
import valid.lang.ArithmeticValidation;
import sathya.kvrao.SathyaArithmeticException;
import java.util.Scanner;

class SathyaDiv
{
	public static void main(String[] args)

	{
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter two values");
      String s1 = s.nextLine();
	  String s2= s.nextLine();
	  try
		{
          ArithmeticValidation av =new ArithmeticValidation(s1,s2);
		}
		catch(SathyaArithmeticException obj)
		{
           System.err.println("Don't enter Zero for Denominater");
		}
         catch(NumberFormatException obj)
		{
		 System.err.println("Plz don't enter string values");
		}
		catch(Exception obj)
		{
          System.err.println(obj);
		}
		finally
		{
		   System.out.println("\t\t\t\t\t\t\t\t\t\tGOOD LUCK!");
		}
	}
}
