//ObjMulDemo1.java
import java.util.Scanner;
class ObjMul1
{
	int a,b,c;
	ObjMul1()
	{
		a=b=c=0;
	}
	ObjMul1(int x,int y,int z)
	{
		this.a=x;//a=x;
		this.b=y;//b=y;
		this.c=z;//c=z;
	}
	ObjMul1 mul(ObjMul1 t)
	{
	ObjMul1 om4 = new ObjMul1();//WE ARE CREATING A TEMP  OBJECT
	om4.a=this.a*t.a;//we know that obj.datamember will point data member of the class.so om4.a will give value of a
	om4.b=this.b*t.b;
	om4.c=this.c*t.c;
	System.out.println("mul() is executing");
	return om4;//Returning value of a,b,c after multiplying to om3 in main()
	}//end of ObjMul()
void disp()
	{
		System.out.println("Value of a ="+a);
		System.out.println("Value of b ="+b);
		System.out.println("Value of c ="+c);	
	}//disp()
}//ObjMul1------------------------------------BLC

class  ObjMulDemo1
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three interger value for obj1");
		int x1=Integer.parseInt(s.nextLine());
		int x2=Integer.parseInt(s.nextLine());
		int x3=Integer.parseInt(s.nextLine());
		ObjMul1 om1 = new ObjMul1(x1,x2,x3);
		System.out.println("Enter three interger value for obj2");
		int x4=Integer.parseInt(s.nextLine());
		int x5=Integer.parseInt(s.nextLine());
		int x6=Integer.parseInt(s.nextLine());
		ObjMul1 om2 = new ObjMul1(x4,x5,x6);
		ObjMul1 om3 = new ObjMul1();
		om3=om2.mul(om1);
		System.out.println("Object1 values");
		om1.disp();
		System.out.println("Object2 values");
		om2.disp();
		System.out.println("Object3 Values");
		om3.disp();
	}
}//ObjMulDemo1------------------------------------ELC
