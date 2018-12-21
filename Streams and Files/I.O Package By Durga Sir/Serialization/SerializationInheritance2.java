import java.io.*;

class Animal
{
	int i=10;

	Animal()//must contain default constructor when parent is non_Serializable
	{
	  System.out.println("Animal constructor called");
	}

}

class Dog extends Animal implements Serializable
{
	int j=20;

	Dog()
	{
	  System.out.println("Dog constructor called");
	}

}


class SerializationInheritance2 
{
	public static void main(String[] args) throws Exception
	{
		Dog d1 = new Dog();
		d1.i=999;
		d1.j=899;

        FileOutputStream fos = new FileOutputStream("xyz.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        System.out.println("Deserialization Started");

		FileInputStream fis = new FileInputStream("xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Dog d2 = (Dog)ois.readObject(); //Now jvm will check if any parent class is non-serilizable(int his case "Animal") jvm will execute control flow in every non_serilizable parent and share its instance variable to the current object(i=10 is shared instead of i=999)
		
		System.out.println(d2.i+"_________"+d2.j);

	}
}
