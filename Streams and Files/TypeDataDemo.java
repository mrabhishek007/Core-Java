//Write a java program which will display the content of the file  OR Implement the type command of dos
//TypeDataDemo.java
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import static java.lang.System.out;
class TypeData
{
    
	FileReader fr;
	int x;
	Scanner s = new Scanner(System.in);
  void dispData()
	{
      out.println("Eneter the file which you want to read");
	  String fname = s.nextLine();
      
	  try
	  {

	  fr = new FileReader(fname);  //Character stream(Reading 2 byte at a time)
       
	   while((x=fr.read()) != -1)
		{
		   char c =(char)x;
	       out.print(c);
	    }
	  }
	  catch(java.io.FileNotFoundException fne)
		{
	      System.err.println("File doesnot exist");
	    }
		catch(IOException io)
		{
		  System.err.println("Unable to Read Data from currupted file");
		}
		catch(Exception e)
		{
		System.err.println(e);
		}
        
        finally
		{
		try
		  {
		  if(fr!=null)
		  {
		   fr.close();
		  }
		  }catch(Exception e)
			{
			  System.err.println(e);
		    }
		}//finally
     }//dispData 
}//TypeData-------------------BLC

class TypeDataDemo 
{
	public static void main(String[] args) 
	{
		TypeData td = new TypeData();
		td.dispData();
	}
}//TypeDataDemo----------------ELC
