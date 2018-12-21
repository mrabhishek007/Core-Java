//Describe the output of the following 
//EX6.java
class EX6
{
	public static void main(String[] args) 
	{
		
		try
		{
		  System.out.println("SATHYA TECHNOLOGY ");
		  int a=100/0;
		  System.out.println("Div = "+a);
		}

		finally
		{
			System.out.println("I am from Finally Block");
		}
	}
}

/*

OUTPUT-----------------

SATHYA TECHNOLOGY
I am from Finally Block
Exception in thread "main" java.lang.ArithmeticException: / by zero at EX6.main(EX6.java:11)

*/

