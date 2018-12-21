//Div.java
package aop;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
public class Div 
{
	double a,b;
	public Div()
	{
     Scanner s = new Scanner(in);
	 out.println("Enter two values");
	 a=Double.parseDouble(s.nextLine());
	 b=Double.parseDouble(s.nextLine());
	}
	public void div()
	{
		out.println(a+"/"+b+" = "+(a/b));
	}
}//Div--------------------BLC
