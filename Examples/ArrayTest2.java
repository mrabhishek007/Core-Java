//ArrayTest.java
import java.util.Scanner;
class Demo
{
    Scanner s = new Scanner(System.in);
    int n;
    Demo(){
    System.out.println("Enter how many Elements you want to enter in an array");
    n=Integer.parseInt(s.nextLine());
    }

    int a[]= new int[n];

	 void getArray()
    {
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s.nextLine());
        }
    }
    void disp()
    {
    System.out.println("No. of elements present in an array are: "+a.length);
    System.out.print("Elements in an array are::");
    for(int k=0;k<a.length;k++)
    {
        System.out.print(a[k]+"");
    }

    }
}
       
class ArrayTest2
{
public static void main (String[] args)
{
  Demo obj = new Demo();
  obj.getArray();
  obj.disp();
}
}