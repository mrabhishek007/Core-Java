package mp;
import sathya.ampt.NegValException;
import java.util.Scanner;
public class MultTable 
{
	int n;
	public MultTable() throws NumberFormatException
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a no.");
		n= Integer.parseInt(s.nextLine());

	}

public void table() throws NegValException
	{
        if(n>0)
		{
        for(int i=1;i<=10;i++)
		{
		  System.out.println(n+"\t*\t"+i +"\t="+(n*i));
		}
		 System.out.println("----------------------------------------");
		}
		else
		{
		   NegValException nve = new NegValException("Invalid Input");
		    throw nve;
		}

    }//table





	


}
