class Ternary 
{
	public static void main(String[] args) 
	{
		int a =1655550;
		int b=5;
		int c = 5;

		int max = (a>b)?((a>c)?a:c):(b>c?b:c);
		System.out.println(max);
	}
}
