//Creating a file which will write 1-10 numbers on file
//FileWriteDemo.java

import java.io.IOException;
import java.io.FileOutputStream;
import java.util.Scanner;
class FileWrite
{
	FileOutputStream fos;
    Scanner s = new Scanner(System.in);

void writeNos()
{

	//Step 1- Choose an appropriate file name

System.out.println("Enter the File Name to write 1-10 numbers");
String fname = s.nextLine();

try
{
	//Step 2- Open the file in Write Mode

 fos= new FileOutputStream(fname);//Open a new file in Write mode

 //fos= new FileOutputStream(fname,true)//Open a  existing  file in appending mode

  //fos= new FileOutputStream(fname,false)//Open a  existing file in Overlapping mode   (Default value = false i.e. Overlapping mode)

   //Step 3- Perform Cycle of Write Operations

  for(int i=1;i<=10;i++)
  {
   fos.write(i);
  }
  System.out.println("Data written to the file");
}
catch(IOException e)
	{
	System.err.println("Unable to open file in write mode");
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
    if(fos!=null)
     fos.close();
	System.out.println("File Closed");
    }
catch(Exception e)
   {
	System.err.println(e);
   }
  }//finally
 }//WriteNos
}//FileWrite----------------BLC

class FileWriteDemo
{
	public static void main(String[] args) 
	{
       FileWrite fw = new FileWrite();
	   fw.writeNos();
	}
}//FileWriteDemo-------------------ELC
