package StringPrograms;

import java.util.HashMap;

import java.util.Map;

public class WordsCount2 {

	public static void main(String[] args) {
		String input = "India, China, Bengladesh , japan, India, Japan";
		
		String[] words = input.replaceAll("[^a-zA-Z\\s]", "").toLowerCase().split("\\s+");
		
		Map<String, Integer> mp = new HashMap<>();
		
		for(String word:words) {
			mp.put(word, mp.getOrDefault(word, 0)+1);
		}
		
		for(Map.Entry<String, Integer> entry: mp.entrySet())
			System.out.println(entry.getKey()+"===>"+entry.getValue());
	}
}
