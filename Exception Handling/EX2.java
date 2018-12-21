//Finding the details about Unknown exception using java.lang.throwable/java.lang.Exception
import java.util.Scanner;
class  EX2
{
	public static void main(String[] args) 
	{
	   
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two integer Value");

		try{
		int x = Integer.parseInt(s.nextLine());
		int y = Integer.parseInt(s.nextLine());
		int div=x/y;
		System.out.println("Div = "+div);
		}

		catch(Exception e)
		{
           System.err.println(e);//obj of Exception e Returns String value 
		}
	}
}
