/* In mathematics, the Fibonacci numbers are the numbers in the following integer sequence, called the Fibonacci sequence,
    and characterized by the fact that every number after the first two is the sum of the two preceding ones.
     ex: sequence. [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144] if  n=9 value = 34  */

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.lang.System.out;
public class FibonacciSeries {

    private int[] fibonacciNumbers(int n) {
        int[] fibnolist = new int[n+1];
        fibnolist[0]=0;
        fibnolist[1]=1;
        for(int i=2;i<=n;i++){
            fibnolist[i] = fibnolist[i-1] + fibnolist[i-2];
        }
        return fibnolist;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        out.println("Enter n value to find first sequence of fibonacci numbers : ");
        int n = scanner.nextInt();

        final long startTime = System.nanoTime();

        FibonacciSeries fibonacciseries = new FibonacciSeries();
        int fib_no_list[] = fibonacciseries.fibonacciNumbers(n);

        for (int i=0; i<=n ;i++){
            out.println("Fibonacci number at " + i + " location is : " + fib_no_list[i] );
        }
        final long program_execution_time = (System.nanoTime() - startTime); //in nanoseconds
         //convert to seconds
        long program_execution_timeinsec = TimeUnit.NANOSECONDS.toSeconds(program_execution_time);

        out.print( "Time took to execute this program is "+ program_execution_time );
    }
}

/*

//Fibonacci Series using Recursion
class fibonacci
{
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static void main (String args[])
    {
        final long startTime = System.nanoTime();
        int n = 9;
        System.out.println(fib(n));
        System.out.print("Time took to execute this program is "+ TimeUnit.NANOSECONDS.toSeconds (System.nanoTime() - startTime) );

    }
}
*/
