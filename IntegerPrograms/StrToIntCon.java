package IntegerPrograms;

public class StrToIntCon {

	public static void main(String[] args) {
		
		String a= "10,000", b="20,000";
	      
	      int a1 = Integer.parseInt(a.replaceAll(",",""));
	      int b1 = Integer.parseInt(b.replaceAll(",",""));
	      
	      System.out.println(a1+b1);

	}

}
