
class Rectangle
{

    float length,breadth,p,a;
    float getData(float l,float b)
    {
     length=l;
     breadth=b;
     return length;
    }
    void calPerimeter()
    {
        p=2*(length+breadth);
    }
    void calArea()
    {
        a=length*breadth;
    }
    void showData()
    {
     System.out.println("Length of Rectangle is::"+length) ;
     System.out.println("Breadth of Rectangle is::"+breadth);
     System.out.println("perimeter of Rectangle is::"+p);
     System.out.println("Area of Rectangle is::"+a);
  }
}
class DemoRectangle
{

    public static void main(String[] args) 
{
        
 
        Rectangle R;
        R = new Rectangle();
        float x=R.getData(20.5f,10.5f);
        
        R.calPerimeter();
        R.calArea();
        R.showData();
	}   
       
    }
   