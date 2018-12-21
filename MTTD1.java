//MUltiple uses of super() and super(...)
//MTTD1.java
class BC
{
	BC()//--------------(2)
	{
        this(10);//----------Control goes to (3)
		System.out.println("BC----------------DC");
	
	}

	BC(int x)//--------------(3)
	{
		System.out.println("BC----------------SPC");
	}
}


class DC extends BC
{
	DC()
	{
		System.out.println("DC----------------DC");
	
	}

	DC(int x)//----------------------(1)
	{

		/*
		super(10);
		super();//ERROR [invalid code statement,we have to learn the intension of error code and write correct code below ]
		*/

        super();//----Control goes to (2)
		System.out.println("DC----------------SPC");
	}
}

class  MTTD1
{
	public static void main(String[] args) 
	{
		DC obj = new DC(10);//----------------Control goes to (1) 
	}
}
