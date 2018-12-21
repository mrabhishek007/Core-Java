//Validating names starts with 'l'/L   ,names starts with 'a'/'A' and ends with 'k'/'K' 

import java.util.Scanner;
import java.util.regex.*;

class RegExpDemo9
{
	public static void main(String[] args) 
	{
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter a name starts with a/A");
		String name1 = s.nextLine();


      Pattern p1 = Pattern.compile("[aA][A-Za-z]*");
	  Matcher matcher = p1.matcher(name1);

	  if(matcher.find()&&matcher.group().equals(name1))
		{
	       System.out.println(matcher.group()+" is a valid name");
	    }
		else
		{
	       System.out.println(matcher.group()+" is a invalid name");
		
		}



            
			//names starts with 'a'/'A' and ends with 'k'/'K'
	
		System.out.println("Enter a name starts with a/A and ends with K/k");
		String name2 = s.nextLine();


      Pattern p2 = Pattern.compile("[aA][A-Za-z]*[kK]");
	  Matcher matcher2 = p2.matcher(name2);

	  if(matcher2.find()&&matcher2.group().equals(name2))
		{
	       System.out.println(matcher2.group()+" is a valid name");
	    }
		else
		{
	       System.out.println(matcher2.group()+" is a invalid name");
		
		}
	}
}
