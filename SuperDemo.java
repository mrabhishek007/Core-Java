//Illustrate the concept of Super Keyword at method level
//SuperDemo.java
class BC
{
	void show()
	{
		System.out.println("Base----show()");
	}

}

class DC extends BC
{
	void show()
	{
		System.out.println("Show----------Derived()");
		super.show();
	
	}
}



class  SuperDemo
{
	public static void main(String[] args) 
	{
		DC obj = new DC();
		obj.show();
	}
}
