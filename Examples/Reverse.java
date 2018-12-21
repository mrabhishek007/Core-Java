import java.util.Scanner;
class Reverse 
{
	int reverse = 0;
	int number;

	public int viewReverse(int number){
		
		this.number = number;
		
		while(number!=0){
		  
		  int remainder = number%10;
		  reverse =  reverse*10 + remainder;
		  number = number/10;
		}

		return reverse ; 

	}


	public static void main(String[] args) 
	{
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter a number which you want to reverse");
		int no = Integer.parseInt(input.nextLine());
		
		
		Reverse obj = new Reverse();
		int reversedNo = obj.viewReverse(no);
		System.out.println("Reverse of " +no +" is : "+reversedNo );
		
	}
}
