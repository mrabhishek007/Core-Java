//Sum.java
package aop;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
public class Sum 
{
	 int a,b;
	public Sum()
	{
     Scanner s = new Scanner(in);
	 out.println("Enter two values");
	 a=Integer.parseInt(s.nextLine());
	 b=Integer.parseInt(s.nextLine());
	}

	public void add()
	{
		out.println(a+"+"+b+" = "+(a+b));
	}
}//SUM--------------------BLC
