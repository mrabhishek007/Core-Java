interface A1 
{
  void m1();
  void m2();
}
interface A2 extends A1
{
	void m3();
}

class A3 implements A2
{
    public void m3()
	{
      System.out.println("Hello");
    }
	 public   void m2()
	{
           System.out.println("World");

    }
	 public   void m1()
	{
            System.out.println("Ameerpet");

    }


    public static void main(String[] args)
	{
		A3 obj = new A3();
	
	     obj.m3();
	}
}
