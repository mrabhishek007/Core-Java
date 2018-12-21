//Illustrate Rule1 of Super at Constructer Level of fig1
//SuperRule1.java
class Base
{
 int a;
 Base() //----------------(1)
	{
		a=101;
	 System.out.println("I am from Base Class");
	 System.out.println("Value of a = "+a);
	}
}//Base Class

class InterBase extends Base
{
	int b;
	InterBase() //---------------(2)
	{
     super(); //OPTIONAL //Rule1--Control goes to (2)
	 b=202;
     System.out.println("I am from Intermediate Class");
	 System.out.println("Value of b = "+b);
	}
}//InterMediateBase Class

class Add extends InterBase

{
	Add()
	{
	super()	; //Optional ------------(3)
	System.out.println("I am from Add Class");
    int c= a+b;
	System.out.println("Value of c = "+c);
	}
}

class SuperRuleDemo 
{
	public static void main(String[] args) 
	{
		Add obj = new Add();//It will call (3) i.e. constructer of Bottom most Derived Class
		
	}
}//ELC
