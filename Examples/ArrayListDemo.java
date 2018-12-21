import java.util.*;
class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("Google");
		al.add("Microsoft");
		al.add(new Integer(10));
		al.add(200.5);

		int length = al.size();
		System.out.println(length);
		for(Object o:al) //For Each loop
		{
		System.out.println(o);
		}
	}
}
