//ObjConCat.java
class  Java
{
String s1,s2;
Java(String x,String y)
	{
s1=x;
s2=y;
}
Java(Java p,Java q)
	{
s1=p.s1 + "-" +q.s1;
s2=p.s2 + "-"+q.s2;

}//Java
void display()
	{
	System.out.println(s1 +"-"+s2);

}//display()




}//Java--------------------BLC
class ObjConCat
{
 public static void main(String[] args) 
	{
	 if(args.length!=4)
		{
		 System.out.println("please enter 4 string values");

	 }
	 else
		{

	 Java j1=new Java(args[0],args[1]);
	 Java j2=new Java(args[2],args[3]);
	 Java j3=new Java(j1,j2);
	 System.out.println("1st Object Values -----------------");
	 j1.display();
     System.out.println("2nd Object Values -----------------");
	j2.display();
	System.out.println("3rd Object Values -----------------");
	j3.display();
	
	 
	 
	 }//else
		
	}//main()
}//ObjConCat -----------------ELC
