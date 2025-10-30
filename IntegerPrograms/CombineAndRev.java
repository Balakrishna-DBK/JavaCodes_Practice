package IntegerPrograms;

public class CombineAndRev {

	public static void main(String[] args) {
		
		   int[] arr1 = {1, 2, 3};
	       int[] arr2 = {4, 5,6};
	       
	       int[] combined = new int[arr1.length + arr2.length];
	       
	       for(int i=0; i<arr1.length; i++){
	           combined[i]=arr1[i];
	       }
	       for(int i=0; i<arr2.length; i++){
	           combined[arr1.length+i]=arr2[i];
	       }  
	       
	       for(int fres:combined)
	    	   System.out.println(fres); //1,2,3,4,5,6
	       
	         reverse(combined);
	         for(int res:combined)
	         System.out.print(res); //6,5,4,3,2,1
	  
	    }public static void reverse(int[] arr){
	        int left=0;
	        int right=arr.length-1;
	        while(left<right){
	            int temp=arr[left];
	            arr[left]=arr[right];
	            arr[right]=temp;
	            left++;
	            right--;
	        }
	    }

}
