//SortData.java
package sp;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class SortData
{
	public ArrayList readData()
	{
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter how many no. you wants to sort");
	  int no= Integer.parseInt(s.nextLine());
	  ArrayList al = new ArrayList();
	  for(int i=1;i<=no;i++)
		{
	        System.out.println("Enter "+i+" values" );
			int x=Integer.parseInt(s.nextLine());
			al.add(x);
	        
		}//end of for loop
		return al;
	}


		public void sort(ArrayList a)
		{
		
		Collections.sort(a);
		out.println("-------------");
        out.println("ASC ORDER");
		out.println("-------------");
		ListIterator itr= a.listIterator();
		while(itr.hasNext())
			{
			Object o = itr.next();
		      out.println(o);
		   }

		out.println("-------------");
        out.println("DESC ORDER");
		out.println("-------------");

		while (itr.hasPrevious())
			{
              Object o1 = itr.previous();
			  out.println(o1);
			  }
			  /**

			  //                OR
			  
			  Object ob[] = a.toArray();
			  for(int j=ob.length-1;j>=0;j--)
			  {
			    out.println(ob[j]);
			  }
                   */
		
		
		}
	
	}

