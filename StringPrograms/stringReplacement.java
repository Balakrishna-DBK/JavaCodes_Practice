package StringPrograms;

public class stringReplacement {

	public static void main(String[] args) {
		
	    String input = "goodmorninggoodafternoongoodeveninggoodnight";
	      String target = "good";
	      int count=0;
	      StringBuilder sb = new StringBuilder();
	      
	      int i=0;
	      for(i=0; i<input.length() - target.length(); ){
	         
	          String sub = input.substring(i, i+target.length());
	             
	             if(sub.equals(target))
	             {
	              count++;
	              if(count==4)
	                sb.append("bad"); 
	                 else
	                     sb.append(target);
	              
	              i+=target.length();
	             } else{
	                 sb.append(input.charAt(i));
	                 i++;
	             }
	      } 
	          sb.append(input.substring(i));
	          
	        System.out.print(sb);  
	}

}
