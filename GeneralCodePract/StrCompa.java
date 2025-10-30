package GeneralCodePract;

public class StrCompa {

	public static void main(String[] args) {
		
		int x=10;
		   Integer y=10;   //int y=10... then sysout(a.equals(b)),,, compile time error
		 
		   System.out.println(y.equals(x)); //(true)..Also, viseVersa works,, here during run time AutoBoxing will happen..
		   System.out.println(x==y); //true..
		   
		 String s1 ="abc";
		 String s2 ="abc";
		 String s3 = s1+s2;
		 String s4 = "abcabc";
		   
		   System.out.println(s3==s4);//(false) This is a runtime concatenation of two strings, using the + operator with variables causes the compiler to create a new String object on the heap, not in the String pool
		   System.out.println(s1==s2); //(true)Since "abc" already exists in the String pool, s2 points to the same object as s1.
		   System.out.println(s3.equals(s4)); //true
		   
		 final String a = "ab";
		 final String b ="c";
		 String c = a+b;
		 String d = "abc";
		   
		   System.out.println(c==d);//true..Since a and b are final, the compiler treats a + b as a constant expression and optimizes it at compile-time, so d becomes "abc" from the pool.
		  
		 String e = "hi";
		 String f = new String("hi");
		   
		   System.out.println(e==f);// false
		   System.out.println(e.equals(f)); //true
		   
		String str1 = "hello";
		String str2 = "he"+"llo";
	       String str3 = "java";
		   String str4 = "ja";
		   String str5= str4+"va";
		System.out.println(str1==str2);//true ...he" + "llo" is a compile-time constant expression.
		System.out.println(str3==str5); //false  
		
		String s= "java";
		s.concat("code"); 
		   
		   System.out.println(s); // "java" if u say-- "s=s.concat("code") then only "javacode" bcz,, string is immutable 
	}

}
