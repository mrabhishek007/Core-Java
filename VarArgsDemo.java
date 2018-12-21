/**
The varrags allows the method to accept zero or muliple arguments. Before varargs either we use overloaded method or take an array as the method parameter,
but it was not considered good because it leads to the maintenance problem.If we don't know how many argument we will have to pass in the method,
varargs is the better approach.

While using the varargs, you must follow some rules otherwise program code won't compile. The rules are as follows:
1. There can be only one variable argument in the method.
2. Variable argument (varargs) must be the last argument.

*/

class VarArgs
{
	void showArgs(int... numbers)
	{
		System.out.println("*******************************************");		
		
		for(int num : numbers)
		{
			System.out.println(num+",");
		}
	
	}

}


class VarArgsDemo 
{

	public static void main(String[] args) 
	{
		VarArgs obj = new VarArgs();
		obj.showArgs(22,23,24);		
		obj.showArgs(10);

	}
}
