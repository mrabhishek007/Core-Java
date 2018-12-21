class Pattern11 
{
	public static void main(String[] args) 
	{
		int n=7;
		int count1=0;
		int temp2=0;
		

		for(int i=1;i<=n;i++)
		{
                int temp1=count1;
				
            
			for(int j=1;j<=((i*2)-1);j++)
			{
				
				if(i>=j)
				{
			      System.out.print(++temp1 +" ");
				  temp2=temp1;
				}
				else
				{
				  
				   System.out.print(--temp2 +" ");
				}
			}

			System.out.println();
		
		}

	}
}
