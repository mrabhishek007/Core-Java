//Illustrate Rule1 of Super at Constructer Level of fig2
//SuperRule1.java
class Base
{
 int a;
 Base() //----------------(2)
	{
		a=101;
	 System.out.println("I am from Base Class");
	 System.out.println("Value of a = "+a);
	}
}//Base Class

class Derived extends Base
{
	int b;
	Derived() //---------------(1)
	{
     super(); //OPTIONAL //Rule1--Control goes to (2)
	 b=202;
     System.out.println("I am from Derived Class");
	 System.out.println("Value of b = "+b);
	}
}//Derived Class

class SuperRule1 
{
	public static void main(String[] args) 
	{
		Derived obj = new Derived();//It will call (1) i.e. constructer of Derived Class
		
	}
}//ELC
