package StringProg;
import java.util.*;
import java.util.regex.Pattern;

public class SpecificWordReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String ReqWordtoRev = sc.nextLine();
		
		if(!input.contains(ReqWordtoRev)) {
			System.out.println("The word is not matching entered one");
		}else {
			String rev = new StringBuilder(ReqWordtoRev).reverse().toString();
			
			String output = input.replaceFirst(ReqWordtoRev, rev);
			
			System.out.println(output);
			
		}
		

	}

}
