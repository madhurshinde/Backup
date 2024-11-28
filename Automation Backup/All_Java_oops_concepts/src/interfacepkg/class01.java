package interfacepkg;

public class class01 implements interface1 {              // class which complete  the method of an interface is called implementation class

	public void test1() {                                    // test 1 completed 
		System.out.println("test 1 body given " +(a+b));}
	
	public void test2() {                                   // test 2 completed 
		System.out.println(" Test 2 body given " +b);	}
	
	public void test3() {                                 // test 3 completed 
		System.out.println("Test 3 Body Given "+c);   }
	
	public static void test4() {
		System.out.println( " After java 8 we can write body to static method  also override " );
	}
	public static void main(String[] args) {
		class01 obj =new class01();                     // create object 
		obj.test1();                                    // call test 1
		obj.test2();                                    // call test 2
		obj.test3();                                    // call test 3
	    class01.test4();                                // call test 4 static method
	    
}}
