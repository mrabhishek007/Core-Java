package data_structure;

public class ShiftOperator {


    public static  void leftSift(){

         int a = 8 ; // 1 0 0 0

         int b = a << 2 ; //  1 0 0 0 0 0   => 32    (  on bit level ' 2 zeros ' is appended to the right side  )

         int c = a << 1 ; // 1 0 0 0 0 => 16

        System.out.println( "a : " + a + " , b : " + b + " , c : " + c );
    }

    public static  void rightShift(){

        int a = 8 ; // 1 0 0 0

        int b = a >> 2 ; //  1 0    => 2    (  on bit level ' 2 zeros ' is removed to the right side  )

        int c = a >> 1 ; // 1 0 0  =>  4

        System.out.println( "a : " + a + " , b : " + b + " , c : " + c );
    }


    public static void main(String[] args){
        leftSift();
        rightShift();
    }
}
