package StringProg;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicatesCharCount {

	public static void main(String[] args) {

		String input = "Bala krishnazz";

		Map<Character, Integer> mp = new LinkedHashMap<>();

		for(char ch:input.toCharArray()){
			if(ch==' ') continue;
			mp.put(ch, mp.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry:mp.entrySet()){
			if(entry.getValue() > 1)
			{
				System.out.println(entry.getKey()+ " -- "+entry.getValue()); // if i "+entry.getValue" only dup will print..
			}
		}

	}
}




