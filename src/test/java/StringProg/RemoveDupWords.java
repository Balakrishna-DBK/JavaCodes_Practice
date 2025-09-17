package StringProg;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupWords {

	public static void main(String[] args) {

		String input="java is java code is java code";

		String[] words = input.split("\\s+");

		Set<String> st = new LinkedHashSet<>();

		for(String str:words)
			st.add(str);

		System.out.print(String.join(" ", st));

	}

}

//String.join(" ", st) →
//👉 Takes all unique words from the set 'st' and concatenates them into a single string, separated by spaces.

//"String.join() is a static utility method in the String class.
//It is used to concatenate multiple strings into a single string with a specified delimiter.
//It works on arrays or any Iterable of CharSequence (like List, Set, etc.).
//Unlike manual concatenation with +, String.join() is cleaner and avoids boilerplate code.
//In my code, String.join(" ", st) is joining all unique words from the LinkedHashSet into one string, separated by spaces."

//-------Another way without using collections.................

//String input = "Hello World! is Hello not good";
//
//String[] words = input.split("\\s+");
//
//String result = "";
//for (int i = 0; i < words.length; i++) { 
//
//    boolean flag = false; // reset for each word
//
//    for (int j = 0; j < i; j++) {
//        if (words[i].equalsIgnoreCase(words[j])) {
//            flag = true;
//            break;
//        }
//    }
//
//    if (!flag) {
//        result += words[i] + " ";
//    }
//}
//System.out.println(result.trim());









