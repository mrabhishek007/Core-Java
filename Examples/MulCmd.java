class Mul
{
	int x , y;
	void operation (int x,int y)
	{
		this.x=x;
		this.y=y;
		System.out.println("Mul of "+this.x+" and "+this.y+" = " +(this.x*this.y));
	}
}

class MulCmd 
{
	public static void main(String[] args) 
	{
		
	   if (args.length!=2)
	   {
         System.out.println("Plz enter 2 integer value ");
	   }
	   else
		{
		   int i=Integer.parseInt(args[0]);
		   int j=Integer.parseInt(args[1]);
		   Mul obj = new Mul();
		   obj.operation(i,j);

	    }
	}
}
