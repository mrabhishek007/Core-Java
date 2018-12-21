//Illustrate the Concept of Functional Interface and Lambda Expression(introduced in JDK 1.8 onwards )
//IntfProg6.java                    

interface Shapes
{
	void draw();//treated as public abstract void draw()
}//Shape---------------Functional Interface

class IntfProg6 
{
	public static void main(String[] args) 
	{
		Shapes cs=()->{
			            System.out.println("Drawing Circle using Lambda Expression");
	};
	cs.draw();
    

	   Shapes rs=()->{
		              System.out.println("Drawing Rectangle using Lambda Expression");
	   };
       rs.draw();
	}
}
