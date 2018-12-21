//Illustrate the concept of Generic Class,Generic Constructer and Generic Method
//GenericConstructer.java
import java.util.Scanner;
class Test <X,Y>//X,Y are Generics Variable
{
	X a;
	Y b;
	Test()
	{
	a=null;
	b=null;
	}
	Test (X a,Y b)
	{
	this.a=a;
	this.b=b;
	}
	void set(X p,Y q)
	{
	a=p;
	b=q;
	}
	X getA()
	{
		return a;
	}
	Y getB()
	{
		return b;
	}
}//---------------------BLC

class  GenericConstructer
{
	public static void main(String[] args) 
	{

        Scanner s=new Scanner(System.in);
		Test <Integer,Float> t1=new Test<Integer,Float> (10,10.5f);
		Test <String,String> t2=new Test<String,String>();
		t2.set("Hello","java");
		Test <Character,Character> t3=new Test<Character,Character>();
		t3.set('A','B');
		Test <Boolean,Boolean> t4=new Test<Boolean,Boolean>(true,false);
		//t4.set(true,false);
		System.out.println("Enter two Double Values");
		Test <Double,Double> t5=new Test<Double,Double>(Double.parseDouble(s.nextLine()),Double.parseDouble(s.nextLine()));
		int a1=t1.getA();
		float b1=t1.getB();
		System.out.println("Val of T1----------------------------------------------------------");
		System.out.println("Val of a= "+a1);
		System.out.println("Val of b= "+b1);
		System.out.println("Val of T2-----------------------------------------------------------");
		System.out.println("Val of a="+t2.getA());
		System.out.println("Val of b="+t2.getB());
	    System.out.println("Val of T3-----------------------------------------------------------");
		System.out.println("Val of a="+t3.getA());
		System.out.println("Val of b="+t3.getB());
	    System.out.println("Val of T4-----------------------------------------------------------");
		System.out.println("Val of a="+t4.getA());
		System.out.println("Val of b="+t4.getB());	
		System.out.println("Val of T5-----------------------------------------------------------");
		System.out.println("Val of a="+t5.getA());
		System.out.println("Val of b="+t5.getB());	
	}
}//-----------------ELC
