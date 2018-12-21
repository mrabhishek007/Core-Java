import java.util.Scanner;
import java.util.ArrayList;

class HCFEXP 
{
	int x;
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

        ArrayList al1 = new ArrayList();
	    ArrayList al2 = new ArrayList();
	    ArrayList al3 = new ArrayList();


		System.out.println("Enter two integer value");

        int x = Integer.parseInt(s.nextLine());
	    int y = Integer.parseInt(s.nextLine());


        for(int i=1;i<=x;i++)
		{
			 if(x%i == 0)
			 {
				 al1.add(i);
			 }
              
		}

		for(int j=1;j<=y;j++)
		{
			if(y%j == 0)
			{
				al2.add(j);
			}
		
		}

		for(Object x1:al1)
		{
		    for(Object x2:al2)
			{
			   if((Integer)x1==(Integer)x2)
				{
				   al3.add(x1);
			   }
			}

		}

		
      for(Object o1:al3)
	  {

	     x = (Integer)o1;

	  }
	  System.out.println(x);
		
	
}
}
