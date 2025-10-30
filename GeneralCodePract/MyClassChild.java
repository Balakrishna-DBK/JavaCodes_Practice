package GeneralCodePract;

public class MyClassChild extends MyClassParent {
	
	@Override
	public void animal() {
		System.out.println("Child Class Animal ");
		//super.animal();
	}
	public void sound() {
		System.out.println("This is Sound in Child Class");
	}
	
		

	public static void main(String[] args) {
		
		MyClassChild childclass = new MyClassChild();  //normal obj creation
		childclass.animal();
		
		System.out.println("-------------------------------");
		
		
	
		MyClassParent Cclass = new MyClassChild();  // upcasting def:: Creating obj for child and storing in parent class reference.
		Cclass.animal();  //parent.sound(); this will not work, it always points to parent class here...
		
		System.out.println("**********************************");
		
		MyClassChild ch = (MyClassChild) Cclass; //downcasting ,, (Note: Without upcasting, we cant do downcasting..)
		ch.animal();
		
		
		
		MyClassParent pr = new MyClassParent(); //normal obj creation 
		pr.animal();
//		
//		MyClassChild cr = (MyClassChild) pr; 
//		cr.animal();
		
		MyClassParent parentref = (MyClassParent) new MyClassChild();
		parentref.animal();
		
		
		
	}

}
