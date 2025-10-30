package IntegerPrograms;

public class Pallendrom {

	public static void main(String[] args) {
		
		int num=121;
		int reverse=0; 
		int original = num;
		
		while(num!=0) {
			int digit = num%10;
			reverse=reverse*10+digit;
			num/=10;
		}
		if(original==reverse)
			System.out.println("Pallendrom");
		else
			System.out.println("Not pallendrom");
	}

}
