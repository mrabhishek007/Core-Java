import java.util.Scanner;

public class Pattern {

    private void createPattern(int n) {

        int a = 0;
        int b = n*(n+1);

        for(int i=n; i>0; i--){

            for(int j=1; j<=i; j++){
                System.out.print(++a + "*");
            }

            b = b-i;

            for(int j=1; j<=i; j++){
                if(j==i){
                    System.out.print(++b);
                }else{
                    System.out.print(++b + "*");
                }
            }
            System.out.println();

            b = b-i;

        }

    }


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number ");
        int n = scanner.nextInt();

        Pattern pattern = new Pattern();
        pattern.createPattern(n);

    }

}
