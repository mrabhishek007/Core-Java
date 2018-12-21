class OverloadedConstructer 
{
int a,b;
float p,q;
double r,s;
OverloadedConstructer(int x,int y)
{
    System.out.println("This is the parameterized Constructer");
	a=x;
	b=y;
	System.out.println("Value of a is ::"+a);
	System.out.println("Value of b is ::"+b);
} //OverloadedConstructer() is A Double Parameterised Constructer
OverloadedConstructer(int x)
{
    System.out.println("This is the parameterized Constructer");
	a=x;
	b=x;
	System.out.println("Value of a is ::"+a);
	System.out.println("Value of b is ::"+b);
}//Single Parimeterized Constructer
OverloadedConstructer(float x,float y)
{
    System.out.println("This is the parameterized Constructer");
	p=x;
	q=y;
	System.out.println("Value of a is ::"+p);
	System.out.println("Value of b is ::"+q);
} //OverloadedConstructer() is A Double Parameterised Constructer with float formal parameter
OverloadedConstructer(double x,double y)
{
	r=x;
	s=y;
    System.out.println("This is the parameterized Constructer");
	
	System.out.println("Value of a is ::"+r);
	System.out.println("Value of b is ::"+s);
} //OverloadedConstructer() is A Double Parameterised Constructer with float formal parameter
} //OVERLOADED CONSTRUCTER ----------------BLC
class DemoOverloadedConstructer
{

	public static void main(String[] args) 
	{
		if (args.length!=2)
		{
			System.out.println("plz enter two double values");
		}
		else
		{
		Double x=Double.parseDouble(args[0]);
	    Double y=Double.parseDouble(args[1]);
		System.out.println("----------------------------------------------------");
		OverloadedConstructer OC1 = new OverloadedConstructer(20,30);
		System.out.println("----------------------------------------------------");
		OverloadedConstructer OC2= new OverloadedConstructer(100);
		System.out.println("----------------------------------------------------");
		OverloadedConstructer OC3= new OverloadedConstructer(10.5f,20.9f);
		System.out.println("----------------------------------------------------");
		 OverloadedConstructer OC4= new OverloadedConstructer(x,y);
        System.out.println("----------------------------------------------------");

		}//else

	}//main()
}//DemoOverloadedConstructer------------------ELC
 