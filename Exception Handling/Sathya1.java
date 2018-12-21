// Illustrate the concept of recreating an object of Exception Subclass with our message.How do you recreate an object of Airthmetic Exception with our own message as "Don't enter zero for denominator"
//Sathya1.java
package sp1;
public class  Sathya1
{
	public void division(int a,int b) throws ArithmeticException
	{
		if(b==0)
		{
			ArithmeticException ae = new ArithmeticException("don't enter zero for denominater");//Recreating an object of airthmetic exception
			throw ae;
		}

		else
		{
            int c = a/b;
			System.out.println("Division in Sathya1 = "+c);
		}
	}
}
