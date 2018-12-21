class Pattern13 
{


	public static void main(String[] args) 
	{
		int n=5;
		

		for(int i=1;i<=n;i++)
		{
			    int temp=i;
				int add_digit = (n-1);

			for(int j=1;j<=i;j++)
			{
				if(j>1)
				{
					temp = temp+add_digit;
                  System.out.print(temp+" ");
					  --add_digit ;
				}
				else
				{
				  System.out.print(temp+" ");
				  
				}

			
			}

			System.out.println();
		
		}
	

	}
}
