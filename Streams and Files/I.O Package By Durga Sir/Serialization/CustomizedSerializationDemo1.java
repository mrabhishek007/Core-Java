//Customized Serialization recover the loss of information occur during serialization and deserialization process

import java.io.*;
class Account implements Serializable
{
	String name="durga";
	transient String pass="anuska";


	/** CUSTOMIZED SERIALIZATION      **/

   //This method will be called automatically during serailzation process 
     
    private void writeObject(ObjectOutputStream os) throws Exception
	{
	  os.defaultWriteObject();
	  String encrypted_password = "ABC"+pass;
	  os.writeObject(encrypted_password);
	}

	/** CUSTOMIZED DESERIALIZATION      **/

   //This method will be called automatically during De-serailzation process 

	private void readObject(ObjectInputStream is) throws Exception
	{
		is.defaultReadObject();

		String encrypted_password =  (String)is.readObject();
		
		pass = encrypted_password.substring(3);
	
	}


}

class CustomizedSerializationDemo1 
{
	public static void main(String[] args) throws Exception
	{
		Account a1 = new Account();
		
		FileOutputStream fos = new FileOutputStream("abc.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(a1);


 		FileInputStream fis = new FileInputStream("abc.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Account a2 = (Account)ois.readObject();

		System.out.println("name = "+a2.name+",pass = "+a2.pass);
       
	}
}
