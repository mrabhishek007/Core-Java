import java.util.* ;

class MinHealth 
{

	public static int getMin(int[] total){
	
		int curr = 0;

		while(true){

			int temp = curr;
		
			for(int i=0; i<total.length; i++){
				
				temp = temp + total[i];

				if(temp<1) {

					break;
				   }
			}

			if(temp>=1){
				break;
			}else{
				curr++ ; 
			}

		}
		
		return curr;
	
	} 



	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int max = scan.nextInt();
		int[] total = new int[max] ;

		for(int j=0; j<max; j++){
			total[j] = scan.nextInt(); 
		}

		int res = getMin(total);

		System.out.println("Min power of wiz needed : " + res);

	}
}
