package multipleinheritance;

public class trynew implements interface1,interface2,interface3 {
	 public void test() {                     // interface 1
			System.out.println("hi ");
			
		}

		public void test2() {
	       System.out.println("hello");
			
		}

		public void demo() {                      // interface2
	      System.out.println("Namaste");	
		 	
		}
		public void mymethod() {
			System.out.println("3");
		}

		public static void main(String[] args) {
			
		trynew l = new trynew();
		l.test();
		l.test2();
		l.demo();
		l.mymethod();
}
}
