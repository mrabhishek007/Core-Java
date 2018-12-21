//Represent common details of banking and specific details of customers using abstract class and dynamic binding concept
//AbstProg3
import java.util.Scanner;
abstract class Bank
{
	String bname,brname;
	Scanner s = new Scanner(System.in);
	Bank()
	{
		System.out.println("Enter Bank Name ");
		bname=s.nextLine();
		System.out.println("Enter Branch Name ");
		brname=s.nextLine();
	}
	abstract void disp();
	}//Bank------Abstract Class


class Cust1 extends Bank
{
	int ano;
	float bal;
	String cname;

	Cust1()
	{
		System.out.println("Enter Customer  Name ");
		cname=s.nextLine();
		System.out.println("Enter Account Number ");
		ano=Integer.parseInt(s.nextLine());
		System.out.println("Enter Current Balance  ");
		bal=Float.parseFloat(s.nextLine());
	}

	void disp()
	{
		System.out.println(" Bank Name = "+bname);
		System.out.println(" Branch Name = "+brname);
		System.out.println(" Customer Name = "+cname);
		System.out.println(" Account Number = "+ano);
		System.out.println(" Current Balance = "+"Rs:"+bal);
	}

}//Cust1------Concrete Implementation Class

class Cust2 extends Bank
{
	int ano;
	float bal;
	String cname;

	Cust2()
	{
		System.out.println("Enter Customer  Name ");
		cname=s.nextLine();
		System.out.println("Enter Account Number ");
		ano=Integer.parseInt(s.nextLine());
		System.out.println("Enter Current Balance  ");
		bal=Float.parseFloat(s.nextLine());
	}

	void disp()
	{
		System.out.println(" Bank Name = "+bname);
		System.out.println(" Branch Name = "+brname);
		System.out.println(" Customer Name = "+cname);
		System.out.println(" Account Number = "+ano);
		System.out.println(" Current Balance = "+"Rs:"+bal);
	}

}//Cust2------Concrete Implementation Class

class AbstProg3
{
	public static void main(String[] args) 
	{
		Bank bo = new Cust1();
		bo.disp();
		bo= new Cust2();
		bo.disp();

	}
}
