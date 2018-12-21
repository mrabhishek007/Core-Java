//IntfProg1.java
interface I1
{
	void f1();//treated as public abstract void f1();
}

interface I2
{
	void f2();//treated as public abstract void f2();
}

class C1 implements I1,I2
{
	public void f1()//Since f1() is treated as public abstract void f1() in Interface I1.so it must be defined using public modifier
	{
		System.out.println("f1()------overridden------- Class C1");
	}

	public void f2()//Since f2() is treated as public abstract void f2() in Interface I2.so it must be defined using public modifier
	{
		System.out.println("f2()------overridden------- Class C1");
	}

     void f3()
	{
		System.out.println("f3()------special------- Class C1");
	}
}

class IntfProg1 
{
	public static void main(String[] args) 
	{
		System.out.println("w.r.t C1-----Direct Object Creation ");
		C1 o1 = new C1();
		o1.f1();
		o1.f2();
		o1.f3();

        System.out.println("w.r.t I1-----InDirect Object Creation---DB-------C1 ");
		//I1 o2 = new I1();//Invalid I1 is abstract
		I1 o2 = new C1();
		o2.f1();
		/*o2.f2();//invalid bcz f2()&f3() doesn't exist in I1
          o2.f3();
		*/

		System.out.println("w.r.t I2-----InDirect Object Creation---DB---------C1 ");
		//I2 o3 = new I2();//Invalid I2 is abstract
		I2 o3 = new C1();
		o3.f2();
		/*o3.f1();//invalid bcz f1()&f3() doesn't exist in I2
          o3.f3();
		*/

	}
}
