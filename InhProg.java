//InhProg.java(Using Multilevel Inheritance)
import java.util.Scanner;
class Univ
{
 Scanner s = new Scanner(System.in); 
 String uname,uloc;
 void getUnivDetails()
	{
       System.out.println("Enter University Name");
	   uname=s.nextLine();
       System.out.println("Enter University Location");
	   uloc=s.nextLine();
    }
	void dispUnivDetails()
	{
	System.out.println("------------------------------");
	System.out.println("/t"+"University Details");
	System.out.println("------------------------------");
	System.out.println("University Name - "+uname);
	System.out.println("University Location - "+uloc);
	System.out.println("------------------------------");
	}
}//Univ----------------------BASE CLASS

class College extends Univ
{
	String cname,cloc;
	void getCollegeDetails()
	{
       System.out.println("Enter College Name");
	   cname=s.nextLine();
       System.out.println("Enter College Location");
	   cloc=s.nextLine();
    }
	void dispCollegeDetails()
	{
	System.out.println("/t"+"College Details");
	System.out.println("------------------------------");
	System.out.println("College Name - "+cname);
	System.out.println("College Location - "+cloc);
	System.out.println("------------------------------");
	}
}//College--------------------------Intermediate Class

class Student extends College
{
    String sname,course;
	int sno;
	void getStudentDetails()
	{
	   System.out.println("Enter Student ID");
	   sno=Integer.parseInt(s.nextLine());
       System.out.println("Enter Student Name");
	   sname=s.nextLine();
	   System.out.println("Enter course name");
	   course=s.nextLine();
    }
	void dispStudentDetails()
	{
	System.out.println("/t"+"Student Details");
	System.out.println("------------------------------");
	System.out.println("Student ID is - "+sno);
	System.out.println("Student Name - "+sname);
	System.out.println("Course Nmae - "+course);
	System.out.println("------------------------------");
	}
}//Student-----------------------------Derived Class
class InhProg
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.getUnivDetails();
		s.getCollegeDetails();
		s.getStudentDetails();
		s.dispStudentDetails();
		s.dispCollegeDetails();
		s.dispUnivDetails();
	}
}//-----------------------ELC

	
