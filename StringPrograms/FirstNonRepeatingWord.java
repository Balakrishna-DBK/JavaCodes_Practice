package StringPrograms;

public class FirstNonRepeatingWord {

	public static void main(String[] args) {
		String input ="Iam to going to office, office".toLowerCase();
        String[] words = input.replaceAll(",","").split("\\s+");
         String result=""; String rev="";
       
      for(int i=0; i<words.length; i++){
          int count =0;
          for(int j=0; j<words.length; j++){
              if(i!=j && words[i].equalsIgnoreCase(words[j])){
                 count++;
              }
          }if(count==0){
              System.out.print(words[i]+" ");
            // break;
          }
      }

	}

}
