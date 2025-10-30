package IntegerPrograms;

public class RemoveDup {

	public static void main(String[] args) {

		int[] input = {2, 5, 10, 2, 5, 28};
		int length=input.length;

		for(int i=0; i<length; i++){

			for(int j=i+1; j<length; j++){
				if(input[i]==input[j]){
					for(int k=j; k<length-1; k++){
						input[k]=input[k+1];
					}
					length--;   
					j--;
				}
			} 
		} for(int i=0; i<length; i++){
			System.out.print(input[i]+" ");
		}
	}

}

/*
for(int i=0; i<length; i++){                        simply can use count also..
     int count =0;
       for(int j=i+1; j<length; j++){
           if(input[i]==input[j]){
              count++;
           }
       } if(count ==0){
           System.out.print(input[i]+" ");
       } 
   }

*/



