//Validating an email_id

import java.util.regex.*;

class RegExpDemo8
{
	public static void main(String[] args) 
	{
      Pattern pattern = Pattern.compile("[a-zA-Z0-9]+[a-zA-Z0-9._]*@[a-zA-z]+([.][a-zA-z]+)+");//[a-zA-Z0-9]+ represents 1st character,[a-zA-Z0-9._]* represents remaining character
	  Matcher matcher = pattern.matcher(args[0]);

	  if(matcher.find()&&matcher.group().equals(args[0]))
		{
	       System.out.println(matcher.group()+" is a valid email");
	    }
		else
		{
	       System.out.println(matcher.group()+" is a invalid email");
		
		}
	}
}
