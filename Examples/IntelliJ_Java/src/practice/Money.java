package practice;

public class Money {


    public static void main(String[] args){

        findDeno(195);

    }

    private static void findDeno(int money) {

        int r = 1;
        int mon = money;
        int total =0;

        int[] deno = { 50, 25, 20, 10, 5 } ;
        int size = 0;

        while(r!=0){

            int count = mon/deno[size];
            total+= count;

            r = mon%deno[size];
            mon = r ;
            size++ ;

        }

        System.out.println(total);


    }
}
