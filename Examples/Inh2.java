class A
{
    String s = "Class A";
}
 
 final class B extends A
{
    String s = "Class B";
 
    {
        System.out.println(super.s);
    }
}
 
class C extends B
{
    String s = "Class C";
 
    {
        System.out.println(super.s);
		System.out.println("HELLO JAVA");

    }
}
 
public class Inh2
{
    public static void main(String[] args)
    {
        C c = new C();
 
    }
}