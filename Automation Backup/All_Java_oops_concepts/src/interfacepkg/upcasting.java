package interfacepkg;

public class upcasting extends class01 {        // class01 is implimentation class
	
 public void test1() {                                 // overriding of test1
	 System.out.println("test 1 body given override ");
 }
 
 public static void main(String[] args) {
	  interface1 obj = new upcasting();        // upcasting completed method  to interface1
          obj.test1();
          obj.test2();
          obj.test3();
 
 }

}
