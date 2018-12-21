import java.io.*;
import java.util.Scanner;
class NumPrint
{
Scanner s = new Scanner(System.in);

void printNo()
{
System.out.println("How many numbers");
String fname = s.nextLine();

try
{
FileOutputStream fos = new FileOutputStream(fname);//Default value is false i.e. file is in overridden mode

for(i=1;i<=10;i++)
{
   fos.write(i);
}
}
catch(Exception e)
	{
	System.err.println(e);
}

System.out.println("Numbers are written  ");
}//printNo

}

class NumPrintDemo
{
	public static void main(String[] args) 
	{
		NumPrint np = new NumPrint();
		np.printNo();
	}
}
