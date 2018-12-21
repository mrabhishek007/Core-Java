//InhProgCompany.java(Using Hierarchical Inheritance)
import java.util.Scanner;
class Company
{
	String cname,cloc,coperation;
	Scanner s = new Scanner(System.in);
	void getCompanyDetails()
	{
		System.out.println("Enter Company Name ");
        cname=s.nextLine();
		System.out.println("Enter Company Location ");
		cloc=s.nextLine();
		System.out.println("Enter Company Operation ");
		coperation=s.nextLine();
    }
     void dispCompanyDetails()
	{   
		System.out.println("-------------------------------------------------------------");
		System.out.println("\t"+" \tCOMPANY  DETAILS");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Company name = "+cname);
		System.out.println("Company Loaction = "+cloc);
		System.out.println("Company Operation = "+coperation);
    }
}//Base Class

class PermanentEmployee extends Company
{
	String ename,edesig;
	int eno,bs;
	double da,ta,cca,hra,ma,lic,gpf,total;
	void getEmpDetails()
	{
      System.out.println("Enter Employee No");
	  eno=Integer.parseInt(s.nextLine());
	  System.out.println("Enter Employee Name ");
      ename=s.nextLine();
	  System.out.println("Enter Employee Designation ");
      edesig=s.nextLine();
	  System.out.println("Enter Employee Basic Salary ");
	  bs=Integer.parseInt(s.nextLine());
	}
	void calculatePay()
	{
		da=0.2*bs;
		ta=0.15*bs;
		cca=0.02*bs;
		hra=0.03*bs;
		ma=0.05*bs;
		lic=0.05*bs;
		gpf=0.02*bs;
		total=bs+da+ta+cca+hra+ma-lic-gpf;
	}
	void dispEmpDetails()
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("\t"+" \tPERMANET EMPLOYEE DETAILS");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Employee No = "+eno);
		System.out.println("Employee Name = "+ename);
		System.out.println("Employee Designation = "+edesig);
		System.out.println("-------------------------------------------------------------");
		System.out.println("\t"+" \tPAY SLIP");
        System.out.println("-------------------------------------------------------------");
		System.out.println("Employee Basic Salary = "+bs);
		System.out.println("Employee DA = "+da);
		System.out.println("Employee TA = "+ta);
		System.out.println("Employee CCA = "+cca);
		System.out.println("Employee HRA = "+hra);
		System.out.println("Employee Medical Allownce = "+ma);
		System.out.println("Employee LIC-"+lic);
		System.out.println("Employee GPF = "+gpf);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Employee Total Salary = "+total);
		System.out.println("-------------------------------------------------------------");	
	}
}//PermanentEmployee-----------------------Derived Class

class AdhocEmployee extends Company
{
	String ename;
     int eno,day;
	 double wage,total;
	 void getAdhocEmpDetails()
	{
		 System.out.println("Enter Adhoc Employee No");
		 eno=Integer.parseInt(s.nextLine());
		 System.out.println("Enter Adhoc Employee Name");
		 ename=s.nextLine();
		 System.out.println("Enter total working days of  Adhoc Employee");
		 day=Integer.parseInt(s.nextLine());
		 System.out.println("Enter Wage per day");
		 wage=Double.parseDouble(s.nextLine());	 
	}
	void dispAdhocEmpDetails()
	{
		total=wage*day;
		System.out.println("-------------------------------------------------------------");
		System.out.println("\t"+" \tADHOC EMPLOYEE DETAILS");
		System.out.println("-------------------------------------------------------------");
	    System.out.println("Adhoc Employee No = "+eno);
		System.out.println("Adhoc Employee Name = "+ename);
		System.out.println("-------------------------------------------------------------");
		System.out.println("\t"+" \tPAY SLIP");
        System.out.println("-------------------------------------------------------------");
		System.out.println("Total Working days = "+day);
		System.out.println("Wage Per Day (IN RS) = "+wage);
		System.out.println("Employee Total salary = "+total);
		System.out.println("-------------------------------------------------------------");
	}
}//AdhocEmployee----------------------------Derived Class

class InhProgCompany
{
	public static void main(String[] args) 
	{
		PermanentEmployee pe = new PermanentEmployee();
		AdhocEmployee ae = new AdhocEmployee();
        System.out.println("Enter Permanent Employee's Company Details Below :::::::");
		pe.getCompanyDetails();
		pe.getEmpDetails();
		pe.calculatePay();
		pe.dispCompanyDetails();
		pe.dispEmpDetails();
		ae.getAdhocEmpDetails();
		System.out.println("----------------------------------------------");
        System.out.println("Enter Adhoc Employee's Company Details Below ::::::::");
		System.out.println("----------------------------------------------");
		ae.getCompanyDetails();
		ae.dispCompanyDetails();
		ae.dispAdhocEmpDetails();
	}//end of main()
}//InhprogCompany----------------ELC
