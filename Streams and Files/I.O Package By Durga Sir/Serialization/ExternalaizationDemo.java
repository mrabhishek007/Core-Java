import java.io.*;
class ExternalaizationDemo implements Externalizable    //Saving the part of an object is called Externalaization 
{

   int i,j;
   String s;

  public  ExternalaizationDemo(String s,int i,int j)
   {
	   this.i = i;
	   this.j = j;
	   this.s = s;
   }

  public  ExternalaizationDemo()   //Default constriuctor is compulsary 
   {
	   System.out.println("Default constructor is compulsary");
   }



   public void writeExternal(ObjectOutput oo) throws IOException//will be executed automatically at the time of serialization.
	{
	   oo.writeObject(s);          //we are saving only String s and int i  in file.
	   oo.writeInt(i);
   
    }

	public void readExternal(ObjectInput oi) throws IOException,ClassNotFoundException//will be executed automatically at the time of deserialaztion.
	{
	  s = 	(String)oi.readObject(); //when deserialization occurs jvm will create a seperate new memory space and execute default constructor
	  i =  oi.readInt();
	
	}//saving only 2 properties

	public static void main(String[] args) throws Exception 
	{
        ExternalaizationDemo ed = new ExternalaizationDemo("Durga",10,20);
		

		FileOutputStream fos = new FileOutputStream("xyz1.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(ed);   //executed writeExternal() of ExternalaizationDemo class automatically
		
	    System.out.println("Deserializayion Started");

		FileInputStream fis = new FileInputStream("xyz1.ser");

		ObjectInputStream ois = new ObjectInputStream(fis); 

		ExternalaizationDemo ed2 = (ExternalaizationDemo)ois.readObject();      //It will execute writeExternal() of ExternalaizationDemo class automaticallly
		

		System.out.println(ed2.s+"____"+ed2.i+"_____"+ed2.j);//s and i will be retrieved only because of externalization


	}
}
