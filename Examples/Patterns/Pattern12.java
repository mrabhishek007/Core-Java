class Pattern12 
{
	public static void main(String[] args) 
	{
		
		int n=7;
		int count=0;
		int count1=(n-1);

		

		for(int i=n;i>=1;i--)
		{

			int temp = count;
               
            for(int k=1;k<=(n-i);k++)
			{
			  System.out.print(" ");
			}

			for(int j=i;j>=1;j--)
			{
			  System.out.print(++temp+" ");
			}

			System.out.println();
			++count;
		}

		for(int i=2;i<=n;i++)
		{
			int temp = count1; 

			for(int j=(n-i);j>=1;j--)
			{
			  System.out.print(" ");
			}

			for(int k=1;k<=i;k++)
			{
			  System.out.print(temp+" ");
			  ++temp;
			}
			System.out.println();

			--count1;
		}
	}
}
