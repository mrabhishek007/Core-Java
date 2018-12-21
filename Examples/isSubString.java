import java.lang.Math;

public class SubSetList
{
	public static void main(String[] args) {
		
		char[] set = {'a', 'b', 'c'} ;
		
		
		int len = set.length ;
		
		for(int i=0 ; i<1<<len ; i++){
		    
		    System.out.print("{");
		    
		    
		    for(int j=0 ; j<len; j++)
		    {
		        if( (  i&(1<<j)  ) > 0){
		           
		            System.out.print(set[j]+ " ");
		            
		        }
		        
		    }
		    
		    System.out.println("}");

		    
		}