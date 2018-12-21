//SIND.java
package sp;
public class SIND //Same Package Indipendent Class 
{
	SBC s = new SBC();//creating object of SBC classs
	public SIND()
{
	//System.out.println("Val of n1 = "+s.n1);//not accessible because n1 is private.Private variables can be accessed only inside its respective class
	System.out.println("Val of n2 = "+s.n2);//here obj s is calling constructer of SBC class then n2 will be executed
	System.out.println("Val of n3 = "+s.n3);
	System.out.println("Val of n4 = "+s.n4);
}

}
