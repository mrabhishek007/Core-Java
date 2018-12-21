class  BubbleSortDemo
{
	//Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order
  
  
  public static void bubbleSort()
	{

      int start=0; 
       int x[] = {26,45,78,0,3,87,49};
	   int n = x.length;

	   for(int i=0;i<(n-1);i++)//swapping will be (n-1) times
		{
		   for(int j=start+1;j<n;j++)
			{
			   if(x[start]>x[j])
				{
				   int temp = x[j];
				   x[j] = x[start];
				   x[start] = temp;
				   ++start;
			   
			    }
				else
				{
				 ++start;
				}
		    }

			start = 0;
   
	    }


       System.out.print("[");
		for(int z:x)
		{
		  System.out.print(z+",");
		}
		System.out.println("]");

  
    }



	public static void main(String[] args) 
	{
		bubbleSort();

	}
}
