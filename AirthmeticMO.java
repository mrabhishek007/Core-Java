//Calculate Different types of airthmetic operator using Method OverRidding
//airthmeticMO.java
import java.util.Scanner;
class Add
{
	int a;
	int b;
	void calculate(int a,int b)
	{
		System.out.println("calculate() ---------------  Add");
		this.a=a;
		this.b=b;
        System.out.println("Sum = "+ (this.a+this.b));
	}

}

class Sub extends Add 
{
	void calculate(int a,int b)
	{
        super.calculate(a,b);//Will call calculate() of Add Class
		System.out.println("calculate() ---------------  Sub ");
		this.a=a;
		this.b=b;
        System.out.println("Sub = "+(this.a-this.b));
	}

}

class Mul extends Sub
{
	void calculate(int a,int b)
	{
        super.calculate(a,b);//Will call calculate() of Sub Class
		System.out.println("calculate() ---------------  Mul");
		this.a=a;
		this.b=b;
        System.out.println("Mul = "+(this.a*this.b));
	}

}

class Div extends Mul 
{
  void calculate(int a,int b)
	{
        super.calculate(a,b);//Will call calculate() of Mul Class 
		System.out.println("calculate() ---------------  Div ");
		this.a=a;
		this.b=b;
		double d=((double)this.a/(double)this.b);
        System.out.println("Division = " +d);
	}
}

class AirthmeticMO
{
	public static void main(String[] args)
	{
		Div d =new Div();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two integer values ");
		int x=Integer.parseInt(s.nextLine());
		int y=Integer.parseInt(s.nextLine());
		d.calculate(x,y);

	
	}
}





























