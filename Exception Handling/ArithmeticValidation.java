//ArithmeticValidation.java (Common Class)
package valid.lang;
import static java.lang.System.out;
import sathya.kvrao.SathyaArithmeticException;
public class ArithmeticValidation
{
    public ArithmeticValidation(String s1,String s2) throws SathyaArithmeticException,NumberFormatException
	{
		int den=Integer.parseInt(s2);
	    if(den==0)
		{
			SathyaArithmeticException se = new SathyaArithmeticException("Invalid Denominater!");
			throw se;
		}
			else
		{
			out.println("Div of "+s1+" and "+s2+" = "+(Integer.parseInt(s1))/den);
		}
	}
}
