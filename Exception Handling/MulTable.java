//MulTable .java
package mp;
import sathya.ampt.NegValException;
import sathya.ampt.InvalidLoginException;
public class MulTable 
{
   public MulTable(String num) throws NumberFormatException,NegValException
	{
	   int n=Integer.parseInt(num);
      if(n>0)
		{
		  System.out.println("");
		  System.out.println("Table of "+n+"---------------------------------");
		  System.out.println("");
		  for(int i=1;i<=10;i++)
			{
                System.out.println(n+" * "+i+" = "+(n*i));
		    }
	  
	    }
		else
			{
			NegValException nve = new NegValException("-(ve) Val Not Allowed");
			throw nve;
		}
   }

}
