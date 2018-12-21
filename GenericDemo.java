//GenericDemo.java
class Test<K,V>
{
	K a;
	V b;
	Test()
	{
		a=null;
		b=null;	
	}
	Test(K a,V b)
	{
		this.a=a;
		this.b=b;
	}
	void set(K x,V y)
	{
		a=x;
		b=y;
	}
	K getA()
	{
	return a ;
	}
	V getB()
	{
	return b ;
	}
	
}//Test
class  GenericDemo
{
	public static void main(String[] args) 
	{
	  Test<Integer,Boolean> t1 =new Test<Integer,Boolean> ();
	  t1.set(25,false);
	  int a=t1.getA();
	  Boolean b=t1.getB();
	  System.out.println("Val of a= "+a);
	  System.out.println("Val of b= "+b);
	}
}
