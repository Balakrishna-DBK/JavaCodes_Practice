package IntegerPrograms;

public class ArmstrongNum {

	public static void main(String[] args) {
		int num=153;
		int sum=0;
		int original =num;
		int digits = String.valueOf(num).length();
		
		while(num!=0) {
			int digit = num%10;
			sum+=Math.pow(digit, digits);
			num/=10;
		}
		if(sum==original)
			System.out.println("Armstrong num");
		else {
			System.out.println("Not armstrong num");
		}
	}

}
/*

   int num = 153;
    int count=0; int result=0;
    int original =num;
    
     int temp=num;        // First loop to count digits
     while(temp != 0){
         count++;
         temp/=10;
     } 
     temp=num;
     while(temp !=0){                      //// Calculate sum of digits raised to the power of 'digits'
         int digit = temp%10;
         int power = 1;
         for(int i=0; i<count; i++){
             power *= digit;
         } result+=power;
         temp/=10;
     }
    if(original==result)
        System.out.print("Armstromg");
        else
            System.out.print("not Armstromg");

*/