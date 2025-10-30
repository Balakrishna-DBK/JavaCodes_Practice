package StringPrograms;


public class zz {
	
	public static void main(String[] args) {
		 String input = "aebbcdeeee";
	        StringBuilder sb = new StringBuilder();
	       
	        int count = 1;
	        for (int i = 1; i < input.length(); i++) {
	            if(input.charAt(i)==input.charAt(i-1)) {
	            count++;
	            } else{
	                sb.append(input.charAt(i-1)).append(count);
	                count=1;
	            }
	         }
	         sb.append(input.charAt(input.length()-1)).append(count);
	        System.out.print(sb); 
	}

}

