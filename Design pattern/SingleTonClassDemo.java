//Implementing SingleTon class and Factory Method
//SingleTonClassDemo.java
class SingleTonClass //RULE 1 ::Use an appropritate class name,created class is called as Singleton class.
{
private static SingleTonClass s=null; // RULE 2 :Each and every Singleton class must contain self declared object with private and static ()
private SingleTonClass()//RULE 3 ::Each and every SingleTon Class must contain Explicit Private Default Constructer
	{
		System.out.println("Object created first time");
	}
static SingleTonClass create()//RULE 4 : Each and every SingleTon Class must contain factory method(must have static and same class name as return type)
	{
		if (s==null)//checking the reference of the object
		{
			s=new SingleTonClass();
		}
		else
			System.out.println("Object already created");
		return s;
}//end of create()
}//SingleTon----------------BLC
class SingleTonClassDemo
{
	public static void main(String[] args) 
	{
		//SingleTonClass s1 = new SingleTonClass(); invalid because of private constructer
		SingleTonClass s1 = SingleTonClass.create();
		SingleTonClass s2 = SingleTonClass.create();
		SingleTonClass s3 = SingleTonClass.create();
		if ((s1==s2)&&(s2==s3)&&(s3==s1))
		{
			System.out.println("Multiple Object Treated as one object with same reference");
		}
		else
		{
			System.out.println("Multiple Object with differents reference ");
		}


	}//end of main()
}//SingleTonClassDemo--------------ELC
