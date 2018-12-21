import java.util.*;

class DuplicateRemover 
{

	public static Set<String> getSet(List<String> lists)
	{

		Set<String> set =  new HashSet<String>();

		for(String val : lists  ){
			
				set.add(val);
		}


		return set;
	}




	public static void main(String[] args) 
	{
		
		ArrayList<String> list  = new ArrayList<String> ();
		list.add("Raj");
		list.add("Sonu");
		list.add("Anu");
		list.add("Anu");

		// removing duplicates
        Set<String> set = getSet(list);

		for(String data : set ){
			System.out.print(data + " ,");
		}

  		Collections.sort(list);
 
		// Sorting the list
		for(String data : list ){
			System.out.print(data + " ,");
		}

	}
}
