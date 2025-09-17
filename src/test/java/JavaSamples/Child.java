package JavaSamples;

public class Child extends Parent { 
	int a;
	
	public Child() {
		this(2);
		System.out.println(1);
		
	}
	
	public Child(int a) {
		super();
		this.a=a;
		System.out.println(super.child1);
		System.out.println(a);
	}
	
	
	String child = "Bala";
			
		@Override
    	 void animal() {
		    System.out.println("This is child ANIMAL CLASS");
		}
		
		void animal2() {
		    System.out.println("This is child ANIMAL2 CLASS");
		}

	
	public static void main(String[] args) {
		
//		Parent parent = new Parent();
//		parent.animal();
		
//		Child cc = (Child) new Parent();
//		cc.animal();
		
//		Child c = new Child();
		
		
		//upcasting
		Parent child = new Child();
		child.animal();
		System.out.println(child.child1);
		
		System.out.println("========================================");
		
		//downCast
		Child c= (Child) child;
		System.out.println(c.child);
		System.out.println(c.child1);
		c.animal();
		c.animal1();
		c.animal2();
		
		System.out.println("==========&&&&&&&&&&&&&&&&&&&&&&&&=============================");
		
		Child c1=new Child();
		System.out.println(c1.child);
		System.out.println(c1.child1);
		c.animal();
		c.animal1();
		c.animal2();
		
	}

}
