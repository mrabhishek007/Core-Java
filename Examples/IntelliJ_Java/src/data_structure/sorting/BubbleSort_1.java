/*
 Bubble sort is a simple sorting algorithm. This sorting algorithm is comparison-based algorithm in which each pair
 of adjacent elements is compared and the elements are swapped if they are not in order. This algorithm is not suitable
 for large data sets as its average and worst case complexity are of Ο(n2) where n is the number of items.
*/

package data_structure.sorting;

public class BubbleSort_1 {

    private static int[] sort(int[] array) {

        // for each loop repeat biggest element will be sorted at last index of the array

        for(int lastIndex = array.length - 1; lastIndex > 0; lastIndex-- ){

            for(int i = 0; i < lastIndex; i++ ){

                if(array[i] > array[i+1]){
                    // swapping
                    int temp = array[i];
                    array[i] = array [i+1];
                    array[i+1] = temp;
                }
            }
        }
        return array;
    }

    public static  void main(String[] args){

        int array[] = { 20, -35, -15, 65, -52, 1, 25, -62 };
        int result[] = sort(array);

        for(int i : result) System.out.print(i + ", ");
    }
}
