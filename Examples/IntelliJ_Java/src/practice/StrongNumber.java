// Strong numbers are the numbers whose sum of factorial of digits is equal to original number. Ex : 145 = 1!+4!+5! = 145


import java.util.Scanner;

public class StrongNumber {
    int sum=0;
    private int getFactorial(int number){

        // return factorial of a number
        if(number>1){
            int fact=1;
            while ( number>1 ){
                fact = number*fact;
                number-- ;
            }
            return fact;
        }
        return number;
    }

    private int isStrongNumber(int number) {
        while(number!=0){
           int rem =  number%10 ;
           sum+= getFactorial(rem);
           number = number/10;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args){

        System.out.println("Enter a number : ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        StrongNumber strongNumber = new StrongNumber();
        int result = strongNumber.isStrongNumber(number);
        if(result==number)
            System.out.println(number + " is a strong number");
        else
            System.out.println(number + " is a not a strong number");
    }
}
