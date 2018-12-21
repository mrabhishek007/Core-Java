//Multiply the contents of two objects where each object contain 3 integer values(Using soln 1)
//ObjMulDemo.java
import java.util.Scanner;
class ObjMul
{
	int a,b,c;
	ObjMul()
	{
		a=b=c=0;
	}
	ObjMul(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void mul(ObjMul x,ObjMul y)
	{
		this.a=x.a*y.a;
		this.b=x.b*y.b;
		this.c=x.c*y.c;
		System.out.println("HI THIS IS MUL()");
	}
	void disp()
	{
		System.out.println("Value of a ="+a);
		System.out.println("Value of b ="+b);
		System.out.println("Value of c ="+c);
	
	}//disp()
}//end of ObjMul -----------------BLC
class ObjMulDemo
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three Integer values of 1st obj ");
		int x1=Integer.parseInt(s.nextLine());
		int x2=Integer.parseInt(s.nextLine());
		int x3=Integer.parseInt(s.nextLine());
		ObjMul OM1 = new ObjMul(x1,x2,x3);
		System.out.println("Enter three Integer values of 2nd obj ");
		int x4=Integer.parseInt(s.nextLine());
		int x5=Integer.parseInt(s.nextLine());
		int x6=Integer.parseInt(s.nextLine());
		ObjMul OM2 = new ObjMul(x4,x5,x6);
		ObjMul OM3=new ObjMul();
		OM3.mul(OM1,OM2);//OM3 will act as data member of the class,so its values will be replaced wrt mul()
		System.out.println("Object1 values");
		OM1.disp();
		System.out.println("Object2 values");
		OM2.disp();
		System.out.println("Object3 Values");
		OM3.disp();


		
	}//end of main()
}//ObjMulDemo-------------------ELC
