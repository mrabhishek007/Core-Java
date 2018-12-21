class Pattern14 
{
	public static void main(String[] args) 
	{
		int n=10;
		int count1=1;
        
		for(int i=1;i<=n;i++)
		{
			boolean flag=false;
            int count2 = count1+i;
            
			for(int j=1;j<=i;j++,count1++)
			{
				if(flag==true)
				{
				 System.out.print("*");
				}
				flag=true;
               
			   if(i%2!=0)
				{
                  System.out.print(count1);			   
			    }

				else
				{
				 System.out.print(--count2);
				}



			}
			System.out.println();
		
		}



	}
}
