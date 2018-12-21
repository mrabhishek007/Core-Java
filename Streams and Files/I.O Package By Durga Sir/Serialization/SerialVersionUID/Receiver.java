import java.io.*;
class Receiver 
{

	public static void main(String[] args)  throws Exception
	{
		
        
		FileInputStream fis = new FileInputStream("abc.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);
             
		System.out.println("De-Serialization Started");

		Dog d2 = (Dog)ois.readObject();

		System.out.println(d2.i+"__________"+d2.j);

	}
}
