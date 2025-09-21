package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		
		String input = "Iam going to office".toLowerCase();
				
		Map<Character, Integer> mp = new LinkedHashMap<>();
		
		for(char ch:input.toCharArray()) {
			if(ch==' ') continue;
			mp.put(ch, mp.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry:mp.entrySet())
			System.out.println(entry.getKey()+"===>"+entry.getValue());
	}

}
