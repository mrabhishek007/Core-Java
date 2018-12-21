//Multiple use of this() and this(...)
//MTTD.java
class Test
{
	Test()//---------------------(1)
	{
		/*
		this(10,20);           
		this(10);//invalid code statement,we have to learn the intension of error code and write correct code below        
		*/

        this(10);//----Control goes to (2)
	    System.out.println("Test----------------DC");
	}//Test()

	Test(int x)//-------------------(2)
	{
		this(10,20);//-------Control goes to (3)
	  System.out.println("Test--------------SPC");
	
	}//SPC

	Test(int x,int y)//--------------(3)
	{
		System.out.println("Test--------------DPC");
	
	}//DPC

}//BLC

class  MTTD
{
	public static void main(String[] args) 
	{
		Test t = new Test();//--- Control goes to (1)
	}
}//ELC
