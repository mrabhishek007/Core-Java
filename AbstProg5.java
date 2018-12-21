
//AbstProg5.java
abstract  class C1
{
	abstract void f1();
	abstract void f2();
}//C1--------------Abstract Base Class

abstract class C2 extends C1
{
	void f1()
	{
		System.out.println("f1() overridden in c2");
	}

	//Since f2() doesn't override in c2,hence make c2 as abstract
}//C2--------------Abstract Concrete Derived Class

class C3 extends C2
{
	void f2()
	{
		System.out.println("f2() overridden in c3");
	}

	void f1()
	{
      System.out.println("f1() overridden in c3");
	}

	void f3()
	{
		System.out.println("f3() Special in c3");
	}

}//Concrete Derived Class


class AbstProg5
{
	public static void main(String[] args) 
	{
		System.out.println("w.r.t. C3-----Concrete Derived Class--------Direct Object Creation");
		C3 o3=new C3();
		o3.f1();
		o3.f2();
		o3.f3();

		System.out.println("w.r.t. C1-----Abstract Base Class--------Indirect Object Creation");
		//C1 o1 = new C1()//invalid because Class C1 is abstract
		C1 o1 = new C3();
		o1.f1();
		o1.f2();
		//o1.f3();//invalid,because f3() doesn't exist in Class C1

		System.out.println("w.r.t. C2-----Concrete Abstract Derived Class--------Indirect Object Creation");
		//C2 o2 = new C2()//invalid because Class C2 is abstract
		C2 o2 = new C3();
		o2.f1();
		o2.f2();
		//o2.f3();////invalid,because f3() doesn't exist in Class C2

	}
}//Execution Logic Class
