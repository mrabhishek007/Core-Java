// Illustrate the concept of throws keyword as a part of programmer defined common method.Next Prog in SathyaProg3.java
//Sathya.java
package sp;
public class Sathya
{
	public void division(String s1,String s2) throws NumberFormatException/*ReThrowing Exception */,ArithmeticException//Throwing Exception
	{
		double a=Double.parseDouble(s1);
		double b=Double.parseDouble(s2);
		double Div=a/b;
		System.out.println("Division in Sathya = "+Div);
	}
}
