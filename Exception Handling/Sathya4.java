//Write a java main program which will make use of division() of Sathya1.java
import sp1.Sathya1.java;
import java,util.Scanner;
class  Sathya4
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two integer Values");
        int x1 = Integer.parseInt(s.nextLine());
		int x2 = Integer.parseInt(s.nextLine());
		Sathya1 ss = new Sathya1();

		try
		{
           ss.display(x1,x2);//calling programmer defined common exception method
		}
			
		catch (ArithmeticException ae)
		{
            System.out.println(ae); //Output->AirthmeticException:don't enter Zero for Denominater
		}

		finally
		{
			System.out.println("I am from finally block");
		}
	}
}
