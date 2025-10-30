package StringPrograms;

public class LowerToUpperViseversa {

	public static void main(String[] args) {
		
		String input = "IAM goiNG to office";
		
		StringBuilder sb = new StringBuilder();

		for(char ch:input.toCharArray()){
		    if(Character.isLowerCase(ch)){
		        sb.append(Character.toUpperCase(ch));
		    } else if(Character.isUpperCase(ch)){
		        sb.append(Character.toLowerCase(ch));
		    } else {
		        sb.append(ch);
		    }
		}
		System.out.print(sb.toString());

	}

}
