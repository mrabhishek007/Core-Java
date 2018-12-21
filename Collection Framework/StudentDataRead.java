//StudentDataRead.java
package sdr;
import java.util.*;
import sp.Student;
public class StudentDataRead
{
  public void readStudData(ArrayList al)
	{
	  ListIterator ltr =al.listIterator();
	  while(ltr.hasNext())
		{
		  Object obj = ltr.next();
		//  System.out.println(obj);   --Get hashcode of Student objs
		  Student st = (Student)obj;
		  st.getStudDetails();
	  }
  }
}