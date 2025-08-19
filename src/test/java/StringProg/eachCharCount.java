package StringProg;

import java.util.LinkedHashMap;
import java.util.Map;

public class eachCharCount {

	public static void main(String[] args) {
		
		String input = "Bala Krishnazz";
		
	    Map<Character, Integer> cc = new LinkedHashMap<>();
	    
	    for(char ch:input.toCharArray()){
	        if(ch== ' ') continue;
	        cc.put(ch, cc.getOrDefault(ch, 0) +1);
	    }
	    for(Map.Entry<Character, Integer> ent:cc.entrySet()){
	        System.out.println(ent.getKey()+" : " +ent.getValue());
	    }
		

	}

}
