package IntegerPrograms;

public class PrimeNums {

	public static void main(String[] args) {
		
		for(int i=2; i<=100; i++){
	          int count=0; 
	           for(int j=2; j<=i/2; j++){
	               if(i%j==0){
	                   count++;
	                   break;
	               }
	           }
	           if(count==0){
	             System.out.println(i+" ");  
	           }
	       }

	}

}
/*
 int num=7;
       int count=0;
       
      for(int i=1; i<=num; i++){
       if(num%i==0){
           count++;
       }
      } if(count==2)
           System.out.print("prime");
         else
         System.out.print("Not prime");
 */
