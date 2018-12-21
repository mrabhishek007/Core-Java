import java.io.FileWriter;
import java.io.IOException;

class FileWriter1
{
  void write() 
	{
	  try
	   {
         FileWriter fw = new FileWriter("abc.txt");  //  Will override the existing file,if available otherwise it will create a new one.
    
	   // FileWriter fw = new FileWriter("abc.txt",true);  //  Will perform append operation on the existing file if available,otherwise it will create a new one.
   
        fw.write(100); //  adding a single character which is 'd'(ASCII of 100 is 'd')
	
	    fw.write("urgasoft\nsolutions");// adding string 

	    fw.write('\n');//adding single character

	    char[] ch1 = {'a','b','c'};

        fw.write(ch1);// adding a array of character

	    fw.flush();

	    fw.close();
	  }
	   catch (IOException e)
	   {
        System.err.println(e);
	   }

	}

}

class FileWriterDemo
{
	public static void main(String[] args) 
	{
	  FileWriter1 filewriter1 = new FileWriter1();
	  filewriter1.write();	  
	
	}

}