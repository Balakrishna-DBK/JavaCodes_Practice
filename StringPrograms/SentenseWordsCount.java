package StringPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SentenseWordsCount {

	public static void main(String[] args) {
		
		String input = "I am from India and I have travelled China, Indonesia, "
				+ "Thailand, Srilanka, Bangladesh and"
				+ " I liked Thailand Food and I liked nature of Indonesia";
		
		String[] words = input.replaceAll("[^a-zA-Z\\s]", "").split("\\s+");
		
		List<String> countries = Arrays.asList("India", "China", "Indonesia", "Thailand", "Srilanka","Bangladesh");
		
		Map<String, Integer> freqmp = new HashMap<>();
		
		for(String word:words) {
			if(countries.contains(word))
				freqmp.put(word, freqmp.getOrDefault(word, 0)+1);
		}
		
		for(Map.Entry<String, Integer> entry: freqmp.entrySet())
			System.out.println(entry.getKey()+"===>"+entry.getValue());
			
	}

}
