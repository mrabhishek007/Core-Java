//illustrate the concept of multicatch exception handling block
//EX5.java
class EX5 
{
	public static void main(String[] args) 
	{
		try
		{
			String s1=args[0];
			String s2=args[1];
			int x =Integer.parseInt(s1);
			int y =Integer.parseInt(s2);
			int div=x/y;
			System.out.println("Div = "+div);
		}

		catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException ab)
		{
           System.err.println("Plz enter two integer Value from Command Prompt.......\n");
		   System.err.println("Don't enter Alfanumeric Value/Strings/SpecialSymbol\n");
		   System.err.println("Don't enter Zero as denominater\n");
		}
         
		 finally
		{
			 System.out.println("I am from finally Block");
		}

	}
}
