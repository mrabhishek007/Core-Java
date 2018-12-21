//Program to show Bounded type in Generic Classes
//GenDemo2.java

import java.util.Scanner;

//class  Gen2 <T extends Number>
class  Gen2 <T extends Number & Runnable >//We can define bound type even in combination also
{ 
	T val1;
	T val2;

    Gen2(T x,T y)
	{
     val1=x;
	 val2=y;
    }

	void disp()
	{
	  
	 System.out.println("Val of val1 = "+val1);
	 System.out.println("Val of val2 = "+val2);
	 System.out.println("Addition of "+val1+" &"+val2+" = "+val1+val2);
	
	}
   
}

class GenDemo2
{

	public static void main(String[] args) 
	{

	  Scanner s = new Scanner(System.in);

	  System.out.println("Enter Integer Value");

	  int  val1=Integer.parseInt(s.nextLine());
	  int val2=Integer.parseInt(s.nextLine());
	  Gen2<Integer> o1 = new Gen2<Integer>(val1,val2);
	  o1.disp();

	 

	 // Gen2<String> o2 = new Gen2<String>("Hello","Welcome"); //CE---Type parameter java.lang.String is not within its bound
	//  o2.disp();
	  
	  
	}
}
