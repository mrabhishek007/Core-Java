class Q3 
{

	{
	
	    System.out.println("Q3-----------IB-1");
	}

	static
	{
	   
	   System.out.println("Q3------------SB-1");

	}

	Q3()
	{
	   System.out.println("Q3-------------DC");
	}

	static
	{
	
	System.out.println("Q3------------SB-2"); 
	
	}

		static
	{
	
	System.out.println("Q3------------SB-3"); 
	
	}

	public static void main(String[] args) 
	{
		System.out.println("I am from main()");
		Q3 obj = new Q3();

	}

	{
	   System.out.println("Q3-----------IB-2");
	}
}
