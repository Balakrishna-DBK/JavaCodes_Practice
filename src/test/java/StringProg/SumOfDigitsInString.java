package StringProg;

public class SumOfDigitsInString {

	public static void main(String[] args) {
		String res=""; int sum=0;

		String input = "Iam b234ala 34 krish67 89";
		String[] words = input.split("\\s+"); 

		for(String word:words) {
			String digits = word.replaceAll("[^0-9]", "");
			if(!digits.isEmpty()) {
				res+=digits+" ";
				sum+=Integer.parseInt(digits);
			}
		}   System.out.println(res);
		System.out.println(sum);

	}
}

// =====>>>> Second number in a string <<=================

//String input = "My acc22out number is 12345 and 54321";
//String[] words = input.split("\\s+");
//
//List<Integer> li = new ArrayList<>();
//
//for(String word:words){
//  String digits = word.replaceAll("[^0-9]", "");
//  if(!digits.isEmpty()){
//    li.add(Integer.parseInt(digits));            
//  } 
//}
//if(li.size()>=1){
//   System.out.print(li.get(2));  
//}
