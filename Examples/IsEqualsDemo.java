class IsEquals
{
	String p="Google"; 
	public  String toString()
	{
             return p;		
	}
}


class  IsEqualsDemo
{
	public static void main(String[] args) 
	{
       String s ="Google";
	   String s1="Google";
	   int a=20;
	   int b=20;
	   String s3=new String("SBS");
	   String s4=new String("SBS");
	   
         

	   if(a==b)
		{
	      System.out.println("Equals");
	   }
	   else
		{
               System.out.println("false");
	    }

	   if(s==s1)
		{
	      System.out.println("Equals");
	   }
	   else
		{
              System.out.println("false");
	    }

	   if(s3==s4)
		{
	      System.out.println("Equals");
	   }
	   else
		{
              System.out.println("false");
	    }

		IsEquals ie = new IsEquals();

	  if(ie.p==s)
		{
	      System.out.println("Equals");
	   }
	   else
		{
              System.out.println("false");
	    }




System.out.println(s3.hashCode());
System.out.println(s4.hashCode());
System.out.println(ie);

	}
}
