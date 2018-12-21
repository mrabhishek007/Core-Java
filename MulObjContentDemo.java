//MulObjContentDemo.java
class MulObjContent 
{
	float x,y,z;
	MulObjContent(float a,float b,float c)
	{
		x=a;
		y=b;
		z=c;
	}
	MulObjContent(MulObjContent z1,MulObjContent z2)
	{
		x=z1.x*z2.x;
		y=z1.y*z2.y;
		z=z1.z*z2.z;
	}
     void disp()
	{
	 System.out.println (x+"\t"+y+"\t"+z);
	}

}//MulObjContent--------------------------BLC
class MulObjContentDemo
{
	public static void main(String[] args) 
	{
	 if(args.length!=6)
		{
		 System.out.println("plz enter 6 float values");
	    }
		 else
		{
			 float x1=Float.parseFloat(args[0]);
			 float x2=Float.parseFloat(args[1]);
			 float x3=Float.parseFloat(args[2]);
			 float x4=Float.parseFloat(args[3]);
			 float x5=Float.parseFloat(args[4]);
			 float x6=Float.parseFloat(args[5]);
			 MulObjContent M1= new MulObjContent(x1,x2,x3);
			 MulObjContent M2= new MulObjContent(x4,x5,x6);
			 MulObjContent M3= new MulObjContent(M1,M2);
			 System.out.println("Obj1 details are-------------------");
			 M1.disp();
			 System.out.println("Obj2 details are-------------------");
			 M2.disp();
			 System.out.println("Mul of OBJ1& OBJ2  are-------------------");
			 M3.disp();
		}//else
	}//main()
}//MulObjContentDemo----------------------ELC
 