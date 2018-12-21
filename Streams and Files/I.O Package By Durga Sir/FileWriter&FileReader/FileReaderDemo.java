import java.io.*;

class FileReaderDemo 
{
	public static void main(String[] args) 
	{
		int i;

		try
		{

               /**

		File f = new File("abc.txt");

		long len = f.length();
        int length = (int)len;

		FileReader fr = new FileReader(f);
        char c[] = new char[length];

		fr.read(c);//attemts to read nth character from the file into char[]  and returns number of character copied.

		for(char x:c)
		{
		  System.out.print(x);
		}

		*/


		FileReader fr = new FileReader("abc.txt");
        
		while(  (i = fr.read())!=-1  )//read next character from the file returns UNICODE value,if character not available it returns -1
		{

			System.out.print((char)i);
		
		}
		 fr.close();
		
		}

		catch (IOException e)
		{
			System.err.println(e);
		}
		

	}
}
