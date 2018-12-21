//Illustrate the concept of default method(introduced in jdk v1.8)
//IntfProg9.java

interface Banking
{
	void openAc();//treated as public abstract void openAc()

	default void loan(int x)    //default methods are optional to override
	{
           //NULL BODY METHOD(Requirement for default method)	
	}

}

class  IntfProg9
{
	public static void main(String[] args) 
	{

		System.out.println("Account Details of cust-Sathya");
		System.out.println("-------------------------------");
		Banking B1 = new Banking() //A new class named "IntfProg9$1.class" is generated automatically
		{
			public void openAc()
			{
				System.out.println("Sathya cust opened an AC");
			}
		};//We are also using concept of Annonymous Class here
		B1.openAc();

        System.out.println("");
		System.out.println("Account Details of cust-Vikash");
		System.out.println("-------------------------------");
		Banking B2 = new Banking()//A new class named "IntfProg9$2.class" is generated automatically
		{
			public void openAc()
			{
              System.out.println("Vikash cust opened an AC");
			}

			public void loan(int u)
			{
				int amount=u;
				System.out.println("Vikash cust has taken a loan of RS - "+amount);
			}
		};
		B2.openAc();
		B2.loan(50000);
	}
}
