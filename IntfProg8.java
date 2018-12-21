//Lambda EXpression,Functional Interface with abstract method by taking value and returning
//IntfProg8.java
interface AOP
{
	
	int op(int x,int y);

}//AOP--------Functional Interface


class IntfProg8  
{
	public static void main(String[] args) 
	{
               //CALCULATING SUM
		System.out.println("AOP---SUM OPERATION-----LAMBDA EXPRESSION");
		System.out.println("-----------------------------------------");
		AOP o1 = (p,q)->//Pattern 1
		{
			return p+q ;
		};
		int x = o1.op(10,20);
		System.out.println("Sum= "+x);

		System.out.println("-----------------------------------------");
		System.out.println("");

                

               //CALCULATING SUB
		System.out.println("AOP---SUB OPERATION-----LAMBDA EXPRESSION");
		System.out.println("-----------------------------------------");
		o1=(p,q)->(p-q);//Pattern 2
		System.out.println("Sub= "+o1.op(100,50) );

		System.out.println("-----------------------------------------");
		System.out.println("");

               //CALCULATING MUL
		System.out.println("AOP----MUL OPERATION-----LAMBDA EXPRESSION");
		System.out.println("-----------------------------------------");
		o1 = (int p,int q)->(p*q);//Pattern 3
		System.out.println("Mul= "+o1.op(-2,-8) );
		
	}
}
