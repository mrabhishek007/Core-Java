//getting the instance of an interface 

interface Banking
{
	public abstract  void accountBal();
}

class  SBI implements Banking

{

      public  void accountBal()
	  {
	    System.out.println("I am in SBI");
	  }

	  public static SBI getBankingInstance()
	  {
	    return new SBI();
	  }

}

class CheckInstance
{


public static void main(String[] args)
{
  Banking b =  SBI.getBankingInstance();//Same way Connection interface is implemented in JDBC like Connection con = Connection.getConnection(); 
  
  b.accountBal();

}

}


