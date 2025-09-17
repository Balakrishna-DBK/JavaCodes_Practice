package StringProg;

public class AlternateWordReverse {

	public static void main(String[] args) {
        String input = "first come first serve java code";

        String[] words = input.split("\\s+");
        
        StringBuilder sb= new StringBuilder();
        
        for(int i=0; i<words.length; i++){
            if(i%2==0){
                sb.append(words[i]);
            }else{
                sb.append(new StringBuilder(words[i]).reverse().toString());
            }
            sb.append(" ");
        }
        System.out.print(sb.toString().trim());
	}

}

//String input = "Iam going to office";
//
//String[] words = input.split("\\s+");
//StringBuilder sb = new StringBuilder();
//
//for(int i=0; i<words.length; i++){
//	if(i%2==0){
//		String rev = "";
//		for(int j=words[i].length()-1; j>=0; j--){
//			rev+=words[i].charAt(j);
//		} 
//          sb.append(rev);
//	} else{
//		sb.append(words[i]);
//	}
//	sb.append(" "); 
//}
//System.out.print(sb);




