package StringPrograms;

public class VowelsCount {

	public static void main(String[] args) {
       
		String input = "Balakrishna".toLowerCase();
        char[] ch = input.toCharArray();
        int count =0;
      
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u'){
                count++;
            }
        } 
          System.out.print(input+"...."+count);

	}

}
//For consonents

//String input = "Balakrishna".toLowerCase();
//char[] ch = input.toCharArray();
//int count =0;
//for(int i=0; i<ch.length; i++){
//   
//    if(Character.isLetter(ch[i]) && !(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u')){
//        count++; -------Simply we can ignore "Character.isLetter(ch[i]) &&" and keep "!"......
//    }
//} System.out.print(input+"...."+count);