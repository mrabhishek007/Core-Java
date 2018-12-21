class Circle {
    float r;
    float p,a;
    float pi=3.1417f;
    void getRadius()
    {
       r=2.5f; 
    }
 void calParameter()
 {
     p=2*pi*r;
 }
  void calArea()
  {
      a=pi*r*r;
  }
  void showData()
  {
      System.out.println("length of Radius is:"+r);
      System.out.println("Perimeter of circle is:"+p);
      System.out.println("Area of circle is: "+r);
  }/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Circle C = new Circle();
 C.getRadius();
 C.calParameter();
 C.calArea();
 C.showData();
    }
    
}
