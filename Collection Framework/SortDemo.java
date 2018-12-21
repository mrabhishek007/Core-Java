import sp.SortData;
import java.util.ArrayList;
class SortDemo 
{
	public static void main(String[] args) 
	{
		SortData sd = new SortData();
		ArrayList al = sd.readData();
		sd.sort(al);

	}
}
