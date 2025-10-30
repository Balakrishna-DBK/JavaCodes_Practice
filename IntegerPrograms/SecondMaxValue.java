package IntegerPrograms;

public class SecondMaxValue {

	public static void main(String[] args) {
		int[] input = {10, 10, 40, 60, 55};
		
		int fMax = Integer.MIN_VALUE;
		int sMax = Integer.MIN_VALUE;
	
		for(int i=0; i<input.length; i++) {
			if(input[i]>fMax) {
				sMax = fMax;
				fMax=input[i];
			} 
			else if(input[i]>sMax && input[i]!=fMax)
				sMax=input[i];
		}
		System.out.println(sMax);
	}

}
