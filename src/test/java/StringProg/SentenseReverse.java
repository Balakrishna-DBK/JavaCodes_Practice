package StringProg;

public class SentenseReverse {

	public static void main(String[] args) {

		String input = "Iam going to office";

		String[] words = input.split("\\s+");

		String rev = "";
		for(String word:words){
			
			for(int i=word.length()-1; i>=0; i--){
				rev+=(word.charAt(i));
			}
			rev+=" ";
		} 
		System.out.print(rev);
	} 
	
}
