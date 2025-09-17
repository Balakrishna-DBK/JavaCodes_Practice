package IntegerTypeCode;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int[] number = new int[size];

		for(int i=0; i<size; i++){
			number[i] = sc.nextInt();
		}
		int max=number[0];
		for(int i=1; i<size; i++){
			if(number[i]>max)
				max=number[i];
		} 
		System.out.println(max);
		
		sc.close();
	}

}
//int[] input = {10, 30, 5, 40, 60, 3};
//
//int max = 0;
//for(int i=0; i<input.length; i++){
//   if(input[i]>max)
//   max=input[i];
//} System.out.print(max); 


