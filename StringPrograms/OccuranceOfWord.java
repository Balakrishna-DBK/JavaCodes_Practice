package StringPrograms;

public class OccuranceOfWord {

	public static void main(String[] args) {
		
		String input = "jaxsjavaisalwaysjavaandjayjavaisgood";
        String target = "java";
        int count = 0;
       
        for(int i=0; i<=input.length() -target.length();  ){
           String sub = input.substring(i, i+target.length());
               if(sub.equals(target)){
                count++;
               i+=target.length();  
           } else{
               i++;
           }
        }
        System.out.print(target+"===="+count);

	}

}
