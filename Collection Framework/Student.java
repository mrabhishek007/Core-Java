package sp;
public class Student
{
 int no;
 String name;
 float marks;
 public Student(int no,String name,float marks)
{
   this.no=no;
   this.name=name;
   this.marks=marks;
 
 }

 public void getStudDetails()
	{
      System.out.println(no + " "+name+" "+marks);
    } 
}//Student------------BLC