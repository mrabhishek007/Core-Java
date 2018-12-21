class  DesignDemo
{
	public static void main(String[] args) 
	{
		int n=5;
		int j;
		System.out.println("-----------------------------------");
		for(int i=0;i<5;i++)
		{
			System.out.println("");
			for(j=0;j<=i;j++)
			{
			  
		       System.out.print("*");

			}

			for(int k=n;k>0;k--)
			{
			  System.out.print("\t");
			}
			for(int l=0;l<=i;l++)
			{
			  System.out.print("*");
			}

		}




	}
}
