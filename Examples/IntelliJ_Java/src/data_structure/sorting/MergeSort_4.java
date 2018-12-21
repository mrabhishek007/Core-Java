/* Merge sort is a sorting technique based on divide and conquer technique. With worst-case time complexity
   being Ο(n log n), it is one of the most respected algorithms.Merge sort first divides the array into
   equal halves and then combines them in a sorted manner.
   It is a stable algorithm which means that location of duplicate item will be preserved */

package data_structure.sorting;

public class MergeSort_4 {


    private void merge(int[] array, int left, int middle, int right) {

        if(array[middle] <= array[middle+1] ){
            return;
        }

        int sizeLeft =  middle - left + 1;
        int sizeRight = right - middle;

        int[] tempLeft = new int[ sizeLeft ];
        int[] tempRight = new int[ sizeRight ];

        // copying data into temporary array for comparision
        for(int i=0; i< sizeLeft; i++){
            tempLeft[i] = array[ left+ i ];
        }

        int middleTemp = middle+1;
        for(int i=0; i< sizeRight; i++){
            tempRight[i] = array[middleTemp];
            ++middleTemp;
        }

        int count1=0, count2=0, i=left;


        // 1,3,7    2,4,9
        while ( count1 != sizeLeft && count2 != sizeRight ){

            if( tempLeft[count1] <= tempRight[count2] ){

                array[i] = tempLeft[count1];
                count1++;
            }
            else{

                array[i] = tempRight[count2];
                count2++;
            }
            i++ ;
        }

        while ( count1 != sizeLeft ) {

            array[i] = tempLeft[count1];
            count1++;
            i++;
        }

        while ( count2 != sizeRight ) {

            array[i] = tempRight[count2];
            count2++;
            i++;
        }



    }

//    { 7, 3, 1, 2, 9, 4 }
    private  void sort(int[] array, int left, int right) {

        if( left != right ){

            int middle = (left + right) / 2 ;

            // sort first and second halves
            sort(array, left, middle);
            sort(array, middle+1, right);

            // merge the sorted halves
            merge(array, left, middle, right);
        }

    }



    public static  void main(String[] args){

        int array[] = { 7, 3, 1, 2, 9, 4 };

        MergeSort_4 mergeSort = new MergeSort_4();
        mergeSort.sort(array, 0, array.length-1 );

        for(int i : array) System.out.print(i + ", ");

    }

}
