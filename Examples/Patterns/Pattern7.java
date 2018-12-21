class Pattern7 
{
	public static void main(String[] args) 
	{
      int n = 11;

	  for(int i=n;i>=1;i--)
		{
           for(int h=i;h>=1;h--)
			{
		      System.out.print("* ");
		    }

           for(int j=1;j<=(n-i);j++)
		    {
     	     System.out.print("  ");  			  		
		    }

		    for(int j=1;j<=(n-i);j++)
		    {
     	     System.out.print("  ");    		
		    }

           for(int h=i;h>=1;h--)
		    {
		      System.out.print(" *");
		    }
		   System.out.println();

	    }


           
		 for(int i=1;i<=n;i++)
		 {
            for(int j=1;j<=i;j++)
			 {
		       System.out.print("* ");  
			 }

			 for(int k=n-i;k>=1;k--)
			 {
     	     System.out.print("  ");  
			 
			 }

			 for(int k=n-i;k>=1;k--)
			 {
     	     System.out.print("  ");   
			 }

			 for(int j=1;j<=i;j++)
			 {
		       System.out.print(" *");  
			 }

		     System.out.println();
		 }

	}

}
