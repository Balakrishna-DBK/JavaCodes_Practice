package IntegerPrograms;

public class AscendingAndDescSwap {

	public static void main(String[] args) {
		
		int[] nums = {2, 5, 6, 7, 1};
	       
	       for(int i=0; i<nums.length; i++){
	          
	    	   for(int j= i+1; j<nums.length; j++){
	               if(nums[i]>nums[j]){
	                   int temp = nums[i];
	                   nums[i]=nums[j];
	                   nums[j]=temp;
	               }
	           }
	       } for(int res:nums)
	       System.out.print(res+" ");    //--------1 2 5 6 7
	        
	        for(int i=0; i<nums.length-1; i+=2){
	            int temp= nums[i];
	            nums[i]=nums[i+1];
	            nums[i+1]=temp;
	        } 
	        for(int result:nums)
	        System.out.print(result+" ");//------2 1 6 5 7

	}

}
