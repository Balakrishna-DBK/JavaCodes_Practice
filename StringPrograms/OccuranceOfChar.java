package StringPrograms;

public class OccuranceOfChar {

	public static void main(String[] args) {
		
		 String str = "Hello Java Developer".toLowerCase();
	     
	     char target = 'l';
	     int count=0;

	     for(int i=0; i<str.length(); i++){
	        if(str.charAt(i) == target)
	        count++;
	     }
	     System.out.print(target+"-occured-"+count);

	}

}
