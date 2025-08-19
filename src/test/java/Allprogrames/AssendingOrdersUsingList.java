package Allprogrames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AssendingOrdersUsingList {

	public static void main(String[] args) {
		//Type1();
		Type2();
		Type3();

	}
	public static void Type1() {
		Integer[] input = {20, 30, 5, 40, 5};

		List<Integer> li = Arrays.asList(input);

		Collections.sort(li);

		for(int res:li){
			System.out.print(" "+res);
		}
	}
	public static void Type2() {
		int[] input = {20, 30, 5, 40, 5};

		List<Integer> li = new ArrayList<>();

		for(int con:input)
			li.add(con);   // Auto-boxing from int to Integer

		Collections.sort(li);

		for(int res:li){
			System.out.print(" "+res);
		}

	}

	public static void Type3() {
		int[] input = {20, 30, 5, 40, 5};

		Arrays.sort(input);

		for(int res:input){                   //for(int i=input.length-1; i>=0; i--) { Sysout(input[i])}
			System.out.print(" "+res);
		}
	}
}

//✅ Interview-friendly Answer
//
//👉 "Collections.sort() does not work directly on primitive arrays like int[], because it expects a List of objects. "
//		+ "Since primitives are not objects, we need to convert them into their wrapper class (Integer[]) or into a List<Integer>."
//		+ " Once converted, we can use Collections.sort() to sort them. If we want to sort a primitive array directly, we use Arrays.sort(), which supports both primitive and object arrays."



