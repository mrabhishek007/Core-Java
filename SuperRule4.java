//Illustrate Rule 4 Of fig 2 at Super at Constructer Level
//SuperRule4.java
class BC
{
	int a;
	BC(int x)//-------------------(2)
	{
		System.out.println("BC----------------PC");
	    a=x;
		System.out.println("Val of a = "+a);
	}
}

class DC extends BC
{
	int b=45;
	DC()//---------------------------(1)
	{
		super(10);//-----Control goes to (2)
        System.out.println("Val of b = "+b);
	
	}

}

class SuperRule4 
{
	public static void main(String[] args) 
	{
		DC obj = new DC();//---control goes to (1)
	}
}
