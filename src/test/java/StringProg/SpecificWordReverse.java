package StringProg;
import java.util.*;


public class SpecificWordReverse {

	public static void main(String[] args) {

		String input = "First come first serve in java";

		String[] words = input.split("\\s+");

		StringBuilder sb = new StringBuilder();

		for(int i=0; i<words.length; i++){
			if(words[i].equalsIgnoreCase("java"))
			{
				sb.append(new StringBuilder(words[i]).reverse().toString());
			} else
			{
				sb.append(words[i]);
			}
			sb.append(" ");
		}
		System.out.println(sb.toString());

	}
}

//String input = "iam going to office";
//String[] words = input.split("\\s+");
//String rev=""; String result="";
//
//for(String word:words){

//    if(word.equalsIgnoreCase("office")){
//          for(int i=word.length()-1; i>=0; i--){
//               rev+=word.charAt(i);
//        } result+=rev+" ";
//    }else
//    result+=word+" ";
//}
//System.out.print(result);