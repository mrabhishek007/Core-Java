//DemoInterface.java
interface DemoInterface
{
	int a=20;//data members must be initialized ininterface because they are universaly reusable otherwise cmpile-time error   
	float b=65.52f;
	//int c;//-----error variable c is not initialized
	void show();//By default undefined methods are "public abstract" ,no need to write
	void disp();

}