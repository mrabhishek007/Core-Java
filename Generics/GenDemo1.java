//Create a generic class using concept of Generics
//GenDemo1.java
class Gen1<T> //T is type parameter.T can be anytype based on our runtime requirements.
{
	T ref;
   Gen1(T par )
	{
        ref=par;

    }

    void display()
		
	{
	
	 System.out.println("The type of object is : "+ref.getClass().getName());

	}

	 T retrieve()
	{
	   return ref;
	}


}


class GenDemo1
{

	public static void main(String[] args) 
	{
		
       Gen1<String> obj = new Gen1<String>("Google");
	   obj.display();
       System.out.println(obj.retrieve());

	   Gen1<Integer> obj2 = new Gen1<Integer>(100);
	   obj2.display();
	   System.out.println(obj2.retrieve());

	}
}
