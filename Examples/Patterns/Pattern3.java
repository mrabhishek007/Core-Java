class Pattern3 
{
	public static void main(String[] args) 
	{
		int n=5;

		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>1;j--)
			{
			  System.out.print(" ");
			}

			int k=(6-i);

			for(int l=1;l<=k;l++)
			{
				if(l<k)
				{
               System.out.print("* ");
				}
				else//for last element we are eleminating space
				{
				System.out.print("*");
				}
			}
			System.out.println();
		
		
		
		}
	}
}
