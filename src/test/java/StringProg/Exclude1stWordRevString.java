package StringProg;

public class Exclude1stWordRevString {

	public static void main(String[] args) {
	    
		String input = "Hello java is very java good very language";
	    
	    String[] words = input.split("\\s+");
	   
	    if(words.length>1){
	       
	    	StringBuilder fstword = new StringBuilder();
	        fstword.append(words[0]).append(" ");

	    for(int i=words.length-1; i>0; i--){
	        fstword.append(words[i]).append(" ");
	    }
	    System.out.print(fstword.toString().trim());
	    }
	    else
	    System.out.print(input);

	}

}
