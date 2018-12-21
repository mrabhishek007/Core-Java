// Que - 1st character of any word in the array will be always equals to the last character of any word in the array..... 

class WordChecker 
{
	private boolean checkMatch(int i,String[] words){

	    int first_char = (int)words[i].charAt(0);
		
		for(int j=0; j<words.length; j++){
				
				if(i!=j){
				    
					int wordlength  = words[j].length() ; 
					int last_char = (int)words[j].charAt(wordlength-1);

					if(first_char==last_char){
						return true;
					}
				}
			}
		return false;
	}

    private int isWordValid(String[] words){
		
		for(int i=0; i<words.length; i++){
			
			boolean res =  checkMatch(i, words);
			
			if(!res)  return -1;

		   }

			return 1; // when every status is full-filled
	}
	
	public static void main(String[] args) 
	{
		String[] words = {"Xllbcd","defg","ghij","jkX"};		
		WordChecker wc = new WordChecker();
		System.out.println( wc.isWordValid(words) );
	}
}
