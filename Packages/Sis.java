//SIS.java
//import ip.Inst;//--------(For Statement 1)

/**
import static ip.Inst.name;//--------(For Statement 2)
import static ip.Inst.loc;
import static ip.Inst.read;*/                     //OR

import static ip.Inst.*;

/* import static java.lang.Math.PI;
import static java.lang.Math.E;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow; */               //OR

import static java.lang.Math.*;//(not recommended approach in industry)
              

import static java.lang.System.out;

class Sis
{
	public static void main(String[] args)
	{
		   out.println("-------------------------------------");
		   out.println("w.r.t programmer defined Interface ");
		   out.println("-------------------------------------");
	     //out.println("Name of institute = "+Inst.name);//-----------------------1
		   out.println("Name of institute = "+name);//----------------------------2
		   out.println("Location of institute = "+loc);
		   read();


		   out.println("-------------------------------------");
		   out.println("w.r.t pre-defined Math Class ");
		   out.println("-------------------------------------");
		   out.println("Val of pi = "+PI);
		   out.println("Val of e = "+E);
		   out.println("sqrt(25) = "+sqrt(25));
		   out.println("sqrt(25) = "+sqrt(6));
		   out.println("power(2,3) = "+pow(2,3));
		   out.println("power(2,-1) = "+pow(2,-1));
		   out.println("-------------------------------------");
	}
}