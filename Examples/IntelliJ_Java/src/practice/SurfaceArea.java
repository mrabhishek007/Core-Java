package practice;

public class SurfaceArea {


    private static void getSurfaceArea(int[][] matrix) {


        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        int topBottomArea = 2* rowSize * colSize ;

        int surfaceArea = topBottomArea;

        for(int i=0 ; i<rowSize; i++){

            for(int j=0; j<colSize ; j++){


                int currVal = matrix[i][j] ;


/*                int leftVal = matrix[i][j-1];
                int rightVal = matrix[i][j+1];
                int topVal = matrix[i-1][j];
                int botVal = matrix[i+1][j];*/

/*
                1, 3, 4
                2, 2, 3
                1, 2, 4}
*/

                int leftIndex =   j-1 ;
                int rightIndex =  j+1 ;
                int topIndex =    i-1 ;
                int bottomIndex = i+1 ;

                if(leftIndex<0){
                    surfaceArea += currVal ;
                }else{
                    int leftVal = matrix[i][j-1];
                    int difference = currVal - leftVal ;
                    surfaceArea +=  Math.abs(difference);
                }

                if(rightIndex > colSize-1){
                    surfaceArea += currVal;
                }else{
                    int rightVal = matrix[i][j+1];
                    int difference = currVal - rightVal ;
                    surfaceArea +=  Math.abs(difference);
                }

                if(topIndex< 0 ){
                    surfaceArea += currVal;
                }else{
                    int topVal = matrix[i-1][j];
                    int difference = currVal - topVal ;
                    surfaceArea +=  Math.abs(difference);
                }

                if(bottomIndex > colSize-1){
                    surfaceArea += currVal;
                } else{
                    int botVal = matrix[i+1][j];
                    int difference = currVal - botVal ;
                    surfaceArea +=  Math.abs(difference);
                }
            }
        }

        System.out.println( "Surface Area : " + surfaceArea);

    }



    public static void main(String[] args){
       int matrix[][] = { {1, 3, 4},
            {2, 2, 3},
            {1, 2, 4} } ;

       getSurfaceArea(matrix);
    }


}
