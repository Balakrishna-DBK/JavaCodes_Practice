package StringPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CapFstChar {

	public static void main(String[] args) {
		
    String input = "my name i&3s ba?/lu".replaceAll("[^a-zA-Z\\s]", "");  //Balu Is Name My
        
        String[] words = input.split("\\s+");
   
        List<String> li = new ArrayList<>();
       
        for(String word:words){
        if(words.length > 0){
         
          String result = Character.toUpperCase(word.charAt(0))
                         + word.substring(1).toLowerCase();
                li.add(result);
        }
       } 
       Collections.reverse(li);
       
       System.out.print(String.join(" ", li));

	}

}
