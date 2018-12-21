//Calculate Area and Perimeter of different Figure Using Abstract Classes
//Abstprog2.java
import java.util.Scanner;
abstract class Figure
{
	Figure()
	{
		System.out.println("*********************************");
	}
	Scanner s = new Scanner(System.in);
	abstract void area();
	abstract void peri();
}//Abstract Class

class Circle extends Figure
{
	float r,ar,pr;

	Circle()
	{
		System.out.println("Enter Radius Of Circle");
		r=Float.parseFloat(s.nextLine());
	}

	void area()
	{
		ar=3.1417f*r*r;
	}

	void peri()
	{
		pr=2*3.1417f*r;
		disp();
	}

	void disp()
	{
     System.out.println("Area Of Circle = "+ar);
	 System.out.println("Perimeter Of Circle = "+pr);
	}
}//Circle------Concrete Implementation Class

class Rectangle extends Figure
{
	float l,b,ar,pr;
	Rectangle()
	{
		System.out.println("Enter Length and Breadth of Rectangle");
		l=Float.parseFloat(s.nextLine());
		b=Float.parseFloat(s.nextLine());
	}

	void area()
	{
		ar=l*b;
	}

	void peri()
	{
		pr=2*(l+b);
		disp();
	}

		void disp()
	{
     System.out.println("Area Of Rectangle = "+ar);
	 System.out.println("Perimeter Of Rectangle = "+pr);
	}
}//Rectangle-------Concrete Implementation Class

class Square extends Figure
{
	float n,ar,pr;
		Square()
	{
		System.out.println("Enter Side Of Square");
		n=Float.parseFloat(s.nextLine());
	}

	void area()
	{
		ar=n*n;
	}

	void peri()
	{
		pr=4*n;
		disp();
	}

	void disp()
	{
     System.out.println("Area Of Square = "+ar);
	 System.out.println("Perimeter Of Square = "+pr);
	}
}//Square-------Concrete Implementation Class

class AbstProg2 
{
	public static void main(String[] args)
	{
		System.out.println("w.r.t Figure----Indirect Object-----Circle");
		Figure obj;
		obj= new Circle();//obj is refrence of Class 'Circle' and obj is Figure type
		obj.area();
		obj.peri();
		//fo.disp()// error because disp() doesn't exist in Abstract class i.e Figure

		System.out.println("w.r.t Figure----Indirect Object-----Rectangle");
		obj= new Rectangle();//obj is refrence of  'Rectangle' and obj is Figure type
	    obj.area();
		obj.peri();
		//fo.disp() error because disp() doesn't exist in Abstract class i.e Figure
		 

        System.out.println("w.r.t Figure----Indirect Object-----Square");
		obj= new Square();//obj is refrence of 'Square' and obj is Figure type
		obj.area();
		obj.peri();
		//fo.disp() error because disp() doesn't exist in Abstract class i.e Figure
	}
}