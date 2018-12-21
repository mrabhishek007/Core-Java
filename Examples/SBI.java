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
	    return Banking;
	  }

}

class CheckInstance
{


public  Instance() 
{
  Banking b =  SBI.getBankingInstance();
  b.accountBal();

}

}


