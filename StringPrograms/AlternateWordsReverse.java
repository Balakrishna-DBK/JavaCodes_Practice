package StringPrograms;

public class AlternateWordsReverse {

	public static void main(String[] args) {

		String input = "iam going to also office";   //gniog iam osla to office 
		String[] words = input.split("\\s+");

		String result="";
		for(int i=0; i<words.length; i++){
			String rev="";
			if(i%2 != 0){
				for(int j=words[i].length()-1; j>=0; j--){
					rev+=words[i].charAt(j); 
				} result+=rev+" ";
			} else
				result+=words[i]+" ";
		} System.out.println(result);       //----------iam gniog to osla office ----------  
		String[] sp = result.split("\\s+");

		for(int i=0; i<sp.length-1; i+=2){
			String temp = sp[i];
			sp[i]=sp[i+1];
			sp[i+1]=temp;
		}
		for(String res:sp)
			System.out.print(res+" ");
		//System.out.print(String.join(" ",sp));--- instead of for loop can use this
	}

}
//String.join() is a static method in the String class that concatenates elements of a sequence (like an array or a list) 
//into a single string, with a specified delimiter between each element.


