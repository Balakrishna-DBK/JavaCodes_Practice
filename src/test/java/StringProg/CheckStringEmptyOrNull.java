package StringProg;

public class CheckStringEmptyOrNull {

	public static void main(String[] args) {
		String str = "Hello";                             // Try changing this to null, "Hello", " "

        if (str == null || str.isEmpty()) {
            System.out.println("String is null or empty");
        } else {
            System.out.println("String is not empty");
        }
	}

}
