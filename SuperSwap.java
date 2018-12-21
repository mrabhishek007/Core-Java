import java.util.Scanner;
class IntSwap
{
	Scanner s=new Scanner(System.in);
	int a,b;
	void input()
	{
    System.out.println("Enter two Integer Values");
     a=Integer.parseInt(s.nextLine());
	 b=Integer.parseInt(s.nextLine());
	}//Input

	void swap()
	{
	System.out.println("");
	System.out.println("");
	System.out.println("Before Swap 1st int value = "+a);
    System.out.println("Before Swap 2nd int value = "+b);
	/**int temp;
	temp=a;
	a=b;
	b=temp;*/
	a=a+b;
	b=a-b;
	a=a-b;   
	System.out.println("After Swap 1st int value = "+a);
	System.out.println("After Swap 2nd int value = "+b);
	System.out.println("-----------------------------------");
	System.out.println("");
	}//swap
}//Top Base Class


class FloatSwap extends IntSwap
{
	float a,b;
	void input()
	{
	super.input();
	System.out.println("Enter two Float Values");
    a=Float.parseFloat(s.nextLine());
	b=Float.parseFloat(s.nextLine());
	}//input

   void swap()
	{
	super.swap();
	System.out.println("Before Swap 1st Float value = "+a);
    System.out.println("Before Swap 2nd Float value = "+b);
	/**Float temp;
	temp=a;
	a=b;
	b=temp;*/
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swap 1st Float value = "+a);
	System.out.println("After Swap 2nd Float value = "+b);
	System.out.println("-----------------------------------");
	System.out.println("");
	}//swap
}//Derived Class

class StringSwap extends FloatSwap
{
	String a,b;
	void input()
	{
	super.input();
    System.out.println("Enter two String Values");
	 a=s.nextLine();
	 b=s.nextLine();
	}//input

	void swap()
	{
    super.swap();
	System.out.println("Before Swap 1st String value = "+a);
    System.out.println("Before Swap 2nd String value = "+b);
	String temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println("After Swap 1st int value = "+a);
    System.out.println("After Swap 2nd int value = "+b);
	}//swap
}//Bottom most Derived Class


class  SuperSwap
{
	public static void main(String[] args) 
	{
		System.out.println("HI");
		StringSwap ss= new StringSwap();
		ss.input();
		ss.swap();
	}//end of main()
}//ELC
