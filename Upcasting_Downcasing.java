//Upcasting_Downcasting.java
class Machine
{
	void start()
	{
      System.out.println("Machine Started");
	}

	void stop()
	{
		System.out.println("Machine Stopped");
	}
}

class Camera extends Machine
{
	void start()//Overridden
	{
		System.out.println("Camera Started");
	}

	void snapPic()//Not OverRidden
	{
		System.out.println("Taking a Picture");
	}

	void stop()//Overridden
	{
		System.out.println("Camera Stopped");
	}


}

class Upcasting_Downcasting
{
	public static void main(String[] args) 
	{
		Machine m1= new Machine();
		Camera c1 = new Camera();
		m1.start();
		m1.stop();
		c1.start();
		c1.snapPic();
		c1.stop();
		System.out.println("---------------------------");

      //Upcasting
	  System.out.println("w.r.t. Upcasting");
	  Machine m2 = new Camera();
	  m2.start();
	  m2.stop();
	  //m2.snapPic();//error because snapPic() is not existing in its super class i.e. class Machine

	  //Downcasting
	  System.out.println("w.r.t. Downcasting");
	  Machine m3 = new Camera();
        Camera c2 = (Camera)m3;
		c2.snapPic();
	 System.out.println("---------------------------");
/**
	//Don't Work
     
	 Machine m4= new Machine();

	Camera c3 =(Camera)m4;//Runtime error ,machine cannot be cast to Camera
	c3.start();
	c3.stop();
	c3.snapPic();
	
*/
	  	}

}