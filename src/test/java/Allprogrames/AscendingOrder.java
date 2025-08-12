package Allprogrames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AscendingOrder {
	
	public static void main(String[] args) {
		//type1();
		revDupSortAssending();
		
		
	} public static void type1() {
		
		// Integer[] input = {10, 20, 10, 45, 6};  
	   // List<Integer> list = new ArrayList<>(Arrays.asList(input));
		
		
		 int[] input = {10, 60, 30, 40, 50};

	        List<Integer> li = new ArrayList<>();
	        
	        for(int res:input)
	        li.add(res);

	        Collections.sort(li, Collections.reverseOrder());  //Collections.sort(li) //Collections.reverse(li);

	        System.out.print(li);
	        }
		
//		int[] input = {10, 20, 30};
//		List<Integer> list = new ArrayList<>();
//		for (int num : input) {
//		    list.add(num);  // Auto-boxing from int to Integer
//		}
//		System.out.println(list.size());  // Output: 3
	
	public static void revDupSortAssending() {
		
				
        int[] input = {10, 10, 60, 30, 40, 50};

        Set<Integer> st = new TreeSet<>(Collections.reverseOrder()); //  Collections.sort();  //Collections.sort(li) //Collections.reverse(li);
        
        for(int res:input)
        st.add(res);

        for(int result:st)
       System.out.print(result+ " " );      

			
	}
}
