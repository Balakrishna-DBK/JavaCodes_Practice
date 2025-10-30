package StringPrograms;

public class FirstAndLastCharRev {

	public static void main(String[] args) {
		
		String input = "AUTOMATION";
		
		char[] ch = input.toCharArray();
		
		if(ch.length>1) {
			
			char temp = ch[0];
			ch[0]=ch[ch.length-1];
			ch[ch.length-1]=temp;
			
			input = new String(ch);
		}
		System.out.println(input);
	}

}
