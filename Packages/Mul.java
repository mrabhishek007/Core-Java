//Mul.java
package aop;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
public class Mul 
{
	int a,b;
	public Mul()
	{
     Scanner s = new Scanner(in);
	 out.println("Enter two values");
	 a=Integer.parseInt(s.nextLine());
	 b=Integer.parseInt(s.nextLine());
	}
	public void mul()
	{
		out.println(a+"*"+b+" = "+(a*b));
	}
}//MUL--------------------BLC
