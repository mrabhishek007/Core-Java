//Validating a mobile number

import java.util.regex.*;

class RegExpDemo7 
{
	public static void main(String[] args) 
	{
      Pattern pattern = Pattern.compile("(0|91|\\+91)?[7-9][0-9]{9}");
	  Matcher matcher = pattern.matcher(args[0]);

	  /*
	  while(matcher.find())
		{
	      //System.out.println(matcher.start()+"\n"+matcher.end()+"\n"+matcher.group());
	    }
      */
	  
      if(matcher.find()&&matcher.group().equals(args[0]))//suppose we take 8699474954x which is 11 digit no.since ,it will check the first 10digit no and it will gie valid result.so for avoiding this kind of problem we are checking that input entered is equals to output.so that it won't seperate another word from given input 
		{
	       System.out.println(matcher.group()+" is a valid Mobile No.");
	    }
		else
		{
		   System.out.println(matcher.group()+" is a invalid Mobile No.");

		}

	}
}
