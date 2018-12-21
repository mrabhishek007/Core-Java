import java.util.ArrayList;
import java.util.Iterator;
class Gen4 
{
	ArrayList x;

  void m1(ArrayList <String> l) // It will be considered as void m1(ArrayList al) after compilation
	{
       
	   l.add("Java");
	   l.add(".net");
	   //l.add(10);//  //l.add(10) isInvalid because 10 is out of bound
	   System.out.println(l);

	   System.out.println("Elements in ArrayList are ::");
	   Iterator it = l.iterator();
       while(it.hasNext())
		{
	      System.out.println(it.next());
	    }

        x=l;
		x.add(20);//Valid because x is of ArrayList without bound type 
		x.add("Python");
		disp();

	
    }


   /**  Compile Time Error -- Both methods have same erasure(Signature) because generics executes at only compiletime not runtime.so both method will treated as m1(ArrayList al)
   
   void m1(ArrayList <Integer> l )
	{
   
   
    }


*/

    void disp()
	{
      System.out.println(x);
    }

}

class GenDemo4
{
  public static void main(String args[])
	{
      ArrayList al= new ArrayList();
	  al.add(10);
	  al.add(20.65);
	  Gen4 obj = new Gen4();
	  obj.m1(al);
   }
}
