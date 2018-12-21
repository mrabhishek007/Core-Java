class A
{
    {
        System.out.println(1);
    }
}
 
//final class B extends A--------error final class doesnt participate in inheritance
class B extends A
{
    {
        System.out.println(2);
    }

	B()
	{
		System.out.println("Class B Default CONS");
	
	}
}
 
class C extends B
{
    {
        System.out.println(3);
    }

}
 class inh1
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}