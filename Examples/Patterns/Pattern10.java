class Pattern10 
{
	public static void main(String[] args) 
	{
		
      int count=0;
	  int n=7;

	  for(int i=1;i<=n;i++)
		{
             
             int temp = count;
           for(int j=1;j<=i;j++)
			{
		        System.out.print(++temp+" "); 
		    }

			 System.out.println();
	    }

		for(int i=(n-1);i>=1;i--)
		{

			int temp = count;
			for(int j=i;j>=1;j--)
			{
			  System.out.print(++temp+" ");
			}
			 System.out.println();
	
		}

	}
}
