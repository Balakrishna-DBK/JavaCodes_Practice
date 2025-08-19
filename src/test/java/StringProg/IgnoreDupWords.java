package StringProg;

import java.util.LinkedHashSet;
import java.util.Set;

public class IgnoreDupWords {

	public static void main(String[] args) {

		String input="java is java code is java code";

		String[] enhanceIp = input.split("\\s+");

		Set<String> seen = new LinkedHashSet<>();

		for(String str:enhanceIp)
			seen.add(str);

		System.out.print(String.join(" ", seen));

	}

}
