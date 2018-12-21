//Serialization w.r.t. Inheritance (If parent class implement Serializable its child class is by default Serializable,no need to implement manually)

import java.io.*;

class Animal implements Serializable 
{
   int i = 10;
}


class Dog extends Animal       //( Here no need to implement Serializable,it will be by default because Parent class implement Serialization Interface)
{
	int j = 20;
}



class SerializationInheritance
  
{
	public static void main(String[] args) throws Exception
	{
		Dog d1 = new Dog();

	   FileOutputStream fos = new FileOutputStream("abc.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(d1);


 		FileInputStream fis = new FileInputStream("abc.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Dog d2 = (Dog)ois.readObject();

		System.out.println("i = "+d2.i+",j = "+d2.j);
       


	}
}
