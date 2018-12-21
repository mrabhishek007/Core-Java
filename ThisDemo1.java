//Illustrate the concept of 'this'
//ThisDemo.java
class Test
{
	int a,b;//here a and b are data members of the class
	Test(int a,int b)//here a,b are formal pararmeter
	{
	this.a=a;//this.a is data member of the class
	this.b=b;
	}
	void disp(Test x,Test y)//x,y are formal object data member of destination object
	{
		/*System.out.println("Value of a of obj t1 ="+this.a);
		System.out.println("Value of b of obj t1 ="+this.b);
		                    */
							System.out.println("Value of a of obj t1 ="+a);
							System.out.println("Value of b of obj t1 ="+b);
							
        System.out.println("Value of a of obj t2 ="+x.a);
		System.out.println("Value of b of obj t2 ="+x.b);
		System.out.println("Value of a of obj t3 ="+y.a);
		System.out.println("Value of b of obj t3 ="+y.b);
	}//end of disp()
}//end of This
class ThisDemo1
{
	public static void main(String [] args)
	{
		if (args.length!=2)
		{
			System.out.println("plz enter two valid integer values");
		}
		else
		{
Test t1 = new Test(Integer.parseInt(args[0]),Integer.parseInt(args[1]));//accpting t1 from command promt
Test t2 = new Test(10,20);
Test t3 = new Test(1,2);
t1.disp(t2,t3);//t1 is source obj and t2,t3 is destination object.so t1 is trated as data member of source obj by JVM 
		}//else
	}//end of main()
}//end of ThisDemo