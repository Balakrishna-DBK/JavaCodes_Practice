package StringPrograms;

public class StringSepecCharReverse {

	public static void main(String[] args) {
		 
		String input = "I am learning automation";  //I am learning nutomatioa
		
		String[] words = input.split("\\s+");

		   for(int i=0; i<words.length; i++){
		    if(words[i].equalsIgnoreCase("automation")){
		       
		        char[] ch = words[i].toCharArray();
		      int indexA =-1; int indexN =-1;

		      for(int j=0; j<ch.length; j++){
		        if(ch[j]=='a'){
		            indexA=j;
		            break;
		        }
		      } for(int j=ch.length-1; j>=0; j--){
		        if(ch[j]=='n'){
		            indexN=j;
		            break;
		        }
		      } 
		      if(indexA !=-1 && indexN != -1){
		        char temp= ch[indexA];
		        ch[indexA]=ch[indexN];
		        ch[indexN]=temp;
		      }
		       words[i]= new String(ch);

		    }  
		   } String result = String.join(" ",words);
		   System.out.print(result);

	}

}
