//Illustrating the concept of inheritance
//InherDemo.java
class BaseClass
{
	int a;
	void show()
	{
		System.out.println("I am from base class ");
	}
}//BC  
class DerivedClass extends BaseClass
{
int b;
void disp()
	{
     System.out.println("I am from Derived Class");
	a=10;
	b=20;
	System.out.println("Value of a ::"+a);
	System.out.println("Value of b ::"+b);
    }
}//DC
class InherDemo
{
	public static void main(String[] args)
	{
	System.out.println("Results W.R.T Derived Class");
	DerivedClass DC = new DerivedClass(); //creating an object of Derived class which will also inherit the features of its base class
	DC.show();
	DC.disp();
	System.out.println("Results W.R.T Base Class");
    BaseClass BC = new BaseClass();
	BC.show();
	//BC.disp();---------Error because it is not available in Base Class
   }
}//InherDemo