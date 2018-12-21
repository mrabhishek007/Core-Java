//NumGenDemo.java
class NumGen extends Thread
{

  public  void run()
   {

	   System.out.println("Name of the Fore Ground Thread = "+this.getName());
	   this.setName("Sathya");
	   System.out.println("New Name of the Fore Ground Thread  = "+this.getName());
     	 
	 try{
       for(int i=1;i<=10;i++)
		{
		   System.out.println("Value of i = "+i);
		   //Thread.sleep();
		   this.sleep(500);//500 is in millisecond //We can also write Thread.sleep bcz sleep is a static() [Thread.sleep()]
	    }    
	}

	catch(InterruptedException e)
	{
	  System.err.println("Problem in Execution...");
	}
   }
}

class NumGenDemo
{
	public static void main(String[] args) 
	{
	NumGen nn = new NumGen();
	nn.start();
	}
}