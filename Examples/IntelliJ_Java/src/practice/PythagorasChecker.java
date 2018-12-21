public class PythagorasChecker {

    private boolean verifier(int x, int y, int z){
        if(x*x + y*y == z*z ) return true;
        if(y*y + z*z == x*x ) return true;
        if(x*x + z*z == y*y ) return true;
        return false;
    }

    private int[] isPythagoras(int[] numbers) {
        int count=0;
        for(int i=0; i<numbers.length-2; i++){

            for(int j=i+1; j<numbers.length-1; j++){

                for(int k=j+1; k<numbers.length; k++){

                    boolean res = verifier(numbers[i], numbers[j], numbers[k]);
                    if(res) return new int[]{ numbers[i], numbers[j], numbers[k] };
                }
            }
        }
        return null;
    }

    public static void main(String[] args){

        PythagorasChecker checker = new PythagorasChecker();
        int[] numbers = { 10, 1,  5, 12, 8 , 13 };
        int[] result = checker.isPythagoras(numbers);
        if(result!= null){
            for(int num: result){
                System.out.print(num + " ");
            }
            return;
        }
        System.out.println("Pythagoras for given numbers is not possible");
    }
}
