//Getting the name of the class for which an object is created
class Student
{
	Student()
	{
		System.out.println("I am student");
	}
}


class GetClassName


{
	public static void main(String[] args) 
	{
		Student s=new Student();
		//getting name of the class for which obj is created
		System.out.println("Obj created for"+s.getClass().getName());
	}
}
