class Test
{
	int a;
	int b;
	int c;
	Test(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
	
	}
	Test()
	{
      a=0;
	  b=0;
	  c=0;
	}

	void sum(Test x,Test y,Test z)
	{
		this.a =x.a+y.a+z.a;
		this.b =x.b + y.b + z.b;
		this.c =x.c+y.c+z.c;
	}
	Test mul(Test q,Test r)
	{
		Test temp =new Test();//cresting a temporary object
		temp.a=this.a*q.a*r.a;
		temp.b=this.b*q.b*r.b;
		temp.c=this.c*q.c*r.c;
		return temp;	
	}

	void disp()
	{
		System.out.println("Val of a="+a);
		System.out.println("Val of b="+b);
		System.out.println("Val of c="+c);
	}
}
class  OPCAirthmetic
{
	public static void main(String[] args) 
	{
		Test t1 =new Test(1,2,3);
		Test t2 =new Test(4,5,6);
		Test t3 =new Test(7,8,9);
		Test t4 =new Test();
		Test t5 =new Test();
		t4.sum(t1,t2,t3);
		System.out.println("SUM---------------------------------------------");
		t4.disp();
		t4=t1.mul(t2,t3);
		System.out.println("MUL---------------------------------------------");
		t4.disp();


	}
}
