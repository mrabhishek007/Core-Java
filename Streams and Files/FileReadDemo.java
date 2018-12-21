//Read 1-10 numbers from the file where file contains 1-10 numbers

//FileReadDemo.java
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;
class FileRead
{
    Scanner s = new Scanner(System.in);
	FileInputStream fis;
    void readNos()
	{
		try
		{

		int x;

           //Step 1- Choose an appropriate file name which you want to read

		System.out.println("Enter the file name to read 1-10 numbers");
		String fname=s.nextLine(); 


		  //Step 2- Open the file in Read Mode

		fis = new FileInputStream(fname);

		//Step 3- Perform Cycle of Write Operations


		while((x=fis.read())!=-1)
		{
		   System.out.println("\t"+ x );
		}
		}//try



		catch(FileNotFoundException fne)
		{
		System.err.println("File Doesn't exist");
		}
		catch(IOException ie)
		{
		System.err.println("Unable to read data from corrupted file");
		}
		catch(Exception e)
		{
		System.err.println(e);
		}
		finally
		{
			System.out.println("I am from finally block");
			try
			{
               if(fis!=null)
				{
             fis.close();
			System.out.println("File closed successfully");
				}	 
			}
			catch(Exception e)
			{
			System.err.println(e);
			}
		}
		
	}

}


class FileReadDemo 
{
	public static void main(String[] args) 
	{
		FileRead rf = new FileRead();
		rf.readNos();
	}
}
