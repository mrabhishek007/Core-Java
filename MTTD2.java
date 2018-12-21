//Multiple use of super(),super(...) and this(),this(...)
//MTTD2.java

class BC
{

	BC()
	{
		System.out.println("BC----------------------DC");
	
	}

	BC(int x)//--------------------(3)
	{
	    System.out.println("BC----------------------PC");
	
	}
}


class DC extends BC
{
	DC()//---------------(1)
	{
		/**
		super(10);
		this(10); //ERROR  [invalid code statement,we have to learn the intension of error code and write correct code below]
		*/

        this(10);//------Control goes to (2)
		System.out.println("DC----------------------DC");
	}

	DC(int y)//----------(2)
	{
		super(10);//--------Control goes to (3)
		System.out.println("DC----------------------PC");
		}
}




class  MTTD2
{
	public static void main(String[] args) 
	{
		DC obj = new DC();//--control goes to (1)
	}
}
