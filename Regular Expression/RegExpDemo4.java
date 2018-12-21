//Working with Quantifiers

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegExpDemo4 
{
	public static void main(String[] args) 
	{
       Pattern p = Pattern.compile("a");   // Exactly one 'a' 
       Matcher m = p.matcher("abaabaaab");
	   while(m.find())
		{
	      System.out.println(m.start()+"__________"+m.group());
	    }

	   Pattern p1 = Pattern.compile("a+");  // Atleast one 'a'
       Matcher m1 = p1.matcher("abaabaaab");
	   while(m1.find())
		{
	      System.out.println(m1.start()+"__________"+m1.group());
	    }


	   Pattern p2 = Pattern.compile("a?");  // Any number of a's including Zero Number also 
       Matcher m2 = p2.matcher("abaabaaab");
	   while(m2.find())
		{
	      System.out.println(m2.start()+"__________"+m2.group());
	    }

       Pattern p3 = Pattern.compile("a*"); // Atmost One a
       Matcher m3 = p3.matcher("abaabaaab");
	   while(m3.find())
		{
	      System.out.println(m3.start()+"__________"+m3.group());
	    }

	}


}
