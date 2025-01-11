package polymophisum;

public class StaticMethod2 {

	
//	public static void demo1() {
//		
//		System.out.println("parent Demo 1 Method 1");
//	}
	
	public void demo1() {				//sttic to nonstatic not allowed
		
		System.out.println("Child Demo 1 Method 1");
	}
	
	public static void demo2() {
		
		System.out.println("Child Demo 2 Method 2");
	}
	
	public static void demo3() {
		
		System.out.println("Child Demo 3 Method 3");
	}
		
	public static void main(String[] args) {
	
		StaticMethod1 sm1 = new StaticMethod1();
		sm1.demo1();				// parent Demo 1
		sm1.demo2();				//parent Demo 2
		sm1.demo3();				//parent Demo 3
		
		System.out.println(" ");
		StaticMethod2 sm2 = new StaticMethod2();
		sm2.demo1();   				// Child Demo 1
		sm2.demo2();				// Child Demo 2
		sm2.demo3();				// Child Demo 3

		
		System.out.println(" ");
//		StaticMethod1 sm3 =new StaticMethod2();
//		sm3.demo1();
//		sm3.demo2();
//		sm3.demo3();
		
		
	
	}
	
}
