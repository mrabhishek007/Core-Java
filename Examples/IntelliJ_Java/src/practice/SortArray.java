import java.util.ArrayList;

public class SortArray {

    private int digitCount(int digit, int[] num) {
        int count=0;
        for(int i=0; i<num.length; i++){

                if(digit == num[i]){
                    count++;
                }
        }
        return count;
    }

    private ArrayList<Integer> sortArray(int num[]) {

        ArrayList<Integer> uniqueNo = new ArrayList<Integer>();
        ArrayList<Integer> numberCount = new ArrayList<Integer>();
        ArrayList<Integer> sortedList = new ArrayList<Integer>();

              // unique digit
        for(int i=0; i<num.length; i++){

            int digit = num[i];
            if(!uniqueNo.contains(digit)){
                uniqueNo.add(digit);
            }
        }

         // number counting
        for( int no : uniqueNo){
            int count = digitCount(no, num);
            numberCount.add(count);
        }

         // logic for sorting in ascending order based on number count
        for(int i=0 ; i<numberCount.size(); i++){

            int temp = i;
            for( int j=i+1 ; j<numberCount.size() ; j++){

                if(numberCount.get(temp) > numberCount.get(j) ){
                    temp = j ;
                }
            }

            int uno = uniqueNo.get(temp) ;
            for(int p=0; p<numberCount.get(temp); p++){
                sortedList.add(uno);
            }

            numberCount.set(temp,numberCount.get(i));
            uniqueNo.set(temp,uniqueNo.get(i));
        }
        return sortedList;
    }

    public static void main(String[] args){
        SortArray sort_array = new SortArray();
        int num[] = {22,-5,56,0,0,-5,22,-5,22,56,75,-5,9005};
         ArrayList<Integer> result = sort_array.sortArray(num);

         for( int i :result){
             System.out.print( i + "," );
         }
    }
}
