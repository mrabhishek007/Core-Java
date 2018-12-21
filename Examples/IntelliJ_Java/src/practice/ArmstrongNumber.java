/* An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the
   number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {

    private int count = 0;
    private int sum = 0;

    private int digitMultiplier(Integer digit) {
        int mul=1;
        for (int i=0;i<count;i++){
            mul = mul*digit;
        }
        return mul;
    }
    private int checkArmstrongNo(int number) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        while( number!=0){
            count++;
           int remainder =  (number%10);
           numberList.add(remainder);
           number =  number/10;
        }

        for(int i=0;i<count;i++){

            sum+= digitMultiplier(numberList.get(i));
        }
        return sum;
    }
    public static void main(String[] args){

        /* Check whether a number is armstrong number or not...???

        System.out.println("Enter any number");
        Scanner scan  = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        ArmstrongNumber obj = new ArmstrongNumber();

        int res = obj.checkArmstrongNo(number);

        if(res==number){
            System.out.println( number + " is a Armstrong number..");
        }else{
            System.out.println(number+ " is not a Armstrong number..");
        }

        */

        System.out.println("Enter how many armstrong number you want to find");
        Scanner scan  = new Scanner(System.in);
        int totalFind = Integer.parseInt(scan.nextLine());
        int found = 0;
        int digit = 1;
        while(found < totalFind){
            ArmstrongNumber obj = new ArmstrongNumber();
            int res = obj.checkArmstrongNo(digit);
            if(res == digit){
                System.out.println( found+1 + " Armstrong number = "+res);
                found++;
            }
            digit++;
        }
    }
}
