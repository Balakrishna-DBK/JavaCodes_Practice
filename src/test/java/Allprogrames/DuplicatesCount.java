package Allprogrames;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicatesCount {

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
				String repeated = String.valueOf(entry.getKey()).repeat(entry.getValue());
				System.out.println(repeated+ " -- "+entry.getValue());
			}
		}

	}
}




