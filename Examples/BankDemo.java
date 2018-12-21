
import static java.lang.System.out;
abstract class RBI
{
	void identity()
	{
		out.println("RBI");
	}
	abstract void interest();
}

class SBI extends RBI
{
	void identity()//overriding
	{
      out.println("BANK NAME : SBI");
	}

	void interest()//overridding
	{
      out.println("Interest is 4.5%");  
	}

	void homeLoan()
	{
		out.println("SBI provides homeLoan ");
	}
}

class HDFC extends RBI
{
		void identity()//overriding
	{
      out.println("BANK NAME : HDFC");
	}

		void interest()//overriding
	{
      out.println("Interest is 6.5%");  
	}

		void goldLoan()
	{
        out.println("SBI provides goldLoan ");
	}
}

class  BankDemo
{
	public static void main(String[] args) 
	{
		RBI r1 = new SBI();//upcasting
		r1.identity();
		r1.interest();
		SBI s1=(SBI)r1;//downcasting
		s1.homeLoan();
		RBI r2 = new HDFC();//upcasting
		HDFC h1=(HDFC)r2;//downcasting
		h1.identity();
		h1.interest();
		h1.goldLoan();

	}
}
