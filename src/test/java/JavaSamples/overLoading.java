package JavaSamples;

public class overLoading {
	
	void bank(int cash) {
		System.out.println(" This is for cash: " +cash);
	}
	
	void bank(String checkbookNo) {
		System.out.println(" This is for checkbook: " +checkbookNo);
		
	}
	void bank(double amout, String upID) {
		System.out.println(" This is for amout: " +amout+ "this is for upID" +upID);
	}

	public static void main(String[] args) {
		
		overLoading  obj = new overLoading();
		obj.bank(5000);
		obj.bank("123strrr");
		obj.bank(200, "asndndj1234");

	}

} 

//Method Overloading (Compile-time Polymorphism)

//When two or more methods in the same class have the same name
//but different parameters (different type, number, or order), it is called method overloading.
//
//Resolved at compile time.
//
//Return type can be same or different, but it does not play a role in overloading.
