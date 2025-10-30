package StringPrograms;

public class Permitation {

	public static void main(String[] args) {
		
		 String str = "abc";
	      permut(str,"");

	    }public static void permut(String str, String ans){
	        if(str.isEmpty()){
	            System.out.print(ans+" ");
	            return;
	        } for(int i=0; i<str.length(); i++){
	            char ch = str.charAt(i);
	            String result = str.substring(0,i)+str.substring(i+1);
	            permut(result, ans+ch);
	        } 
	}

}
