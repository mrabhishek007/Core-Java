//Selection Sort in Array
//The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning

import java.util.Scanner;

class SelectionSortDemo 
{

  public static void test()
	{



	  Scanner s = new Scanner(System.in);

	  System.out.println("Enter no. of elements in Array");

	  int a = Integer.parseInt(s.nextLine());

	  Integer x[] = new Integer[a];

	  System.out.println("Plz enter  " +a+  "  integer elements");

	  for(int r=0;r<a;r++)
		{
	      x[r] = Integer.parseInt(s.nextLine());
	    }
 
	  
           


		   //  Sorting 

	
	
	
	
		for(int i=0;i<x.length;i++)
	    {
             for(int j=i+1;j<(x.length);j++)
			 {

	           if(x[i]>x[j])
				 {
				   
			      int temp = x[j];
				  x[j]=x[i];
				  x[i]=temp;

			     }
			 
			 }
	
	    }

		for(int z :x )
		{
		System.out.print(z+",");
		}

	}


	public static void main(String[] args) 
	{
          test();

	}
}
