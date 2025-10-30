package StringPrograms;

import java.util.ArrayList;
import java.util.List;

public class WordsPickInFibonacciPlaces {

	public static void main(String[] args) {
		  String input = "My name is Sujay and I am from india and india is my country and I like to travel and I like south indian food and I like treking";
	        
	        String[] words = input.split("\\s+");

	        
	        List<Integer> fibPositions = new ArrayList<>();
	        int a = 0, b = 1;

	        while (a <=words.length-1) {
	            fibPositions.add(a);
	            int next = a + b;
	            a = b;
	            b = next;
	        }

	        // Print words at those Fibonacci positions
	        System.out.println("Words at Fibonacci positions:");
	        for (int pos : fibPositions) {
	            System.out.print(words[pos]+ " ");
	            System.out.print(words[pos].length()+ " ");
	            System.out.println("fib series are: "+pos);
	        }

	}

}
