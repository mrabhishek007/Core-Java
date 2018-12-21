class A
{
   static void overloadedMethod(A a)
    {
        System.out.println("ONE");
    }
     
}
 
class B extends A
{
	 static void overloadedMethod(B b)
    {
        System.out.println("TWO");
    }
	  
}
 
class C extends B
{
     
}

 
public class MainClassDemo

{
	public static void main(String[] args)
    {
      C c = new C();
         
        C.overloadedMethod(c);
    }
}