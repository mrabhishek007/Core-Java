//Merging the content of abc1.txt & abc2.txt and write it into a new copy.txt file

import java.io.*;

class CopyContent
{
   public static void main(String[] args)
	{
	   String line; 

	   try
	   {
		   BufferedReader br = new BufferedReader(new FileReader("abc1.txt"));//Reading data from 1st file
            
		   //PrintWriter pw =new PrintWriter(new BufferedWriter("copy.txt"));// Also valid bcz PrintWriter can also accept any Writer object

   		   PrintWriter pw =new PrintWriter(new File("copy.txt"));// Also valid bcz PrintWriter can also accept File object

              
          // PrintWriter pw = new PrintWriter("copy.txt");

              
			  while((line=br.readLine())!=null) //reading line by line
		      {
				  pw.println(line); //Writing String data line by line to copy.txt 		  
			  }

			 

            br = new BufferedReader(new FileReader("abc2.txt"));//Reading data from 2nd file

		   while((line=br.readLine())!=null)
		   {
		          pw.println(line); //Writing String data line by line to copy.txt 		  

		   }


		   br.close();

		   pw.flush();

		   pw.close();


	   }
	   catch (IOException e)
	   {
		   e.printStackTrace();
	   }
   
   
   
   
    }

}