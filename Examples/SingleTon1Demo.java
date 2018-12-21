class Singleton1
{
public static	Singleton1 s = null;

   private Singleton1()
	{}

   public static Singleton1 getSingleton1()
	{
	   if(s==null)
		{
		   System.out.println("Singleton object created");
		   s =  new Singleton1();
		   return s;

	   }
	   else
		{
		   if(s!=null)
			{
			   System.out.println("Object is already created once");
			   
		   }
		   return s;
           
	    }
   
     }


}

class SingleTon1Demo 
{
	public static void main(String[] args) 
	{
	Singleton1 s1 =	Singleton1.getSingleton1();
	Singleton1 s2 = Singleton1.getSingleton1();
		System.out.println("BYE");
	}
}
