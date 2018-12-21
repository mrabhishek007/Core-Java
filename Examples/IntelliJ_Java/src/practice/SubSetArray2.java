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

public class SubSetArray2 {

    private static int calcMinSubArraySum(int[] array) {

        int size = array.length;
        int subArrayMinSum = 0;

        //  3 4 2 => [3], [3,4], [3,4,2], [4], [4,2], [2]

        System.out.print("Subsets : ");

        // finding the subArray of an array

        for(int i = 0 ; i < size ; i++ )
        {

            for(int j = i ; j< size ; j++ ){

                int temp =0;
                boolean flag = false;

                System.out.print("[ ");

                for( int k = i ; k <= j ; k++ ){

                    System.out.print(array[k] + " ");

                    // finding min. element of subset

                    if(!flag){

                        temp = array[k];
                        flag =true;
                    }

                    if(temp > array[k])
                        temp = array[k];


                }
                System.out.print("] ");
                subArrayMinSum += temp;

            }
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
