//Finding the details about Unknown exception using "printStackTrace()"[Recommended]

class  EX3
{
	public static void main(String[] args) 
	{
        String s1=args[0];
		String s2=args[1];
		try{
		int x = Integer.parseInt(s1);
		int y = Integer.parseInt(s2);
		int div=x/y;
		System.out.println("Div = "+div);
		}

		catch(Exception e)
		{
			//System.err.println(e.printStackTrace()); // error because printStackTrace returns void,so we can't use printStackTrace using System.err.println(e.printStackTrace)
           e.printStackTrace();
		}
	}
}
