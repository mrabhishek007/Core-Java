//Lambda Expression with Parameter in Abstract method
//IntfProg7.java

interface Faculty
{
	void readJava(String x);

}//Functional Interface with single parameter

class IntfProg7 
{
	public static void main(String[] args) 
	{
		Faculty f1 = (x)->
		{
			System.out.println(x+"reads java notes");
		};
		f1.readJava("Shekhar ");

		f1 = (name) ->
		{
			System.out.println(name+" also read java notes");
		};
		f1.readJava("Vikash ");

	}
}
