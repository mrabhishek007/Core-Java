import java.util.Scanner;

class PerfectNo 
{
	public void checkPerfect(int number){
		
		int sum = 0;

		for(int i=1;i<=number/2;i++){
			if(number%i==0){
			   sum  = sum+i;
			  
			}
			
		}
		 if(sum==number){
			System.out.println(number +" is a perfect no");
		 }else{
		 	System.out.println(number +" is not a perfect no");

		 }


	}

   

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a no");
		int no = Integer.parseInt(s.nextLine());
		PerfectNo n = new PerfectNo();
		n.checkPerfect(no);
	}
}