//Illustrate the concept of Overriding the method of interface with Annonymous Inner Class
//IntfProg5.java

interface Shapes
{

	void draw();//treated as public abstract void draw()

}//Shapes------Functional Interface(A functional interface contain only one abstract method)


class IntfProg5
{
	public static void main(String[] args) 
	{
		Shapes obj1 = new Shapes()//A new class named "IntfProg5$1.class" is generated automatically
		{
			public void draw()
			{
				System.out.println("Drawing Rectangle using Annonymous Inner Class");
			}
		
		};
		obj1.draw();


		Shapes obj2 = new Shapes()//A new class named "IntfProg5$2.class" is generated automatically
		{
			public void draw()
			{
				System.out.println("Drawing Circle Using Annonymous Inner Classes");
			}
		};
		obj2.draw();

	}
}
