import java.util.Scanner;

public class NumberSeries {

    private int[] generatePattern(int size) {
        int count1 = 1;
        int count2 = 1;

        int list[] = new int[size];

        for(int i=1; i<=size ; i++){

            if(i%2!=0){
             // when i is odd
                list[i-1] = count1;
                count1 *= 2 ;
            }
            else{
                //when i is even
                list[i-1] = count2;
                count2 *= 3;
            }
        }

        return list;
    }



    public static void main(String[] args){
        NumberSeries series = new NumberSeries();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of pattern to be formed");
        int size = scanner.nextInt();
        int[] list = series.generatePattern(size);
        System.out.println("Enter a position between 0 & " + (size-1) );
        int pos = scanner.nextInt();
        System.out.println("Value at index " + pos + " : " + list[pos]);
        for( int num : list) System.out.print(num+ ", ");
    }
}
