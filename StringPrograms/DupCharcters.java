package StringPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DupCharcters {

	public static void main(String[] args) {
        String input = "iam going to going iam to office";

   Set<Character> seen = new HashSet<>();
   Set<Character> duplicate = new LinkedHashSet<>();

   for(char ch:input.toCharArray()){
    if(ch!=' '){
       if(!seen.add(ch))
        duplicate.add(ch);
    }
   } for(char res:duplicate)
        System.out.print(res);

	}

}
