class Pattern6 
{
	static int n=10;

	public static void main(String[] args) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* " );

				
			}
			System.out.println();

		}



		for(int i=(n-1);i>=1;i--)
		{

			for(int j=1;j<=n;j++)
			{
              System.out.print(" ");
			}

			for(int k=i;k>=1;k--)
			{
				System.out.print("* " );
			
			}

			System.out.println();
		
		
		}

		
       





	}
}
