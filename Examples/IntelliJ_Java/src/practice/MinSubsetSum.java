/*
Finding sum of min element of subset in an array

Sample Input 1:

3
3 4 2

Sample Output 1:

18

Explanation:

Subarrays will be: [3], [3,4], [3,2], [3,4,2], [4], [4,2], [2]
Minimum number in each subarray will be: 3, 3, 3, 2, 4, 2, 2
Sum of minimum numbers: 18

*/


package practice;

import java.util.Scanner;

public class MinSubsetSum {

    private static int calcMinSubArraySum(int[] array) {

        int size = array.length;
        int subArrayMinSum = 0;

        System.out.print("Subset : ");

        // finding the subset of an array
        for(int i = 0 ; i < (1 << size ); i++ )    //  1 << size = 2^size where '<<' is a left-shift operator
        {

            System.out.print("{");

            boolean flag = false;
            int temp = 0;

            for(int j = 0 ; j < size; j++){

                //  Print current subset
                if( (i & 1 << j) > 0){    //  '&' bitwise 'And' operator

                    if(!flag){
                        temp = array[j] ;
                        flag =true;
                    }

                    // finding the min. element on the subset
                    if( temp > array[j] )
                        temp = array[j];

                    System.out.print(array[j]+ " ");
                }
            }

            // System.out.print("Min element : " + temp);
            subArrayMinSum += temp;
            System.out.print("}, ");

        }

        return subArrayMinSum;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter array size : ");
        int n = scan.nextInt();
        int[] array = new int[n];

        for(int i = 0 ; i<n ; i++){
            System.out.println(i+1 + " element : ");
            array[i] = scan.nextInt();
        }

        int subArrayMinSum = calcMinSubArraySum(array);
        System.out.println("Min. SubArray Sum = " + subArrayMinSum);
    }
}
