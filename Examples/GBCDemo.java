//Working with Garbage College
import java.util.Date;
public class GBCDemo
{
    void  m1()
    {

     Runtime r =  Runtime.getRuntime();//Runtime class present in java.lang Package
     long totalmemory =  r.totalMemory();

     System.out.println("Total heap memory = "+totalmemory);
     System.out.println("Total free memory = "+r.freeMemory());
     
      for(int i = 0;i<10000;i++)

      {
	     Date date = new Date();
      }

	
     r.gc();//requesting JVM to run garbage collection

	
	 System.out.println("Total free memory = "+r.freeMemory());

     System.out.println("Total free memory after gc = "+r.freeMemory());

    }
    

    public static void main(String[] args)
    {

      GBCDemo gbc = new GBCDemo();
      gbc.m1();

    }  
    

}
