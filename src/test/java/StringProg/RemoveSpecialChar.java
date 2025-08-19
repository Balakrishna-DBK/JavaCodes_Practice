package StringProg;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		
	        String input ="BaL@@#Aa Kr&is123hNA!!$";

	        String cleaned = input.replaceAll("[^a-zA-Z0-9]", ""); //This is called Regex... 

	        System.out.print(cleaned);

	}

}
