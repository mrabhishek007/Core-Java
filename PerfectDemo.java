class Perfect  
{
	int n;
	void accept(int z)
	{
		n=z;

	}//accept()
	void decide()
	{
if (n<=0)
{
	System.out.println(n +" is invalid input,plz enter +ve value");
}
else
		{
	int Sum=0;
	for(int i=1;i<=(n/2);i++)
			{
		if(n%i==0)
				{
			Sum=Sum+i;
			}
			}//for loop
			if(Sum==n)
				System.out.println(n +" is a perfect number");
			else
				System.out.println(n +" is not a perfect number");

        }//else
	}//decide()
}//Perfect-------------BLC
class PerfectDemo
{

	public static void main(String[] args) 
	{
		if(args.length!=1)
		{
			System.out.println("plz enter one value");
		}
		else
		{
			int z =Integer.parseInt(args[0]);
			Perfect PF =new Perfect();
			PF.accept(z);
			PF.decide();
		}//else
	}//main()
}//PerfectDemo------------------ELC
