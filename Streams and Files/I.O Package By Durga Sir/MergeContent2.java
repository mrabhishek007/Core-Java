//Write a program to perform merge operation whrere merging should be done line by line alternatively 

import java.io.*;

class MergeContent2 
{
	public static void main(String[] args) 
	{

      try
      {
		BufferedReader br1 = new BufferedReader(new FileReader("abc1.txt"));

	    BufferedReader br2 = new BufferedReader(new FileReader("abc2.txt"));

		//PrintWriter pw = new PrintWriter("copy2.txt");//Valid

		PrintWriter pw = new PrintWriter(new FileWriter("copy2.txt",true));// Also valid bcz PrintWriter can also accept any Writer object and it will also perform append operation

		String line1 = br1.readLine();

		String line2 = br2.readLine();

		while(line1!=null || line2!=null)
		{
			if(line1!=null)
			{
			  pw.println(line1);
			}

			if(line2!=null)
			{
			  pw.println(line2);
			}

			line1 = br1.readLine();

			line2 = br2.readLine();
		  		
		}

		br1.close();
		br2.close();

		pw.flush();
		pw.close();
			
      }
    
	 catch (IOException e)
     {
		 System.err.println(e);
     }




	}
}
