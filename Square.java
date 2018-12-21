class Square
{
float side;
float area;
float perimeter;
void getSide()
{
side=10.5f;
}
void showPerimeter()
{
perimeter=4*side;
}
void showArea()
{
area=side*side;
}
void showData()
{
System.out.println("length of side="+side);
System.out.println("perimeter of square ="+perimeter);
System.out.println("area of square ="+area);
}
public static void main(String args[])
{
Square S;
S= new Square ();
S. getSide ();
S. showPerimeter ();
S. showArea ();
S. showData();
}
}