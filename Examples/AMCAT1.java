

class AMCAT1 
{
	public static void main(String[] args) 
	{
		int x = 5;

        int p=0;
	    int q,r;
     
    for(int i=1;i<=5;i++)
		{

		  if(i%2!=0)
			{
			  
			  for(int j=1;j<=i;j++)
				{

			     System.out.print(++p);
				 if(j<i)
					{
					 System.out.print("*");
				    }
				}
			  
		    }

			else
			
			{
               q=p+i;
			   r=q;

				for(int k=1;k<=i;k++)
				{
				  System.out.print(q);
				  q--;

				  if(k<i)
					{
					  System.out.print("*");
				  }
				}
                
               p=r;
			
			}
			System.out.println();
			
			
	    }
		

	}
}
