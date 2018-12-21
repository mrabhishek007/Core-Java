/*           [ Time complexity - О(n2) ]

 Insertion sort is based on the idea that one element from the input elements is consumed in each iteration to find
 its correct position i.e, the position to which it belongs in a sorted array.It iterates the input elements by
 growing the sorted array at each iteration. It compares the current element with the largest value in the sorted
 array. If the current element is greater, then it leaves the element in its place and moves on to the next element
 else it finds its correct position in the sorted array and moves it to that position. This is done by shifting all
 the elements, which are larger than the current element, in the sorted array to one position ahead
*/

package data_structure.sorting;

public class InsertionSort_3 {

/*    private static int[] sort(int[] array) {

        // for each iteration picking an element(firstUnsortedIndex) from current position & comparing it with previous sorted elements to find its correct position

        for( int firstUnsortedIndex = 1; firstUnsortedIndex < array.length ; firstUnsortedIndex++ ){

            int currentElement = array[firstUnsortedIndex];

            int i ;

            for(i = firstUnsortedIndex; i > 0 && array[i - 1] > currentElement ; i-- ){

                array[i] = array[ i - 1];
            }
            //  when correct position found setting current element on that correct position
            array[i] = currentElement;

        }

        return array;
    }  */

    private static int[] sort(int[] array) {

        // for each iteration picking an element(firstUnsortedIndex) from current position & comparing it with previous sorted elements to find its correct position

        for(int i = 1 ; i< array.length; i++ ){

            for(int j = i-1 ;  j >= 0 && array[j] > array[j+1] ; j-- ){

                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
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
