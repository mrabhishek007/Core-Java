//Illustrate the concept of Null Body methods of Abstract concrete Class
//AbstProg7.java
abstract class Parent
{
	void demo()
	{
         //null body method	
	}
}//Parent------Abstract Concrete Class
 class Child extends Parent
 {
	 void demo()
	 {
		 System.out.println("Going to Java Classes");
	 }
 } //Child-----Implementation Class of parent 

class  AbstProg7
{
	public static void main(String[] args) 
	{
		System.out.println("w.r.t Parent--Abstract Concrete Class-----Direct Object Creation");
		//Parent p = new Parent();//------invalid,because Parent is Abstract Concrete Class
		System.out.println("w.r.t Child--Abstract Concrete Class-----Direct Object Creation");
		Parent p1=new Child();
		p1.demo();
	}
}
