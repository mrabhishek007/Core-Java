//C02.java
package p4;
import p1.C01;
import p2.I01;
import p3.I02;
public class C02 extends C01 implements I01,I02
{
	public void f1()
	{
		System.out.println("f1-----overridden---------C02");
	}

	public void f2()
	{
		System.out.println("f2-----overridden---------C02");
	}

	public void f3()
	{
		System.out.println("f3-----overridden---------C02");
	}

}//C02