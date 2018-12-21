package practice;

import java.util.Scanner;

public class SubString {


    private static boolean isAvailable(String str, String subStr) {

        int count=0;
        int subStrCount = 0;
        int strCount = 0;


        while ( count < subStr.length()-1 ){

            for(int i = strCount; i < str.length(); i++){

                if ( subStr.charAt(subStrCount) == str.charAt(strCount)){

                    subStrCount++ ;
                    strCount = strCount + 1;
                    break;
                }

            }

            if (subStrCount == subStr.length()-1) return true;
            count++;
        }

        return false;
    }


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        System.out.println("Enter a substring");
        String subStr = scan.nextLine();

        boolean res = isAvailable(str, subStr);
        if(!res)  {
            System.out.println(subStr + " not found in " + str);
            return;
        }
        System.out.println(subStr + " found in " + str);
    }

}
