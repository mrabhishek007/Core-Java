package practice;

//public class ShipCount {
//
//    private static void countShip(int[][] shipLoc, int[] bombLoc) {
//
//        int totalShipDest = 0;
//
//        if(bombLoc[0]<0 && bombLoc[1]<0){
//            System.out.println("Invalid Input");
//            return;
//        }
//
//        int[] curr = bombLoc;                                      // [4,4]
//        int[] left =        { curr[0], ( curr[1]-1 ) };            // [4,3]
//        int[] right =       { curr[0], ( curr[1]+1 )  };           // [4,5]
//        int[] top   =       { ( curr[0]-1 ), curr[1] };            // [3,4]
//        int[] bottom =      { ( curr[0]+1 ), curr[1] };            // [5,4]
//        int[] topLeft =     { top[0], (top[1]-1) } ;               // [3,3]
//        int[] topRight =    { top[0], (top[1]+1) } ;               // [3,5]
//        int[] bottomLeft =  { bottom[0], (bottom[1]-1) };          // [5,3]
//        int[] bottomRight = { bottom[0], (bottom[1]+1) };          // [5,5]
//
//        int[][] destructionArea = { curr, left, right, top, bottom, topLeft, topRight, bottomLeft, bottomRight };
//
//        for(int i=0 ; i<destructionArea.length; i++){
//
//            // checking whether the array index is valid
//            if( destructionArea[i][0] >= 0 && destructionArea[i][1] >= 0 && destructionArea[i][0]<= shipLoc[0].length-1 && destructionArea[i][1]<= shipLoc[0].length-1){
//
//                // accessing the value of index
//                int isShipFound = shipLoc[destructionArea[i][0]][destructionArea[i][1]] ;
//
//                if(isShipFound==1){
//                    totalShipDest++;
//                }
//            }
//        }
//        System.out.println("Total Ship destroyed at [" + curr[0] + "," + curr[1] + "] is " + totalShipDest );
//    }
//
//    public static void main(String[] args){
//
//        int [][] shipLoc = {
//
//              // 0  1   2  3  4  5  6  7
//                {1, 0, 1, 0, 0, 1, 1, 0},    // 0
//                {0, 1, 1, 0, 0, 0, 1, 1},    // 1
//                {0, 1, 1, 0, 0, 0, 1, 1},    // 2
//                {1, 0, 1, 0, 0, 1, 1, 0},    // 3
//                {0, 1, 1, 0, 0, 0, 1, 1},    // 4
//                {0, 1, 1, 0, 0, 0, 1, 1},    // 5
//                {1, 0, 1, 0, 0, 1, 1, 0},    // 6
//                {0, 1, 1, 0, 0, 0, 1, 1},    // 7
//        };
//
//        countShip(shipLoc, new int[] {4,4} );
//        countShip(shipLoc, new int[] {0,0} );
//        countShip(shipLoc, new int[] {5,1} );
//        countShip(shipLoc, new int[] {2,1} );
//        countShip(shipLoc, new int[] {7,7} );
//        countShip(shipLoc, new int[] {-1,-2} );
//        countShip(shipLoc, new int[] {5,7} );
//        countShip(shipLoc, new int[] {3,5} );
//    }
//}


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DuplicateFinder
{

    public static void getOriginalWord(String word){

        int length = word.length();

        String result = "";


        String[] tmp = new String[length];
        int temp_count=0;

        List<Integer> ll = new ArrayList<Integer>();

        for(int i=0 ;  i<length ; i++ ){

            String current = word.charAt(i)+"" ;

            for(int j=0 ; j<tmp.length ; j++){

                if(current.equals(tmp[i])){
                    return;
                }


                if(j==tmp.length-1){
                    result += tmp[temp_count] ;
                    temp_count++;
                }
            }
        }

        System.out.println("Original text : " + result );


    }


    public static void main(String[] args)
    {
        String word = "jgdfbcPpIjiiydhb";
        getOriginalWord(word);
    }
}

