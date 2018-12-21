/*
*     0! = 1
*     1! = 1 * 0!
*     2! = 2 * 1!
*     3! = 3 * 2!
*     n! = n * ( n-1 )!
*
*  */


package data_structure.recursion;

public class Factorial {

    private static int calcFact(int i) {

        if(i==0) return 1 ;

        return i * calcFact( i - 1);

    }

   public static void main(String[] args){
    int result = calcFact(5);
    System.out.println("Factorial : " + result);
   }

}
