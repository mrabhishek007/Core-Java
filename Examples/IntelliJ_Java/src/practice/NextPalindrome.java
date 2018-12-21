package practice;

import java.util.Scanner;

public class NextPalindrome {

    private static int getNextPalindrome(int number) {

        int num = number+1 ;

        while(num!=0){

            int tempNum = num;
            int palindrome=0;
            int quotient=1;

            // Logic for reversing a number
            while(quotient!=0){

                quotient = tempNum/10;
                int remainder = tempNum%10;
                palindrome = palindrome*10 + remainder;
                tempNum = quotient;

            }

            if(num==palindrome) break;

            num++;
        }

        return num;
    }



    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();

        int result =  getNextPalindrome(number);
        System.out.println("Next Palindrome number : " + result);
    }

}
