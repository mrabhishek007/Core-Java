import java.util.*;
class  NumberExtracter
{ 
	public void extractNo(int no){

		ArrayList al = new ArrayList();

		 while(no!=0){
			int rem = no%10;
			al.add(rem);
			no = no/10;
		 }
         
		 Collections.reverse(al);
		 
		 for(Object x :al)
		 {
			System.out.print((int)x+",");
		 }
	
	}


	public static void main(String[] args) 
	{
		NumberExtracter ne = new NumberExtracter();
		ne.extractNo(356975);
	}
}
