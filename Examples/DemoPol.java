class A
{

	void m1()
	{
	}
	static void test()
	{
		System.out.println("I am a staic method in A");
	}
}

class B extends A
{
	void m1()
	{
		System.out.println("I am non-static method in class B");
	}
	 static void testB()
	{
		System.out.println("I am a staic method in B");
	}
	
}
class DemoPol 
{
	public static void main(String[] args) 
	{
		System.out.println("w.r.t Inheritance");
		A.test();//Using current class name accessing test() because it is static
		B o = new B();
		B.test();//using derived class name accessing test() because of static nature
        System.out.println("----------------------------");
        System.out.println("w.r.t Dynamic Binding");
		A o1 = new B();
		o1.test();
		o1.m1();

		
	}

}
