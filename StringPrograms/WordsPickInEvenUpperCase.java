package StringPrograms;

public class WordsPickInEvenUpperCase {

	public static void main(String[] args) {
		 String input = "My name is Sujay and I am from india and india is "
		 		+ "my Country and I like to travel and I like south indian food and I like treking";
	        
	        String[] words = input.split("\\s+");
	        
	        for(int i=0; i<words.length; i++){
	            if(i%2!=0){
	                if(Character.isUpperCase(words[i].charAt(0))){    //o/p---Sujay I Country I 
	                    System.out.print(words[i]+" ");
	                }
	            }
	        }

	}

}
