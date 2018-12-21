
// Left Shift(<<) & Right Shift(>>) Operator

class RightShiftOperator 
{
	public static void main(String[] args) 
	{
         
		 //********************LEFT-SHIFT OPERATOR ***************************//
		 

		 int a = 8; // Binary Form of 8 -->  1 0 0 0 

		 int b = a << 2 ; //Binary Form after  left shifting (Append after original binary a[0 0] ) .i.e 1 0 0 0 0 0  --> 32  

         System.out.println("Left shift operator of "+ a +" is = "+ b);



         //********************RIGHT-SHIFT OPERATOR ***************************//

         int x = 25; // Binary Form of 8 -->  1 1 0 0 1  

         int y = x >> 2 ; //Binary Form after  right-shifting ( It will skip last 2 digits) .i.e. 1 1 0 --> 6 

		 System.out.println("Right shift operator of "+ x +" is = "+ y);
 	}
}
