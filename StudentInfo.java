//StudentInfo.java
import java.util.Scanner;
class Student
{
String Grade= " "  ;
int Sno,Cmarks,Cppmarks,Javamarks,Total;
float Percentage;
String Sname,Cname;
void marksReport()
	{
		Scanner s=new Scanner(System.in);

		//Validation for StudentNO
       do
       {
		   System.out.println("Enter Valid  Student no between (1-400)::::");
		  Sno=Integer.parseInt(s.nextLine());
       }
       while (Sno<=0||Sno>400);

	   //Validation for Studentname
       
		   System.out.println("Enter  Student Name ::::");
		  Sname=s.nextLine();

		  //Validation for CollegeName
       
		   System.out.println("Enter Student's College Name ::::");
		  Cname=s.nextLine();


       //Validation for C MArks
       do
       {
		   System.out.println("Enter Valid  'C' Marks  between (0-100)::::");
		 Cmarks=Integer.parseInt(s.nextLine());
       }
       while (Cmarks<0||Cmarks>100);

	   //Validation for C++ Marks
	   
	   do
	   {
		   System.out.println("Enter Valid C++ Marks between(0-100)::::");
		   Cppmarks=Integer.parseInt(s.nextLine());
	   }
	   while (Cppmarks<0||Cppmarks>100);

	   //Validation for Java Marks
	   
	   do
	   {
		   System.out.println("Enter Valid Java Marks between(0-100)::::");
		   Javamarks=Integer.parseInt(s.nextLine());
	   }
	   while (Javamarks<0||Javamarks>100);	
	}//accept()

	void  calculate()
	{
		Total=Cmarks+Cppmarks+Javamarks;
		Percentage=(Total/300f)*100;

		//Validation for Grade

		if(Cmarks<40||Cppmarks<40||Javamarks<40)
		{
		  Grade="Fail-----ALL THE BEST ";
		}
		else
		{
			if((Total>=250)&&(Total<=300))
			{
				Grade="Passed in Distinction";
			}
			if((Total<=249)&&(Total>=200))
			{
				Grade="Passed in 1st class";
			}
			if((Total<=199)&&(Total>=150))
			{
				Grade="Passed in 2nd Class";
			}
			else
			{
				if((Total<150)&&(Total>=120))
				Grade="Passed in 3rd Class";
			}
		}//else
	}//Calculate()
        
    
	void display()
	{
		System.out.println("-----------------------------------------------------------");
		System.out.println("----------------STUDENT REPORT CARD------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("SNO-"+"\t"+Sno+"\t"+"STUDENT NAME-"+"\t"+Sname);
		System.out.println("COLLEGE NAME-"+"\t"+Cname);
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		System.out.println("");
        System.out.println("\t"+"C"+"\t"+"C++"+"\t"+"Java");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("\t"+Cmarks+"\t"+Cppmarks+"\t"+Javamarks);
		System.out.println("");
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Total Marks="+Total);
		System.out.println("-----------------------------------------------------------");
		System.out.println("Percentage="+Percentage+"%");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Grade ="+Grade);
    }//display()
}//Student---------------BLC
class StudentInfo 
{

	public static void main(String[] args) 
	{
		Student S = new Student();
		S.marksReport();
		S.calculate();
		S.display();
		System.out.println("\t\t\t\t\t\t\t"+"ISSUED BY CSE DEPARTMENT");
	}
}//StudentInfo-------------------ELC
