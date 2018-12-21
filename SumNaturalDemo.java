class SumNatural 
{
	int n;
	void accept(int z)
	{
		n=z;
	}//accept()
	void generate()
	{
		if(n<=0)
		{ 
			System.out.println(n+"  is Invalid,plz enter +ve value");
		}
		else
		{
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("First Nat Sum"+"\t\t"+"Square Sum"+"\t\t"+"Cube Sum");
			System.out.println("----------------------------------------------------------------------------");
		int nosum=0,squaresum=0,cubesum=0;
		for(int i=1;i<=n;i++)
			{
		
			System.out.println(i+"\t\t\t"+(i*i)+"\t\t\t"+(i*i*i));
			nosum=nosum+i;
			squaresum=squaresum+(i*i);
			cubesum=cubesum+(i*i*i);
			}//for
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println(nosum+"\t\t\t"+squaresum+"\t\t\t"+cubesum);
			System.out.println("------------------------------------------------------------------------------");
		}//else
	}//generate()
}//SumNatural--------------BLC
class SumNaturalDemo
{

	public static void main(String[] args) 
	{
		if(args.length!=1)
		{
			System.out.println("plz enter one value");
		}
		else
		{
			int x= Integer.parseInt(args[0]);
			SumNatural SN = new SumNatural();
			SN.accept(x);
			SN.generate();
		}//else

}//main()
}//SumNaturalDemo------ELC