package IntegerTypeCode;

import java.util.ArrayList;
import java.util.List;

public class SumAndAvg {

	public static void main(String[] args) {

		int[] input = {5, 3, 2, 2};
		int count=input.length;

		List<Integer> li = new ArrayList<>();
		int sum=1;
		for(int res:input){
			sum*=res;
		    }
		double avg = (double) sum/count;
		
		System.out.println(avg); 
		System.out.println(sum);
	}
}
