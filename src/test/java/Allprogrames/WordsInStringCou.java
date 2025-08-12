package Allprogrames;

import java.util.Scanner;

public class WordsInStringCou {

	public static void main(String[] args) {
		
	    Scanner sc =new Scanner(System.in);
	    String input = sc.nextLine().trim();
	    
	    if(input.isEmpty()){
	        System.out.println(0);
	    }
	    else {
	        String[] words= input.split("\\s+");  // Regex pattern to matches the white space....
	        System.out.println(words.length);
	    }
    sc.close();
	}

}

//String inputt = input.replaceAll(" ", "");
//int count = inputt.length();
