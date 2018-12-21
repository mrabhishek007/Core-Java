class Sdemo
{
	static int a=10;


	void disp1()
	{
     a=20;
     System.out.println("Val of a="+a);
	}

	void disp2()
	{
		System.out.println("Val of a is "+a);
	}
}
class StaticDemo1 
{
	public static void main(String[] args) 
	{
		Sdemo s = new Sdemo();
		Sdemo ss = new Sdemo();// Static value is independent of Object.
		s.disp1();
		ss.disp2();
	}
}
