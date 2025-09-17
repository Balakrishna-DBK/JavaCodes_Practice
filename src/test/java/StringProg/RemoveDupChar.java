package StringProg;


public class RemoveDupChar {

	public static void main(String[] args) {

		String input = "Iam going to iam office"; //Iam goin t  fce

		char[] words = input.toCharArray();
		String result="";
		for(int i=0; i<=words.length-1; i++){

			boolean flag=false;
			for(int j=0; j<i; j++){
				if(words[i]==words[j] && words[j]!=' '){
					flag=true;
					break;
				}
			}
			if(!flag){
				result+=words[i];
			}
		}
		System.out.print(result);
	}

}
//String input = "Iam going to iam office";
//
//Set<Character> st = new LinkedHashSet<>();
//
//for (char res : input.toCharArray()) {
//    if (res != ' ') { // optional: skip spaces
//        st.add(res);
//    }
//}
//
//// Convert characters back to a string
//StringBuilder result = new StringBuilder();
//for (char ch : st) {
//    result.append(ch);
//}
//
//System.out.println(result.toString());






