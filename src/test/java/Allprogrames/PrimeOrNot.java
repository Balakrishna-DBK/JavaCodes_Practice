package Allprogrames;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		
		//CheckPrimeOrNot();
		//multicheck();
		primenum();
		
	}
	public static void CheckPrimeOrNot() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num to check prime or not:");
		int input = sc.nextInt();
		
		int count =0;	
		for(int i=1; i<=input; i++) {
		     if(input%i==0)
		    	 count++;
		   }
			if(count==2) {
	    	 System.out.println(input+ " is a prime number");
	     } else
	    	 System.out.println(input+ " not aPrime");
}
	public static void multicheck() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num to check prime or not:");
		int input = sc.nextInt();
		
		int[] numbers = new int[input];
		
		for(int i=0;i<input;i++) {
			numbers[i]=sc.nextInt();
		}
		
		System.out.println("Prime numbers in the list are: ");
		
		for(int i =0; i< input; i++) {
			int num = numbers[i];
			
			int count=0;
			for(int j=1; j<=num; j++) {
				if(num%j ==0) 
					count++;
			}
			if(count==2)
				System.out.println(num);
		}
			
	}
	public static void primenum() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num to check prime or not:");
		int input = sc.nextInt();
		
		System.out.print("Prime numbers from 1 to " +input+ " are: ");
		
		for(int i=2;i<=input; i++) {
			
			int count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0)
					count++;
			}

			if(count==2) 
				System.out.println(i);
		}
	}
	
	
	
}
