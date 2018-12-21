class DuplicateFinder 
{
	
	public static void getOriginalWord(String word){
	
		int length = word.length();

		String result = "";

		 String[] tmp = new String[length];
		 int temp_count=0;

		for(int i=0 ;  i<length ; i++ ){
		
		    String current = word.charAt(i)+"" ;


				for(int j=0 ; j<tmp.length ; j++){
				
					if(current.equals(tmp[j])){
						return;
					}

					if(j==tmp.length-1){
						tmp[temp_count] = current ;
						result += current;
						temp_count++;
					}
				}
		}

		System.out.println("Original text : " + result );

	
	}


	public static void main(String[] args) 
	{
		String word = "jgdfbcPpIjiiydhb";
		getOriginalWord(word);
	}
}
