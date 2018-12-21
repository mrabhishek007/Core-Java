package tp;
public interface Itest
{
	void show();//treated as public abstract void show()
	static void sDemo() // we can define static method in interface but one cannot define instance defined method
	{
		System.out.println("sDemo()----------Itest");
	}

}