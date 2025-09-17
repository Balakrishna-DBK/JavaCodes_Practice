package StringProg;
//Reverse Words in a Sentence (order-wise)

public class ReverseingWords {

	public static void main(String[] args) {
		
		String input = "Iam going to ofice";  //ofice to going Iam 
		String[] words = input.split("\\s+");
		String rev="";
		
		for(int i=words.length-1; i>=0; i--) {
			rev+=words[i]+" ";
		}
		System.out.println(rev);

	}

}
