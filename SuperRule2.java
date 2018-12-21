//Illustrate the concept of Constructers Rule2 from fig 2
//SuperRule2.java
class BC
{
	int a;
	BC(int a)//----------------------------------(1)
	{
		System.out.println("Base-----------------PC");
		this.a=a;
		System.out.println("Val of a in BC = " +this.a);
	}
}

class DC extends BC
{
	int b;
	DC(int x,int b)//----------------------------(2)
	{
		super(x);//------------- Control goes to (1)
		System.out.println("Derived-----------------PC");
		this.b=b;
		System.out.println("Val of b in DC= "+this.b);
	
	}
}

class SuperRule2
{
	public static void main(String[] args) 
	{
		DC obj =new DC(20,30);
	}
}
