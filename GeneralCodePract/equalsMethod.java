package GeneralCodePract;

public class equalsMethod {

	public static void main(String[] args) {
		
//		int a=20;
//		int b=20;
//		
//		System.out.println(a==b); // (true),, if "a.equals(b)" we can't invoke like this..
//		System.out.println(a=b); //o/p--20
//		
//		String s1 ="balu";
//		String s2 ="balu";
//		
//		System.out.println(s1==s2); // true,,s1.equals(s2)--true only
//		
//		
//		String a1 = new String("krishna");
//		String a2 = new String("krishna");
//		
//		System.out.println(a1==a2);           //false
//		System.out.println(a1.equals(a2));    //true
//--------------------------------------------------------------------------------------------------------
		Employee emp1 = new Employee(1, "bala");
		Employee emp2 = new Employee(1, "bala");
		
		System.out.println(emp1==emp2); //false as usall 
		System.out.println(emp1.equals(emp2)); //without override it will give 'false' only..,, after override 'true'.
		
		
		
	}	
		
	}
	class Employee extends Object{  //Here by defalut it extends the 'Object' class there we have only (this == obj) so, we have to override
	
		private int id;
		private String name;
	
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj==null || getClass() != obj.getClass()) return false;
		Employee employee = (Employee) obj;
		return id == employee.id && name.equals(employee.name);
	}
	
}


