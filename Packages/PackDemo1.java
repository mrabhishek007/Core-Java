//Illustrating Model2 of packges Concept
//PackDemo1.java
//import p1.C2;//-------Approch 1
class PackDemo1 
{
	public static void main(String[] args) 
	{
		// C2 obj = new C2(); //Approach 1 using import statement
         p1.C2 obj = new p1.C2();//Approach 2---Using fully classified names , no need to import packages
		obj.f1(); 
		obj.f2();            
		obj.f3();
	
	}
}
