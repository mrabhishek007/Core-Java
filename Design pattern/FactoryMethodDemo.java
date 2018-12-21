//FactoryMethodDemo.java

dghdhdh=00;
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
	  return t;
	}

}

class  FactoryMethodDemo
{
	public static void main(String[] args) 
	{
		//Test obj = new Test();//Error because Default Constructer is Private
		Test obj = Test.getObj();//Calling Using Static Keyword
		System.out.println("Val of integer x="+obj.x);
		System.out.println("Val of String s="+obj.s);

	}
}
