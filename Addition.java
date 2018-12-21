class Addition
{
int sum(int a,int b)
{
int c;
c=a+b;
return c;
}
float substraction(float c,float d)
{
float e=c-d;
return e;
}
public static void main(String args[])
{
Addition obj1;
obj1= new Addition();
int x1=obj1.sum(50,60);
System.out.println("the sum is :"+x1);
Addition obj2;
obj2=new Addition();
int x2=obj2.sum(-100,400);
System.out.println("the sum is::"+x2);
Addition obj3;
obj3=new Addition();
float x3=obj3.substraction(50.5f,20);
System.out.println("the substraction is ::"+x3);
}
}
