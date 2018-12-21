import ep.Emp;
import java.util.*;
class LLDemo 
{
	public static void main(String[] args) 
	{
		Emp ep = new Emp();
		LinkedList ll = ep.getEmpDetails();
		ep.dispEmpData(ll);
	}
}
