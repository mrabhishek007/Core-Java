import java.util.Scanner;

class CharGen implements Runnable
{

  public void run()
 {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter a Line of text ");
   String text = s.nextLine();
   System.out.println("------------------------------");
   System.out.println("GIVEN TEXT = "+text);
   System.out.println("------------------------------");

   try
   {
    for(int i=0;i<text.length();i++)
	   {
	      System.out.print(text.charAt(i)+" ");
		  Thread.sleep(500);
	   }
  }
catch(InterruptedException e)
{
	System.err.println("Problem in execution");
}

 }
}

class CharGenDemo
{
	public static void main(String[] args) 
	{
		CharGen cg = new CharGen();
		//cg.start();   Error because Runnable interface contains only one method which is run()

		//passing the Object of CharGen to Thread class to get Functionality of start()
          Thread td = new Thread(cg);
		  td.start();
             
	}
}
