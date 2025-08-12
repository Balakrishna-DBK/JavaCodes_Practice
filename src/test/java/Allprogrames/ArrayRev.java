package Allprogrames;

import java.util.Scanner;

public class ArrayRev {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		
		int size = sc.nextInt();
		 System.out.println("Enter all the array elements: ");
		 
		 int numbers[] = new int[size];
		
		 for(int i=0; i<size; i++) {
			 numbers[i]=sc.nextInt();
		 }
		 ArrayReverse(numbers);
		 
		 for(int num: numbers) {
			 System.out.println("Reverse array is: " +num);
		 }
		 
	}
	public static void ArrayReverse(int[] arr) {
		int left=0;
		int right = arr.length-1;
		while(left<right) {
			int temp = arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		
	}

}
