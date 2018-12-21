import java.util.Scanner;
class IntRowIncrement 
{
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter how many rows you want in a pattern");
		Scanner s=new Scanner(System.in);
	    n=Integer.parseInt(s.nextLine());
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(j+" ");
			}	
			System.out.println();
		}

	}
}
