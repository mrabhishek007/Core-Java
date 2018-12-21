class Check 
{
	int a()
	{
	System.out.println("This is java");
	return 1;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Check a = new Check();//a is obj here
		int w=a.a();//a() is method of Check class
		
		System.out.println(w);

	}
}
