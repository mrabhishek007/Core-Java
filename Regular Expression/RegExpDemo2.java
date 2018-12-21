import java.util.regex.*;
class  RegExpDemo2
{
	public static void main(String[] args) 
	{
	  Pattern p1 = 	Pattern.compile("[abc]");   // [abc] is pattern which searches for either a or b or c in target String 
	  Matcher m1 = p1.matcher("a7b@zX#9");    // "a7b@zX#9" is target string

	  while(m1.find())
		{
		   
		   System.out.println("Starting index : "+m1.start()+",String found : "+m1.group());
	  
	    }

        
		Pattern p2 = Pattern.compile("[^abc]");   // Except a,b,c 
	    Matcher m2 = p2.matcher("a7b@zX#9");

	    while(m2.find())
		{
		   
		   System.out.println("Starting index : "+m2.start()+", String found : "+m2.group());
	    }

	   
		Pattern p3 = Pattern.compile("[a-z]");   //Any lower case Alphabet Symbol 
	    Matcher m3 = p3.matcher("a7b@zX#9");

	    while(m3.find())
		{
		   
		   System.out.println("Starting index : "+m3.start()+", String found : "+m3.group());
	  
	    }

		Pattern p4 = Pattern.compile("[A-Z]");   //Any upper case Alphabet Symbol 
	    Matcher m4 = p4.matcher("a7b@zX#9");

	    while(m4.find())
		{
		   
		   System.out.println("Starting index : "+m4.start()+", String found : "+m4.group());
	  
	    }

		Pattern p5 = Pattern.compile("[0-9]");   //Any Digit from 0-9
	    Matcher m5 = p5.matcher("a7b@zX#9");

	    while(m5.find())
		{
		   
		   System.out.println("Starting index : "+m5.start()+", String found : "+m5.group());
	  
	    }

		Pattern p6 = Pattern.compile("[a-zA-Z]");   //Any  Alphabet Symbol 
	    Matcher m6 = p6.matcher("a7b@zX#9");

	    while(m6.find())
		{
		   
		   System.out.println("Starting index : "+m6.start()+", String found : "+m6.group());
	    }

	    Pattern p7 = Pattern.compile("[a-zA-Z0-9]");   //Any  AlphaNumeric Symbol 
	    Matcher m7 = p7.matcher("a7b@zX#9");

	    while(m7.find())
		{
		   
		   System.out.println("Starting index : "+m7.start()+", String found : "+m7.group());
	    }


	    Pattern p8 = Pattern.compile("[^a-zA-Z0-9]");   //Except  AlphaNumeric Symbol 
	    Matcher m8 = p8.matcher("a7b@zX#9");

	    while(m8.find())
		{
		   
		   System.out.println("Starting index : "+m8.start()+", String found : "+m8.group());
	    }
		



	}
}
