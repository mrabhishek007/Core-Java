//Sort StudentID based on their number
import java.util.*;
class  Student implements Comparable 
{
   int stno;
   String name;
   float marks;

     Student(int stno,String name,float marks)
	  {
	 
	      this.stno=stno;
		  this.name=name;
		  this.marks=marks;

	  }

	  void dispStudData()
	  {

		  System.out.println(stno+"\t"+name+"\t"+marks);
	  }

	  public int compareTo(Object obj)
	
	  {

          Student so = (Student)obj;
		 // return (this.stno-stno);

		  if (this.stno < so.stno)

		  {
		    return -1;
		  }

		else
		  {
		    if(this.stno==so.stno)
			  {
				return 0;
			}
			else
			 {
                 return 1;
		     }
	  } 

}//Compareto()
}

class StudentDataSort
{
public static void main(String[] args)
	
{
   Student s1 = new Student(6,"Vijay",67.89f);
   Student s2 = new Student(7,"Vinay",48.65f);
   Student s3 = new Student(8,"Raj",87.29f);
   Student s4 = new Student(10,"Vikash",72.65f);
   Student s5 = new Student(9,"Abhi",84.21f);
   Student s6 = new Student(7,"Raushan",68.85f);


   ArrayList al = new ArrayList();
	   al.add(s1);
       al.add(s2);
	   al.add(s3);
	   al.add(s4);
	   al.add(s5);
	   al.add(s6);

	   System.out.println("Original Objects Data");
	   System.out.println("------------------------------------");
	   Iterator itr = al.iterator();
	   while(itr.hasNext())
	   {
           Object o = itr.next();
		   Student sd = (Student)o;
	       sd.dispStudData();

	   }

	   Collections.sort(al);
	   System.out.println("------------------------------------");
	   System.out.println("Sorting Object Data Based on the Name of the Student");
	   System.out.println("------------------------------------");
	   	   Iterator itr1 = al.iterator();
	   while(itr1.hasNext())
	   {
           Object o = itr1.next();
		   Student sd = (Student)o;
	       sd.dispStudData();
	   } 
}

}
