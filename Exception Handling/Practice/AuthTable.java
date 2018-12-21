package org.wip;
import sathya.ampt.InvalidLoginException;
import mp.MultTable;
public class AuthTable 
{

    public void login(String un,String pwd) throws InvalidLoginException,sathya.ampt.NegValException,NumberFormatException
	{
	 if(un.equalsIgnoreCase("Sathya")&& (pwd.equals("KVRAO")))
		{
	      MultTable mt = new MultTable();
		  mt.table();
	    }
		else
		{
           InvalidLoginException ile = new InvalidLoginException("Invalid Username or password");
		   throw ile;
    	}//else
}
}
