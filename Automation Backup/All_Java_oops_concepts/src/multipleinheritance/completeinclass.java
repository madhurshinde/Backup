package multipleinheritance;

public class completeinclass implements interface3 {  // implimentation only body provide multiple hote ka????

	
      public void test() {
		System.out.println("hi ");
		
	}

	public void test2() {
       System.out.println("hello");
		
	}

	public void demo() {
      System.out.println("Namaste");	
	 	
	}
	public void mymethod() {
		System.out.println("interface3");
	}
    	
	public static void main(String[] args) {
		completeinclass o =new completeinclass();
		o.test();
		o.test2();
		o.demo();
		o.mymethod();
	}
         
	
}
