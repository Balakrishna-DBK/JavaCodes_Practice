package StringPrograms;

public class SpecificWordsReverse {

	public static void main(String[] args) {
	
		String input = "The grass is always green on the other is side"; //The grass is always neerg on the other si side

		String[] words = input.split("\\s+");
		String result = ""; int count =0; 

		for(String word:words){
			String rev="";
			if(word.equalsIgnoreCase("is")){
				count++;
				if(count==2){
					for(int j=word.length()-1; j>=0; j--){
						rev+=word.charAt(j);
					} result+=rev+" "; continue;
				} 
			} else {
				if(word.equalsIgnoreCase("green")){    
					for(int k=word.length()-1; k>=0; k--){
						rev+=word.charAt(k);
					} result+=rev+" "; continue;
				}
			}
			result+=word +" "; 
		}
		System.out.print(result); 

	}
}
