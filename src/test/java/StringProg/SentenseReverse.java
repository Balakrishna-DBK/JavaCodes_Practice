package StringProg;

public class SentenseReverse {

	public static void main(String[] args) {
		
		String input ="Iam going to office";

	    String[] words=input.split("\\s+");
	    StringBuilder sb = new StringBuilder();

	    for(String word:words){
	        
	    	String rev = new StringBuilder(word).reverse().toString();

	        sb.append(rev).append(" ");
	    }
	    System.out.println(sb);

	}

}
