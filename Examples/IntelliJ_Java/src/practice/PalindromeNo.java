/* A palindromic number or numeral palindrome is a number that remains the same when its digits are reversed.Ex:16461,121 */

import java.util.Scanner;

public class PalindromeNo {

    private int isNoPalindrome(int number) {
        int length_count=0;
        int temp = number;
        int reverse_no = 0;

        //finding the length of a number
        while (temp!=0){
            temp /= 10;
            length_count++;
        }

        //reversing a number
        while (number!=0){
           int remainder = number%10;
           reverse_no = reverse_no*10 + remainder;
           number = number/10;
        }
        return reverse_no;
    }

    public static void main(String[] args){
        System.out.println("Enter a Number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        PalindromeNo palindromeNo = new PalindromeNo();
        int res = palindromeNo.isNoPalindrome(number);
        if(res==number){
            System.out.println(number + " is a pelindrome number");
        }else{
            System.out.println(number + " is not a pelindrome number");
        }
    }


}
