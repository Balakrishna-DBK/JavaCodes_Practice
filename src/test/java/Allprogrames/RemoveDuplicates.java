package Allprogrames;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		
		int size = sc.nextInt();
		 System.out.println("Enter all the array elements: ");
		 
		 int numbers[] = new int[size];
		 for(int i=0; i<size; i++) {
			 numbers[i]=sc.nextInt();
		 }
		 
		 Set<Integer> hash_set = new TreeSet<Integer>();
		 
		 for(int i=0; i<size; i++) {
			 hash_set.add(numbers[i]);
		 }
		 System.out.println(hash_set);
	} 

}
