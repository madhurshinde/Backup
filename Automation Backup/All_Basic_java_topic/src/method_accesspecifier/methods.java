package method_accesspecifier;

public class methods {
	
	public void test() {                            // non-static method (user define method cl by creating obj then obj.method)
		System.out.println("non static method call in main method");
	}
	public static void test2() {                   // non static method (user define method cl by classname.method) 
		System.out.println("static method call in main method");
	}
	public static void main(String[] args) {       // main method main method u cant change main method (system define method, jvm cl main method )
		
	System.out.println(" we can not run java program wihtout main method ///static non static use in class but outside main method up and down anywhere ");
	
		methods obj =new methods();               //Object creation
		obj.test();                               // call non-static method with obj 
		methods.test2();                          // call static method
		
	}

}
