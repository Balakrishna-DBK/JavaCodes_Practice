package StringPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DupCharcters {

	public static void main(String[] args) {
    
		String input = "iam going to office";
		char[] chars = input.toCharArray();
		String result="";

		for(int i=0; i<chars.length; i++){
			int count =0;

			for(int j=0; j<chars.length; j++){
				if(i!=j && chars[i]==chars[j]){
					count++;
				} 
			}   
			if(count!=0 && result.indexOf(chars[i])==-1) //if count==0,, then unique will come.. if you keep break,, fst not repeating chars..
				result+=chars[i]+" ";
		} 
		System.out.print(result);

	}

}
/*
String input = "iam going to going iam to office";  //igonamtf

Set<Character> seen = new HashSet<>();
Set<Character> duplicate = new LinkedHashSet<>();

for(char ch:input.toCharArray()){
if(ch!=' '){
   if(!seen.add(ch))
    duplicate.add(ch);
}
} for(char res:duplicate)
    System.out.print(res);
    
 */   
    
    
