package IntegerPrograms;

public class FibonaciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
	
		for(int i=1; i<=10; i++) {
			
			System.out.print(a+" ");
			
			int temp = a+b;
			a=b;
			b=temp;
		}

	}

}
