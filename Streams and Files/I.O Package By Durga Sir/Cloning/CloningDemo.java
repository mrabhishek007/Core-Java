class CloningDemo implements Cloneable//Cloneable is a marker interface (Run-Time Exception)
{
 
   int i =20;

   int j=30;

	public static void main(String[] args) throws CloneNotSupportedException //Compile-time Exception
	{
		CloningDemo c1 = new CloningDemo();

		CloningDemo c2 = c1; //only a new refrence is created pointing to same c1 object

          c2.i = 50; //changes applying on c2 object will automatically affect on  c1 object

		System.out.println(c1.i+"_____________"+c1.j);

		CloningDemo c3 = (CloningDemo)c1.clone(); //creating an exact seperate copy of object c2

		c3.j = 100;//won't affect c1 object

		System.out.println(c3.i+"_____________"+c3.j);

		System.out.println(c1.i+"_____________"+c1.j);

	}
}
