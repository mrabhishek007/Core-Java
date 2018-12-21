//Working with split();

import java.util.regex.Pattern;
import static java.lang.System.out;

class RegExpDemo5 
{
	public static void main(String[] args) 
	{

           //Splitting space character

	//Pattern p =	Pattern.compile("\\s");     //Used to seperate space character
	//Pattern p  = Pattern.compile(" ");       //Used to seperate space character(valid)
	Pattern p = Pattern.compile("[ ]");       //Used to seperate space character(valid)
    String[] s = p.split("Durgasoft Software Private Limited");

	for(String s1 :s)
		{
	      out.println(s1);
	    }


		  //Splitting .(dot) character


		//Pattern px = Pattern.compile(".");        //Can't use for seperating . symbol because . represents any symbol including special character(invalid)
		//Pattern px = Pattern.compile("\\.");     //Used for sepearting . symbol(valid)
          Pattern px =  Pattern.compile("[.]");   //Used for seperating . symbol(valid)

        String[] sx =  px.split("www.google.com");

		for(String sx1:sx)
		{
		  out.println(sx1);
		}
	
	}
}
