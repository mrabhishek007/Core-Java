//Write a program to perform file extraction operation such that (output.txt = input.txt - delete.txt)

import java.io.*;

class  ExtractionDemo
{
	public static void main(String[] args) 
	{
		try
		{

		  BufferedReader bf1 = new BufferedReader(new FileReader("input.txt"));

          PrintWriter pw = new PrintWriter("output.txt");

		  String line1 = bf1.readLine();


		  while(line1!=null)
			{
			  boolean flag = false;

              BufferedReader bf2 = new BufferedReader(new FileReader("delete.txt"));

			   String target = bf2.readLine();
        
			   while(target!=null)
				{
				  
				   
				   if(line1.equals(target))
					{
                       flag = true;
					   break;
				    }
					target = bf2.readLine();
                     
			    }

				if(flag==false)
				{
				  pw.println(line1);
				}
               line1 = bf1.readLine();
		  
		    }

            if(bf1!=null)
			{
			  bf1.close();
			}

			if(pw!=null)
			{
			  pw.flush();
			  pw.close();
			}




		
		}
		catch (IOException e)
		{
			System.err.println(e);
		}


		
	}
}
