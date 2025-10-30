package StringPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String str1 = "Silent".toLowerCase();
        String str2 = "Listen".toLowerCase();
        
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        
        if(ch1.length != ch2.length){
            System.out.println("Not an Anagram");
            return;
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        if(Arrays.equals(ch1,ch2))
         System.out.print("Anagram");
         else
           System.out.print("Not Anagram");  

	}

}
