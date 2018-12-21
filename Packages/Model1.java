// using all the classes of package aop in this program
//Model1.java
import aop.Sum;
import aop.Sub;
import aop.Mul;
import aop.Div;
import aop.Mod;
class Model1
{
	public static void main(String[] args) 
	{
		System.out.println("w.r.t----------------Sum");
		Sum s = new Sum();
		s.add();

		System.out.println("w.r.t----------------Sub");
		Sub ss = new Sub();
		ss.sub();

		System.out.println("w.r.t----------------Mul");
		Mul m = new Mul();
		m.mul();

		System.out.println("w.r.t----------------Div");
		Div d = new Div();
		d.div();

		System.out.println("w.r.t----------------Mod");
		Mod md = new Mod();
		md.mod();
	}
}
