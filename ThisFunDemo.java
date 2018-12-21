//Illustrate the concept of this() and this(...)
//ThisFunDemo.java
class Test
{
	int a,b;
	Test()//------------------------(3)
	{
		a=1;
		b=2;
		System.out.println("----------------------------------DC");
		System.out.println("Val of a in DC = "+a);
		System.out.println("Val of b in DC = "+b);
	}//----------------DC

		Test(int x)//----------------------(2)
	{
		this();//-----Control goes to (3)  [not optional unlike super keyword]
		a=x;
		b=x;
		System.out.println("----------------------------------SPC");
		System.out.println("Val of a in SPC = "+a);
		System.out.println("Val of b in SPC = "+b);
	}//----------------SPC



	Test(int a,int b)//----------------------(1)
	{
		this(a);//-------Control goes to (2)
		this.a=a;
		this.b=b;
		System.out.println("----------------------------------DPC");
		System.out.println("Val of a in DPC = "+a);
		System.out.println("Val of b in DPC = "+this.b);
	}//----------------DPC


}
class  ThisFunDemo
{
	public static void main(String[] args) 
	{
		Test t = new Test(10,20);//-------Control goes to (1)		
	}
}
