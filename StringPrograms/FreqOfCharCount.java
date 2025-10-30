package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FreqOfCharCount {

	public static void main(String[] args) {
		
		String input = "Iam going to office".toLowerCase();
				
		Map<Character, Integer> mp = new LinkedHashMap<>();
		
		for(char ch:input.toCharArray()) {
			if(ch==' ') continue;
			mp.put(ch, mp.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry:mp.entrySet())
			System.out.println(entry.getKey()+"===>"+entry.getValue());
	}

}
/*
char maxchar =0;                           //Only max char count will print..
         int maxcount=0;
         
        for(Map.Entry<Character, Integer> entry:mp.entrySet()){
            if(entry.getValue() > maxcount){
                maxchar=entry.getKey();
                maxcount=entry.getValue();
            }
        } System.out.print(maxchar+"--"+maxcount);
-------------------------------------------------------------------------------------------------------------------------
        
   List<Map.Entry<Character, Integer>> list = new ArrayList<>(mp.entrySet());
         list.sort(Map.Entry.<Character, Integer>comparingByValue().reversed());      //if u remove reversed() then assending order.
         
        for(Map.Entry<Character, Integer> entry:list){
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }       
        
        

*/