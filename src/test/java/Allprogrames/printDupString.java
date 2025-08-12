package Allprogrames;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class printDupString {

	    public static void main(String[] args) {
	    // String input = "Bala krishna";
	    
	   Scanner sc= new Scanner(System.in);
	   String input= sc.nextLine();
	   
	   printDup(input);
	   
	}
	    public static void printDup(String str){
	    
	    Set<Character> seen = new HashSet<>();
	    Set<Character> dup = new LinkedHashSet<>();
	    
	    for(char ch:str.toCharArray()){
	        if(ch==' ') continue;
	        if(seen.add(ch))
	        dup.add(ch);
	    }
	    for(char cr: dup)
	    System.out.print(cr);
	}
	
}


//-------Remove Dup in String----------
//String input = "Bala Krishna";
//
//Set<Character> st = new LinkedHashSet<>();
//StringBuilder sb = new StringBuilder();
//
//for(char ch:input.toCharArray()){
//    if(st.add(ch))
//    sb.append(ch);
//} 
//System.out.print(sb.toString());
//}
