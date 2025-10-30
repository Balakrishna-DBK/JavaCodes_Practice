package GeneralCodePract;

 class parent {
	 
	 public void show1() {
		 System.out.println("parent class");
	 }
	 
	 public void display1() {
		 System.out.println("display method in parent class");
	 }
	
}
 
 class child extends parent {
	 
	 @Override
	 public void show1() {
		 System.out.println("chils class");
	 }
	 
	 public void display2() {
		 System.out.println("display method in chils class");
	 }
	
}

public class Casting {

	public static void main(String[] args) {
		parent obj = new child();
		obj.show1();     //Majorly focus on parent only, if you say overriden than child class method will execute, no matter w.r.t annotation, its just for compile time corrector. 
		//obj.display1();  //here display2 will not show bcz, both are diff methods..
		
		
		child cd = (child)obj;  //Here downcasted, so i can access All (both parent and child)..(Even child class can access both partent and child without casting..)
		cd.show1(); cd.display1(); cd.display2();
		
		//((child) obj).display1();   // child c1 = (child) obj; can also do this____downcasting....

		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		child objj = new child(); objj.display1(); objj.display2(); objj.show1();
		
	    parent pr = (parent) new child();
	    pr.show1(); pr.display1();    // this upcasting,,, can able to acess only parent.....
	    

	}

}
