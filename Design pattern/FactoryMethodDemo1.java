//FactoryMethodDemo1.java
class Demo
{
	int y=555;
	void disp()
	{
	System.out.println("I am from Demo class");	
	}
}

class Test
{
	int x=112;
	String s="java";
private Test()
	{
	System.out.println("I am  Private Default Constructer");
    }

	static Test getObj()
	{
      Test t = new Test();
	  return t;//returning obj of Class Test 
	}

	Demo getDemoObj()
	{
	   return new Demo();
	}

}

class  FactoryMethodDemo1
{
	public static void main(String[] args) 
	{
		//Test obj = new Test();//Error because Default Constructer is Private
		Test obj = Test.getObj();//Calling Using Static Keyword
		System.out.println("Val of integer x="+obj.x);
		System.out.println("Val of String s="+obj.s);
		Demo obj1 =obj.getDemoObj();
		System.out.println("Val of Integer y in Demo class ="+obj1.y);
		
	

	}
}
