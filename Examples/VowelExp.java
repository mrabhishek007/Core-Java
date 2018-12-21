
//Removing Vowlel from a string

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class VowelExp 
{
	public static void main(String[] args) 
	{

		//Using Regular Expression

		/**
		
    Pattern p =  Pattern.compile("[^AEIOUaeiou]");
	Matcher m  =  p.matcher("Apple is a fruit.");


    while(m.find())
		
	{
	     System.out.print(m.group());
	}

	*/


	String s = "Apple is a fruit";
	int i;
	StringBuilder s1 = new StringBuilder();

     for(i =0;i<s.length();i++ )
		{

		 char c = s.charAt(i);
		 
	        
				 if(!(c=='a' || c=='e'||c=='i' ||c=='o'||c=='u' ||c=='A'||c=='E'||c=='I'||c=='O'||c=='U' ))
				 {

                    s1.append(c);
				 }

				

	    }

		System.out.print(s1);
}
}
