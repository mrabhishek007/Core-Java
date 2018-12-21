//Sub.java
package aop;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
public class Sub 
{
	int a,b;
	public Sub()
	{
     Scanner s = new Scanner(in);
	 out.println("Enter two values");
	 a=Integer.parseInt(s.nextLine());
	 b=Integer.parseInt(s.nextLine());
	}
	public void sub()
	{
		out.println(a+"-"+b+" = "+(a-b));
	}
}//SUB--------------------BLC
