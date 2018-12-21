import java.io.*;
class Sender 
{
	public static void main(String[] args) throws Exception
	{
		

		Dog d1 = new Dog();
        
		FileOutputStream fos = new FileOutputStream("abc.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);
             
		System.out.println("Serialization Started");

		oos.writeObject(d1);

	}
}
