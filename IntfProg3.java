//IntfProg3.java
interface I1
{

	void f1();//treated as public abstract void f1()

}//I1--------Base Interface


interface I2 extends I1
{
	void f2();//treated as public abstract void f2()
	
	//void f1()  logically exist bcz of inheritance
	
}//I2--------Derived Interface

abstract class C1
{

	abstract void f3();
	{
	
	}

}//Abstract Concrete Class

abstract class C2 extends C1 implements I1,I2
{
	public void f1()
	{
		System.out.println("f1----Overridden----------Class C2");
	}

    void f3()
	{
		System.out.println("f3----Overridden----------Class C2");
	}

	//public void f2()  logically exist bcz of inheritance

	//public void f2() is not defined here,Hence make Class C2 as abstract otherwise Compile time error
	
}//C2---------Abstract derived class

class C3 extends C2
{
	public void f1()
	{
		System.out.println("f1----Overridden----------Class C3");
	}

	public void f2()
	{
		System.out.println("f2----Overridden----------Class C3");
	}

	void f3()
	{
		System.out.println("f3----Overridden----------Class C3");
	}

	void f4()
	{
		System.out.println("f4-----Special----------Class C3");
	}

}//C3-------Concrete Derived Class

class IntfProg3 
{
	public static void main(String[] args) 
	{
		System.out.println("w.r.t C3-----Direct Object Creation------C3 ");
		C3 o1 = new C3();
		o1.f1();
		o1.f2();
		o1.f3();
		o1.f4();

		 System.out.println("w.r.t I1-----InDirect Object Creation--------C3 ");
		//I1 o2 = new I1();//Invalid I1 is abstract
		I1 o2 = new C3();
		o2.f1();
		/**
		o2.f2();
		o2.f3();         invalid bcz f2(),f3(),f4() doesnot exist in Interface I1
		o2.f4();
		*/

		System.out.println("w.r.t I2-----InDirect Object Creation--------C3 ");
		//I2 o3 = new I2();//Invalid I2 is abstract
		I2 o3 = new C3();
		o3.f1();
		o3.f2();
		/**
		o3.f3();
		o3.f4();          invalid bcz f3(),f4() doesnot exist in Interfacec I2
		*/

	    System.out.println("w.r.t C1-----InDirect Object Creation--------C3 ");
		//C1 o4 = new C1();//Invalid C1 is abstract
		C1 o4 = new C3();
		o4.f3();
		/**
		o4.f1();
		o4.f2();         invalid bcz f1(),f2(),f4() doesnot exist in class C1
		o4.f4();
		*/

		System.out.println("w.r.t C2-----InDirect Object Creation--------C3 ");
		//C2 o5 = new C2();//Invalid C2 is abstract
		C2 o5 = new C3();
		o5.f1();
		o5.f2();
		o5.f3();
		//o5.f4 ;        invalid bcz f4() doesnot exist in Class C2
	}
}//-----------ELC
