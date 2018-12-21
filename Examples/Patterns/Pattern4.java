class Pattern4 
{
	public static void main(String[] args) 
	{
          int n=5;
		
		for(int i=n;i>=1;i--)
		{
			int j = (5-i);

			for(int k=1;k<=j;k++)
			{
			  System.out.print(" ");
			}
			
			for(int l=i;l>=1;l--)
			{
				if(l>1)
				{
			 System.out.print("* ");
				}
				else
				{
				System.out.print("*");
				}
			}

			System.out.println();

		}
         
	}
}
