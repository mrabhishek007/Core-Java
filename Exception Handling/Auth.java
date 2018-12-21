//Auth.java
package org.wip;
import sathya.ampt.NegValException;
import sathya.ampt.InvalidLoginException;
import mp.MulTable;
import java.util.Scanner;
public class Auth
{
String ouname="Java";
String password="Sathya";
public Auth(String uname,String pwd) throws NumberFormatException,InvalidLoginException,NegValException
	{

	if((ouname.equalsIgnoreCase(uname)) && password.equals(pwd) )
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any integer");
		String x =s.nextLine();
		MulTable mt = new MulTable(x);

	}
	else
	{
		InvalidLoginException ile = new InvalidLoginException("Login Denied");
		throw ile;

	}


}


}