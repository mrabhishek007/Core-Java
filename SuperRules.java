//Write a java program which will illustrate the 'Super' at Constructer Level Using Inheritance
//SuperRules.java
class TBC
{
	TBC()  //---------------(3)
	{
       super();//control goes to java.lang.Object
	   System.out.println("I am from Top Most Base Class");
	}
}//TBC

class IBC extends TBC
{
	IBC()  //---------------(2)
	{
		super();//Optional
		System.out.println("I am from Intermediate Base Class");
	}
}//IBC

class BDC extends IBC
{
 BDC()  //--------------------(1)
	{
	 super();//Optional
	 System.out.println("I am from Bottom most Derived Class");
    }
}//BDC

class SuperRules
{
	public static void main(String[] args)
	{
		BDC obj = new BDC();  //Control goes to (1)

	}

}





















