// Working with String class split() and java.util.StringTokenizer class method to split a String


import java.util.StringTokenizer;

class RegExpDemo6 
{
	public static void main(String[] args) 
	{
          
		  //Splitting target String using String class split() 

		
		String s = new String("Durgasoft Software Solutions");

		//String s1[] = s.split("\\s");   //Splitting space character

	    String s1[] = s.split(" ");   //Splitting space character (also valid)

	    //String s1[] = s.split("[ ]");   //Splitting space character (also valid)


		for(String s2:s1)
		{
		  System.out.println(s2);
		}


		//Splitting target string using StringTokenizer class


		StringTokenizer st1 = new StringTokenizer("Vikash Kumar Gaurav"); // Default RegularExpresssion of StringTokenizer class is space
		while(st1.hasMoreTokens())
		{
		  System.out.println(st1.nextToken());
		}


		StringTokenizer st2 = new StringTokenizer("22-12-2018","-");
		while(st2.hasMoreTokens())
		{
		  System.out.println(st2.nextToken());
		}
		
	}
}
