package Allprogrames;

public class SpecificWordCountInStr {

	public static void main(String[] args) {
	      String input ="Javatest is first lang";
	      
	      int actual = input.length();
	      
	     // System.out.println(actual);
	      
	    int count_afterRemove = input.replace("a", "").length();
	   
	  //  System.out.println(count_afterRemove);
	    
	    int total = actual-count_afterRemove;
	      System.out.println("occurance of a in a string is : "+total);

	}

}
