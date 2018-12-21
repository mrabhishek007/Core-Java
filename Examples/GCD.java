//The HCF or GCD of two integers is the largest integer that can exactly divide both numbers (without a remainder)
import java.util.Scanner;
import java.util.Arrays;

class GCD {

	int[] numbers;
	int gcd=1;

	private void calculate(int i){
		
		// Checks if i is factor of all integers
		for(int j=0; j<numbers.length; j++){ 
		     
			if(numbers[j]%i == 0){
		
				if(j==(numbers.length-1)){
				 gcd = i;
				 break;	
				}
			}
			else
			{
			 break;
			}
		}
		
	
	}
   
	private int getGCD(int[] numbers){
		
		this.numbers=numbers;
		
		Arrays.sort(numbers);
		
		int smallest_no = numbers[0];
		
		for(int i=1; i<=smallest_no ; i++){
			
          calculate(i);
		  
		}
		
		return gcd;
	}

	public static void main(String[] args) {

		Scanner input  = new Scanner(System.in);
		
		System.out.println("How many no. you want to find GCD ?");
		int n = Integer.parseInt(input.nextLine());
		int[] numbers = new int[n];

		for(int i=0; i<n; i++){
			System.out.println("Enter "+(i+1)+" number : " );
            numbers[i] = Integer.parseInt(input.nextLine());
		}
	
		GCD obj = new GCD();
		int result = obj.getGCD(numbers);
		
		System.out.println("GCD of " + Arrays.toString(numbers) + " is : "+result);
	}
}


/*
For finding gcd of 2 numbers

public class GCD {

    public static void main(String[] args) {

        int n1 = 81, n2 = 153, gcd = 1;

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }

        System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
    }
}

*/