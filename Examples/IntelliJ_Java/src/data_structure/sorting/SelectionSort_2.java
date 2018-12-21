/*      [ Performs Better than Bubble sort bcz it requires less swapping **time-complexity - o(n2)**]

Selection sort is a simple sorting algorithm. This sorting algorithm is an in-place comparison-based algorithm in
which the list is divided into two parts, the sorted part at the left end and the unsorted part at the right end.
Initially, the sorted part is empty and the unsorted part is the entire list. The smallest element / largest element is selected from
the unsorted array and swapped with the leftmost/ rightmost element, and that element becomes a part of the sorted array. This
process continues moving unsorted array boundary by one element to the right. This algorithm is not suitable for
large data sets as its average and worst case complexities are of Ο(n2), where n is the number of items.

*/

package data_structure.sorting;

public class SelectionSort_2 {

    private static int[] sort(int[] array) {

        // for each loop repeat biggest element and remembering the position of the biggest element and swapping the biggest element at the end of each iteration of loop

        for(int lastIndex = array.length - 1; lastIndex > 0; lastIndex-- ){

            int largest=0;

            for(int i = 1; i <= lastIndex; i++ ){

                // capturing the index of largest element
                if(array[i] > array[largest]){
                    largest = i;
                }
            }
            // swapping largest element value at the end of array before next iteration
            int temp = array[lastIndex];
            array[lastIndex] = array[largest];
            array[largest] = temp;
        }
        return array;
    }

    public static  void main(String[] args){

        int array[] = { 20, -35, -15, 65, -52, 1, 25, -62 };
        int result[] = sort(array);

        for(int i : result) System.out.print(i + ", ");
    }
}
