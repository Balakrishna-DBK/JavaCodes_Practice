package StringProg;

public class UpperAndLowerCase {

    public static void main(String[] args) {
    String input ="BaLa KrishNA";

    String lower="";
    for(char ch:input.toCharArray()){
        if(ch>='A' && ch<='Z'){
          lower+=(char) (ch+32);
        }
        else
        lower+=ch;
    }
    System.out.println(lower);
 
    }
}

//String upper="";
//for(char ch:input.toCharArray()){
//    if(ch>='a' && ch<='z'){
//      upper+=(char) (ch-32);
//    }
//    else
//    upper+=ch;
//}
//System.out.println(upper);
//
//}                              ASCI A--65-90,,,,, a--97-122

