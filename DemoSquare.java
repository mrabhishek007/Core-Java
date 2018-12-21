class Square
{
	int n,area;
	void accept(int x)
	{
		n=x;
	}
void cal()
	{
	area=n* n;
	}
void disp()
	{
	System.out.println("Area of Square is  :::"+area);
    }
}
class DemoSquare
{
	public static void main(String[] args)
	{

	if(args.length!=1)
	{
		System.out.println("plz enter one value");
	}
	else
	{
		int x = Integer.parseInt(args[0]);
		Square s =new Square();
		s.accept(x);
		s.cal();
		s.disp();
	}
}
}