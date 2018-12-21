package data_structure.sorting;

public class QuickSort {

    // Steps :

    // (initially pi,j at index 0 if pi<=pivot then pi increments and do swapping with jth element, unlike j always increments )

    //  1.  10, 80, 30, 90, 40, 50   ( pivot = 50 )
    //  2.  10, 30, 40, 50, 80, 90
    //  3.  Sort(elements before pivot position )   10, 30, 40, 50, 80, 90 ( pivot = 40 )
    //  4.  Sort(elements after pivot pos(50) )     10, 30, 40, 50, 80, 90 ( pivot = 90 )


    private int partition(int[] array, int start, int end) {

            // let last element be pivot element

            int pivot = array[end];
            // index of smaller index
            int partitionIndex = start;

            for(int j = start; j< end ; j++){

                // If current element is smaller than or
                // equal to pivot
                if(array[j] <= pivot ){

                    int temp = array[partitionIndex];
                    array[partitionIndex] = array[j];
                    array[j] = temp;

                    partitionIndex++;
                }
            }

            // swapping pivot to sorted location

            array[end] = array[partitionIndex];
            array[partitionIndex] = pivot;

            return partitionIndex;

    }


    private void sort(int[] array, int start, int end) {

        if(start < end ){

          int pivotPoint =   partition(array, start, end);

            // Recursively sort elements before
            // partition and after partition

          sort(array, start, pivotPoint-1);
          sort(array, pivotPoint+1, end);
        }
    }


    public static  void main(String[] args){

        int array[] = { 10, 80, 30, 90, 40, 50 };

        QuickSort quickSort = new QuickSort();
        quickSort.sort(array, 0, array.length-1 );

        for(int i : array) System.out.print(i + ", ");

    }
}
