//Mod.java
package aop;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
public class Mod 
{
	double a,b;
	public Mod()
	{
     Scanner s = new Scanner(in);
	 out.println("Enter any two value ");
	 a=Double.parseDouble(s.nextLine());
	 b=Double.parseDouble(s.nextLine());
	}
	public void mod()
	{
		out.println("Modulus  = "+(a%b));
	}
}//Mod--------------------BLC
