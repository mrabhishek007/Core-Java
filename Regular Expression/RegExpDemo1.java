//Finding expression "ab" in target string "ababbaba"

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegExpDemo1 
{
	
	public static void main(String[] args) 
	{
		int count=0;
		Pattern p = Pattern.compile("ab");// "ab" is the expression which we want to find in the string "ababbaba"
		Matcher m = p.matcher("ababbaba");

       
		while(m.find())
		{
		  count++;

          System.out.println("Starting index:"+m.start()+" Ending index:"+(m.end()-1)+" String found:"+m.group());//m.end() will return (index+1) location

		}

		System.out.println("No. of Occurances ="+count);


	}
}
