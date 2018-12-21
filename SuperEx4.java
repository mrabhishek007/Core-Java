//SuperEx4.java
class Circle
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
}

class Rect extends Circle
{
	void draw()
	{
		System.out.println("Calling-------Rect");
		super.draw();//will call draw() of circle from draw() of rect
}
}

class SuperEx4
{

	public static void main(String[] args) 
	{
		Rect r = new Rect();
		r.draw();
		
	}
}
