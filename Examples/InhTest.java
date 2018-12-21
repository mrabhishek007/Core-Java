class A
{
	A()
	{
		System.out.println("A---------DConstructer");
	}

	void disp()
	{
		System.out.println("A---------disp");
	}
	void call()
	{
		System.out.println("A-----------call");
	}
}

class B extends A
{
	B()
	{
		super();
	}
	void call()
	{
		System.out.println("B--------call");
		disp();
		super.disp();
	}
}
class  InhTest
{
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.call();
	}
}
