package StringProg;

public class UniqueCharacter {

	public static void main(String[] args) {
		
		String input = "Balakrishna";
		
		String result="";
		char[] spwords = input.toCharArray();
		
		for(int i=0; i<input.length(); i++) {
			
			int count=0;
			for(int j=0; j<input.length(); j++) {
				if(spwords[i]==spwords[j])
				count++;
			}
			if(count==1) {
				result+=spwords[i];
			}
		}
		System.out.println(result);
	}

}
