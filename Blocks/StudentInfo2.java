//Illustrate the concept of instance blocks
//StudentInfo2.java


class Student
{
	int sno;
	String name;
	float marks;
	static String crs;

	{
	  System.out.println("I am from Instance block");
	  System.out.println("-------------------------");
	  sno=1;
	  name="Sathya";
	  marks=99.45f;
	  System.out.println(sno+" "+name+" "+marks+" "+crs);
	  System.out.println("----------------------------");
	}//Instance Block

  static
	{
   
      System.out.println("I am from Static Block");
	  crs="JAVA";
   
   }

}//Student--------------------BLC

class  StudentInfo2
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		Student s1 = new Student();
	}
}//StudentInfo2----------------ELC
