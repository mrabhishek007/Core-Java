//Decide the output of following program
//AbstProg6.java
abstract class C1
{
	int a =100;
	C1()
	{
	System.out.println("Val of a in class C1 = "+a);
    }
}

class C2 extends C1
{
	int a=200;
	C2()
	{
	System.out.println("Val of a in class C2= "+a);
    }
}


class AbstProg6
{
	public static void main(String[] args) 
	{
		C1  o1 = new C2();// Creating Indirect Object
	    System.out.println("Val of a in main() = "+o1.a);//a=100,because Data members never participates in Polymorphism and Abstract Classes
	}
}
