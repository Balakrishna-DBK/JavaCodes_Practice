package StringPrograms;

public class SwapingOfCharsNums {

	public static void main(String[] args) {
		
		   String input= "000012345"; //123450000
		      int targetCou = 4;
		      
		      if(targetCou <= input.length()){
		        String result= input.substring(targetCou) + input.substring(0, targetCou);
		        System.out.print(result);
		      }
	}

}
/*

String input= "7891234";   // 2347891
int targetCou = 3;

if(targetCou <= input.length()){
 String result= input.substring(input.length() - targetCou) + input.substring(0, input.length() - targetCou);
 
 System.out.print(result);
}
-------------------------------------------------------------------------------------------------------------------------------
String input= "00001234";

int count=0;
StringBuilder sb = new StringBuilder();

for(char ch:input.toCharArray()){
   if(ch=='0')
   count++;
   else
   sb.append(ch);
} for(int i=0; i<count; i++){
   sb.append('0');
}System.out.print(sb); 

*/