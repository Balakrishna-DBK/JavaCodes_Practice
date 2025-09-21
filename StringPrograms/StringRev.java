package StringPrograms;

public class StringRev {

	public static void main(String[] args) {
		
		StringRev();
		wordrev();
		
	}
	
	public static void StringRev() {
		
		String input = "iam going to office";       //eciffo ot gniog mai
		String rev="";
		
		for(int i=input.length()-1; i>=0; i--) {
			rev+=input.charAt(i);
		} 
		System.out.println(rev);
	}
	
	public static void wordrev() {
		String input = "iam going to office";      //mai gniog ot eciffo 
		String[] words=input.split("\\s+");
		String rev="";
		
		for(String word:words) {
			for(int i=word.length()-1; i>=0; i--) {
				rev+=word.charAt(i);
			}rev+=" ";
		}
		System.out.println(rev);
	}

}
