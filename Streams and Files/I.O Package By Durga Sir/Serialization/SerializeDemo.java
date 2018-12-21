import java.io.*;

class Dog implements Serializable//Serializable is a marker interface   (will show runtime behaviour,no methods present directly)
{
	int i=10;
	int j=20;
    transient int k=30;
	transient static int l=40;
	transient final int m=50;
}

class SerializeDemo
{
	public static void main(String[] args) throws Exception
	{

  Dog d = new Dog();

                /**  Serialization      */

  FileOutputStream fos = new FileOutputStream("abc.ser");//any extension is valid 

  ObjectOutputStream oos = new ObjectOutputStream(fos);
  
  oos.writeObject(d);

               /**  Serialization      */


	FileInputStream fis = new FileInputStream("abc.ser");

	ObjectInputStream ois = new ObjectInputStream(fis);

	Object  o = ois.readObject();

	Dog d1 = (Dog)o;//TypeCasting
	
	System.out.println("i = "+d1.i +",j = "+d1.j+",k = "+d1.k+",l = "+d1.l+",m = "+d1.m);
	}
}