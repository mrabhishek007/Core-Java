class Pattern9 
{
	public static void main(String[] args) 
	{
		int n=9;
		int count1 = 1;
		int count2=  0;

		for(int i=n;i>=1;i--)
		{
			for(int j=(i-1);j>=1;j--)
			{
				System.out.print(count1);
			}
			
			++count2;
			int temp = count2;
			

			for(int k=((n+1)-i);k>=1;k--)
			{
				
				System.out.print(temp);
				
			}
			System.out.println();
		
		}
	}
}
