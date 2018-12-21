class IntLargest 
{
  int a,b,c;
	  void accept(int x1,int x2,int x3)
	{
	  a=x1;
	  b=x2;
	  c=x3;
    }
  void decide()
	{
	
	  if (a>=b)
	  {
		  if (a>=c)
		  {
			  System.out.println(a+"is biggest");
		  }
		  else
		  {
			  System.out.println(c+"is biggest");
		  }
	  }
	  else 
		{
		  if (b>=c)
		  {
			  System.out.println(b+"is biggest");
		  }
			  else
			{
				  System.out.println(c+"is greatest");
			  }
	  }
		
	}
	  
    } //class IntBig -- Buisness Logic Class*/
class IntLargestDemo
{
public static void main(String[] args)
	{
	if (args.length!=3)
	{
	System.out.println("plz enter three values");
	}
	else
	{
		int x1= Integer.parseInt(args[0]);
		int x2= Integer.parseInt(args[1]);
		int x3= Integer.parseInt(args[2]);
      IntLargest IL =new IntLargest();
		  IL.accept(x1,x2,x3);
	      IL.decide();
	}//End of else statement
	}
}
