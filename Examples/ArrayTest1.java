class Demo
{
    int i[] ={1,2,3,5,6};//Declarartion.instantiation,initialization
    void disp()
    {
        System.out.print("Array Elements are ::");
        for(int k=0;k<i.length;k++)
        {
            
            System.out.print(i[k]+" ");
        }
    }
}
        
class ArrayTest1
{
public static void main (String[] args)
{
  Demo obj = new Demo();
  obj.disp();
}
}