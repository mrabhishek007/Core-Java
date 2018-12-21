//Swap two Integer Values,two Float Values,two Character values using Abstract Class
//AbstProg4.java
import java.util.Scanner;
abstract class ValueSwap
{
	Scanner s= new Scanner(System.in);
	abstract void swap();
	abstract void disp();
}


class IntSwap extends ValueSwap
{
	int a,b;
	IntSwap()
	{
	System.out.println("Enter two Integer Values");
	a=Integer.parseInt(s.nextLine());
	b=Integer.parseInt(s.nextLine());
	System.out.println("Before Swapping Val of a = "+a);
	System.out.println("Before Swapping Val of b = "+b);
	}

	void swap()
	{
		a=a+b;
		b=a-b;
		a=a-b;
	}

	void disp()
	{
		System.out.println("After Swapping Val of a = "+a);
		System.out.println("After Swapping Val of b = "+b);
	}

}

class FloatSwap extends ValueSwap
{
	float a,b;
	FloatSwap()
	{
	System.out.println("Enter two Float Values");
	a=Float.parseFloat(s.nextLine());
	b=Float.parseFloat(s.nextLine());
	System.out.println("Before Swapping Val of a = "+a);
	System.out.println("Before Swapping Val of b = "+b);
	}

	void swap()
	{
		a=a+b;
		b=a-b;
		a=a-b;
	}

	void disp()
	{
		System.out.println("After Swapping Val of a = "+a);
		System.out.println("After Swapping Val of b = "+b);
	}

}

class CharSwap extends ValueSwap
{
	char a,b,temp;
	CharSwap()
	{
	System.out.println("Enter two Char Values");
	a=s.next().charAt(0);
	b=s.next().charAt(0);
	System.out.println("Before Swapping Val of a = "+a);
	System.out.println("Before Swapping Val of b = "+b);
	}

	void swap()
	{
		temp=a;
		a=b;
		b=temp;
	}

	void disp()
	{
		System.out.println("After Swapping Val of a = "+a);
		System.out.println("After Swapping Val of b = "+b);
	}

}//CharSwap


class AbstProg4 
{
	public static void main(String[] args) 
	{
		ValueSwap obj = new IntSwap();
		obj.swap();
		obj.disp();

		obj= new FloatSwap();
		obj.swap();
		obj.disp();

		obj= new CharSwap();
		obj.swap();
		obj.disp();
	}
}
