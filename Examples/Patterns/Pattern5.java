class Pattern5
{
	public static void main(String[] args) 
	{
          int n=5;
		  int count=0;

		  for(int i=1;i<=n;i++)
		  {

			  for(int j=1;j<=i;j++)
			  {
				  if(j<i)
				  {
			        System.out.print(++count+" ");
				  }
				  else
				  {
			        System.out.print(++count);

				  }
			  }
			  System.out.println();
		  
		  }
		

         
	}
}
