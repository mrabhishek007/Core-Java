import java.util.Scanner;
class SortArray 
{
   public Array getSortArray(int no[])
   {
		for(int i=0;i<no.length;i++){
			
		}

   }

	public static void main(String[] args) 
	{
		System.out.println("Enter size of an array");
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		
		int num[] = new Array[n];

		for(int i=0;i<n;i++){
			num[i] = Integer.parseInt(s.nextLine());
		}

		SortArray sort = new SortArray();
		sort.getSortArray(num);

	}
}
