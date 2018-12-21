//EX1.java
class EX1
{
	public static void main(String[] args) 
	{
      try
      {
		int x = Integer.parseInt(args[0]);//taking command line arguments from cmd
		int y = Integer.parseInt(args[1]);
		int Div=x/y;
		System.out.println("Div of "+x+ " and "+y+ " = "+Div);
      }

	  catch(NumberFormatException nfe)
	  {
		  System.err.println("Don't enter AlfaNumeric Valuue;Only integer value alllowed");
	  }

	   catch (ArrayIndexOutOfBoundsException aoe )
      {
		  System.err.println("plz enter valid input");
      }

      catch (ArithmeticException ae )
      {
		  System.err.println("plz enter valid denomenator other than zero");
      }

	  finally
		{
		  System.out.println("I am from Finally block");
	  }
	}
}
