//Explain with Communication with non-generic code
//GenDemo3.java
import java.util.ArrayList;
class Gen3 
{
   ArrayList al()
	{
	  ArrayList<String> l = new ArrayList<String>();
	  l.add("Google");
	  l.add("Microsoft");
	  l.add("Java");
	 // l.add(100);      //We can only add String because we are in Generic area  
	 System.out.println(l);
	 m1(l);
	 return(l);
    }

	void m1(ArrayList al)
	{
	 al.add(100);
	 al.add(152.26);     // We can add anything in al refrence because we are in Non-Generic Area 
     al.add(true);
	 System.out.println(al);
	}
}

class GenDemo3
{
	public static void main(String []args) 
	{
       Gen3 obj1 = new Gen3();
	   ArrayList al = obj1.al();
	   al.add(55);
	   al.add(100.30);
	   System.out.println(al);// We can add anything in al refrence because we are in Non-Generic Area 
	}

}
