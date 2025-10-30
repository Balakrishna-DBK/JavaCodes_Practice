package StringPrograms;

public class RemoveDupWords {

	public static void main(String[] args) {
		String input ="automation is automation is good";   //automation is good
		String[] words = input.split("\\s+");
		String result ="";
		
		for(int i=0; i<words.length; i++) {
			
			boolean flag =false;
			for(int j=0; j<i; j++) {
				if(words[i].equalsIgnoreCase(words[j])) {
					flag=true;
					break;
				}
			}
			if (!flag)                   //if you remove "!" then dup words will print...
				result+=words[i]+" ";
		}
		System.out.println(result);
	}
         // 
} 
// Remove dup char and printing unique.......

//String input = "abcdba hvd hs".replaceAll(" ", "");         //a b c d h v s 
//char[] words = input.toCharArray();
//String result="";
//for(int i=0; i<=words.length-1; i++){
//
//  boolean flag =false;
//   for(int j=0; j<i; j++){
//       if(words[i]==words[j]){
//           flag=true;
//           break;
//       }
//   }if(!flag)
//       result+=words[i]+" ";
//} System.out.print(result);
