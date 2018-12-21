import java.util.Scanner;
import java.util.Random;
class RandomNumber
{
	int num;
   public RandomNumber(int num)
   {
     this.num=num;
	 generateRandomNo();
   }


   void generateRandomNo()
	{

   Random random_no = new Random();
   int gen_ran_no = random_no.nextInt(num);
   System.out.println("Random no for "+num+" is "+gen_ran_no);
	
	}
}



class RandomNumberGeneratorDemo 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
        int no	= Integer.parseInt(s.nextLine());
		RandomNumber rn = new RandomNumber(no);
	}
}
