//Compute sum of two integer,two floats and two Strings using Abstract Classes
//AbstProg1.java
import java.util.Scanner;

abstract class Operations
{
	Scanner s = new Scanner(System.in);
	abstract void sum();
}//Abstract Class

class IntSum extends Operations
{
	int a,b,c;
	void sum()
	{
		System.out.println("Enter two integer values ");
		a=Integer.parseInt(s.nextLine());
		b=Integer.parseInt(s.nextLine());
		c=a+b;
		System.out.println("Int Sum=" +c);		
	}
}//IntSum-----------Concrete Implementation Class

class FloatSum extends Operations
{
	float a,b,c;
	void sum()
	{
		System.out.println("Enter two Float Values");
		a=Float.parseFloat(s.nextLine());
		b=Float.parseFloat(s.nextLine());
		c=a+b;
		System.out.println("Float sum= "+c);
	}
}//FloatSum---------Concrete Implementation Class

class StringSum extends Operations
{
	String a,b,c;
	void sum()
	{
		System.out.println("Enter two String values ");
		a=s.nextLine();
		b=s.nextLine();
		c=a+" "+b;
		System.out.println("String sum= "+c);
	}
}//StringFloat---------Concrete Implementation Class

class AbstProg1 
{
	public static void main(String[] args) 
	{
        //Operations obj = new Operations(); invalid because "Operations" is Abstract Class(Not Possible to create object of Abstract class) 
		System.out.println("w.r.t Operations----Indirect Object-----IntSum");
		Operations obj=new IntSum();//creates Indirect object for IntSum class 
		obj.sum();

		System.out.println("w.r.t Operations----Indirect Object-----FloatSum");
		obj=new FloatSum();//creates Indirect object for FloatSum Class[IntSum will be unreferenced when 'obj' contains reference of FloatSum and memory for IntSum is collected by garbage collector (Dynamic Binding Concept)]
        obj.sum();

		 System.out.println("w.r.t Operations----Indirect Object-----StringSum");
		 obj=new StringSum();
		 obj.sum();
	}
}
