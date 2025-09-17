package IntegerTypeCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SecondLargestNum {

	public static void main(String[] args) {
		
		int[] input = {5, 3, 2, 10, 2}; 
		
		Set<Integer> st = new LinkedHashSet<>();
		
		for(int dupre:input)
			st.add(dupre);
			
		List<Integer> li = new ArrayList<>();       //List<Integer> li = new ArrayList<>(st); ===>>Below 22 and 23 lines not req.....

	        for(int res:input)
	        li.add(res);

	        Collections.sort(li, Collections.reverseOrder());

	        System.out.println(li);
	        System.out.print(li.get(1));

	}

}
