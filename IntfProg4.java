//Illustrate the concept of implementing methods of interface with explicit implementation class 
//IntfProg4.java
interface Shapes
{

	void draw();//treated as abstract public void draw()
	
}//Shapes-----Functional Interface [introduced in jdk 1.8]

class Circle implements Shapes
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
}//circle Implementation class

class IntfProg4 extends Circle
{
	public static void main(String[] args) 
	{
		Shapes obj = new Circle();
		obj.draw();
	}
}
