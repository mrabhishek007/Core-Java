import java.util.regex.*;
class RegExpDemo3 
{
	public static void main(String[] args) 
	{

      Pattern p = Pattern.compile("\\s");  // "\\s" will search for space character
	  Matcher m = p.matcher("a7b@ zX#9");

	  while(m.find())
		{

		  System.out.println(m.start()+"----------"+m.group());
	  
	    }

	  Pattern p2 = Pattern.compile("\\S");  // "\\S" will search for  any character except space 
	  Matcher m2 = p2.matcher("a7b@ zX#9");

	  while(m2.find())
		{

		  System.out.println(m2.start()+"----------"+m2.group());
	  
	    }

	  Pattern p3 = Pattern.compile("\\d");  // "\\d" will search for any digit[0-9] 
	  Matcher m3 = p3.matcher("a7b@ zX#9");

	  while(m3.find())
		{

		  System.out.println(m3.start()+"----------"+m3.group());
	  
	    }

	  Pattern p4 = Pattern.compile("\\D");  // "\\D" will search for any character except digit[0-9] 
	  Matcher m4 = p4.matcher("a7b@ zX#9");

	  while(m4.find())
		{

		  System.out.println(m4.start()+"----------"+m4.group());
	  
	    }

	  Pattern p5 = Pattern.compile("\\w");  // "\\w" Any word character [Any Alpha numeric character] [a-zA-z0-9]
	  Matcher m5 = p5.matcher("a7b@ zX#9");

	  while(m5.find())
		{

		  System.out.println(m5.start()+"----------"+m5.group());
	  
	    }


	  Pattern p6 = Pattern.compile("\\W");  // "\\D" will search for special character [Except word charcter] 
	  Matcher m6 = p6.matcher("a7b@ zX#9");

	  while(m6.find())
		{

		  System.out.println(m6.start()+"----------"+m6.group());
	  
	    }
     
	 
	  Pattern p7 = Pattern.compile("\\.");  // "\\." will search  for any symbol including Special character also 
	  Matcher m7 = p7.matcher("a7b@ zX#9");

	  while(m7.find())
		{

		  System.out.println(m7.start()+"----------"+m7.group());
	  
	    }






	
	}
}
