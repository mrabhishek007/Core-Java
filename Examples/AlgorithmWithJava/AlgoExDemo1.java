//Reversing an String

class  AlgoExDemo1
{

	public static void main(String[] args) 
	{
		String msg  ="Position 1 no. @ Durga is this.";

        int i;

         Character a[] = new Character[msg.length()];

		for(i=0;i<msg.length();i++)
		{
			a[i] = msg.charAt(i);

		}

		for(i=(msg.length()-1);i>=0;i--)
		{
           System.out.print(a[i]);
		}
	
	}
}
