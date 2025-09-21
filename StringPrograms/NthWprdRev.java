package StringPrograms;

public class NthWprdRev {

	public static void main(String[] args) {
		
		String input = "iam going to office";          //iam going to eciffo 
		String[] words = input.split("\\s+");
		 String result="";
		
		for(String word:words) {
			String rev="";
			if(word.equalsIgnoreCase("office")) {
				for(int i=word.length()-1; i>=0; i--) {
					rev+=word.charAt(i);
				}result+=rev+" ";
			} else
				result+=word+" ";
		} System.out.println(result);

	}

}
