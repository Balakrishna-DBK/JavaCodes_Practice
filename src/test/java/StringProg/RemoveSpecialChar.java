package StringProg;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		
	        String input ="BaL@@#Aa Kr&is123hNA!!$";

	        String[] words =input.split("\\s+");
	        String result = "";
	        for(String word:words) {
	        	word=word.replaceAll("[^a-zA-Z]", "");
	        	result+=word+" ";
	        }
	        System.out.println(result.toLowerCase());

	}

}
