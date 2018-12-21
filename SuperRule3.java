//Illustrate the Rule3 of fig2 of Super at Constructer Level 
class BC
{
	int b;
	int a=10;
	BC()//---------------------(2)
	{
		System.out.println("Val of a -----------Base Class= "+a);
	}
}

class DC extends BC
{
	DC(int b)//--------------------(1)
	{
		//super();//optional------------------------Control goes to (2)
		this.b=b;
		System.out.println("Val of b -----------Derived Class= "+b);
	}

}
class SuperRule3
{
	public static void main(String[] args) 
	{
		DC d =new DC(100);//------------------Control goes to (1)
	}
}
