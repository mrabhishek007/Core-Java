/*
Find the Roots of Quadratic Equation.
Equation: ax^2 + bx + c
    Discriminant = b^2 – 4*a*c
    Root1= (-b + sqrt(d))/2*a
    Root2= (-b – sqrt(d))/2*a
    url: https://www.mathsisfun.com/algebra/quadratic-equation.html
*/


import java.util.Scanner;

public class QuadraticEquation {

    private static void getRoot(int a, int b, int c) {

        double d = b*b - 4*a*c ;  // d = b^2 -4ac is Discriminant


//        when b2 − 4ac is positive, we get two Real solutions
        if(d>0){
            System.out.println("Roots are real but unequal");
            double root1 = ( -b + Math.sqrt(d) ) / (2*a) ;
            double root2 = ( -b - Math.sqrt(d) ) / (2*a) ;
            System.out.println("First root is : "+root1);
            System.out.println("Second root is : "+root2);
        }
// when it is zero we get just ONE real solution (both answers are the same)
        else if(d==0){
            System.out.println("Roots are real and unequal");
            double root =  ( -b + Math.sqrt(d) ) / (2*a) ;
            System.out.println(" Root = "+root );
        }
//        when it is negative we get a pair of Complex solutions
        else{
            System.out.println("Roots are imaginary");
        }


    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Given quadratic equation:ax^2 + bx + c");
        System.out.println("Enter a  : ");
        int a = scan.nextInt();
        System.out.println("Enter b  : ");
        int b = scan.nextInt();
        System.out.println("Enter c  : ");
        int c = scan.nextInt();
        System.out.println("Your quadratic equation are : "+ a + "x^2 + " + b + "x + " + c);
        getRoot(a, b, c);
    }



}



