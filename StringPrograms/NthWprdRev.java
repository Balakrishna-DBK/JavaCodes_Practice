package StringPrograms;

public class NthWprdRev {

	public static void main(String[] args) {
		
		String input = "The grass is always is green as other side";
		String[] words = input.split("\\s+");
		String result = "";
		int count=0;
		
		for(int i=0; i<words.length; i++) {
			String rev="";
			if(words[i].contains("is")) {
				count++;
				if(count==2) {
					for(int j=words[i].length()-1; j>=0; j--) {
						rev+=words[i].charAt(j);
					} result+=rev+" ";
					  continue;
				} 
			}
			if(words[i].contains("green")) {
				for(int j=words[i].length()-1; j>=0; j--) {
					rev+=words[i].charAt(j);
				} result+=rev+" ";
				
			} 
			else
				result+=words[i]+" ";
		} System.out.print(result);

	}

}
/*
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

*/