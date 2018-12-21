//Emp.java
package ep;
import java.util.*;
public class Emp
{
  public LinkedList getEmpDetails()
	{
   Scanner s = new Scanner(System.in);
   System.out.println("Enter emp number");
   int eno=Integer.parseInt(s.nextLine());
   System.out.println("Enter emp name");
   String ename=s.nextLine();
   System.out.println("Enter designation");
   String eds = s.nextLine();
   System.out.println("Enter emp Salary");
   double esal=Double.parseDouble(s.nextLine());
   //Creating 1d collection framework variable and add emp values and reurn 1d collection framework variable.
   LinkedList ll = new LinkedList();
   ll.add(eno);
   ll.add(ename);
   ll.add(eds);
   ll.add(esal);
   return ll;
  }

  public void dispEmpData(LinkedList l)
	{
       System.out.println("--------------------------------");
	   System.out.println("EMP DATA");
	   System.out.println("--------------------------------");
	   /**Using ListIterator
       ListIterator ltr = l.listIterator();
	   while(ltr.hasNext())
		{
		   Object o = ltr.next();
		   System.out.println(o);
	   
	   }*/

	   //Using public Operator toArray()
        Object[] obj =l.toArray();
		
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}
	   System.out.println("------------------------");
    }
}