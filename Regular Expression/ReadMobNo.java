//Program to seperate email and mobile no from a txt file and displaying itin a txt file

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.*;

class ReadMobNo  
{
	public static void main(String[] args) 
	{
		     StringBuilder sb = new StringBuilder();
			 int x;
			 FileInputStream fis=null;
			 FileOutputStream fos=null;
		try
		{
	
		fis = new FileInputStream("input.txt");
		while((x=fis.read())!=-1)
		{
			sb.append((char)x);
		}
			
		}
		catch (FileNotFoundException e)
		{
			System.err.println("File not found");
		}
		catch(IOException e)
		{
		  System.out.println("Corrupted file");
		}
		finally
		{
			try
			{
			if(fis!=null)
			{
			  fis.close();
			}
				
			}
			catch (Exception e)
			{
				System.err.println(e);
			}
		}

		Pattern p = Pattern.compile("((0|91|\\+91)?[7-9][0-9]{9})|([A-Za-z0-9][a-zA-z0-9._]*@[a-zA-z]+([.][a-zA-z]+)+)");//email and mobile no is filtered
		Matcher m = p.matcher(sb);

				String mob = "";

		while(m.find())
		{
          mob = mob + (m.group()+"\n");
		}

		try
		{
			fos = new FileOutputStream("output.txt");

             for(int i=0;i<mob.length();i++)
			 {
				 fos.write(mob.charAt(i));
			 }
            
		
			
		}
		catch (IOException e)
		{
			System.err.println("Unable to open file in write mode");
		}
		catch(Exception e)
		{
		  e.printStackTrace();
		}
		finally
		{
			try
			{
			if(fos!=null)
			{
			  fos.close();
			}	
			}
			catch ( Exception e)
			{
				System.out.println(e);
			}
	
		
		}

	}
}
