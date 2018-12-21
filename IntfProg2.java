//IntfProg2.java
interface I1
{
	void f1();//treated as public abstract void f1()
}//I1-----Base Interface

interface I2 extends I1
{
	void f2();
	//void f1() is inherited logically because of inheritance
}//I2----Derived Interface

class C1 implements I2
{
	public void f1()
	{
		System.out.println("f1() overridden in Class C1");
	}

	public void f2()
	{
		System.out.println("f2() overridden in Class C1");	
	}

	void f3()
	{
		System.out.println("F3() special in Class C1");
	}
}//C1-----Concrete Class

class IntfProg2
{
	public static void main(String[] args) 
	{
		System.out.println("w.r.t C1-----Direct Object Creation ");
		C1 o1 = new C1();
		o1.f1();
		o1.f2();
		o1.f3();

		 System.out.println("w.r.t I1-----InDirect Object Creation--------C1 ");
		//I1 o2 = new I1();//Invalid I1 is abstract
		I1 o2 = new C1();
		o2.f1();
		/*o2.f2();//invalid bcz f2()&f3() doesn't exist in I1
          o2.f3();
		*/

		System.out.println("w.r.t I2-----InDirect Object Creation----------C1 ");
		//I2 o3 = new I2();//Invalid I2 is abstract
		I2 o3 = new C1();
		o3.f2();
		o3.f1();//available logically
		//o3.f3();//invalid bcz f3() doesn't exist in I2
	}
}