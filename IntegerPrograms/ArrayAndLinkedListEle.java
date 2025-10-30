package IntegerPrograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndLinkedListEle {

	public static void main(String[] args) {
	  
		List<Integer> arrayList = new ArrayList<>();
	    List<Integer> linkedList = new LinkedList<>();

	   long start = System.nanoTime(); 

	    for(int i =0; i<=10000; i++){
	        arrayList.add(i);
	    }    
	    long end = System.nanoTime();

	    System.out.println("ArrayList adding: "+(end-start)+"ns");
	  
	    start = System.nanoTime(); 

	    for(int i =0; i<=10000; i++){
	        linkedList.add(i);
	    }    
	     end = System.nanoTime();

	     System.out.println("Linkedlist adding: "+(end-start)+"ns");

	     start = System.nanoTime(); 

	    for(int i =0; i<=10000; i++){
	        arrayList.get(i);
	    }    
	     end = System.nanoTime();

	     System.out.println("ArrayList getting: "+(end-start)+"ns");

	     start = System.nanoTime(); 

	    for(int i =0; i<=10000; i++){
	        linkedList.get(i);
	    }    
	     end = System.nanoTime();

	     System.out.println("Linkedlist gettings: "+(end-start)+"ns");

	}

}
