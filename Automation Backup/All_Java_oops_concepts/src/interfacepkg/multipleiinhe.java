package interfacepkg;

public class multipleiinhe implements interface1,interface2 {   //multiple inheritance  done inheritance

	public void test1() {                                                     
	    System.out.println("complete test 1");
	}
	
	
	public void test2() {
		System.out.println("complete test 2");
	}
	public void test3() {
		System.out.println("complete test 3");
	}
	public void test4() {
		System.out.println(" complete test 4 ");
	}
	public void test5() {
		System.out.println(" complete test 5 ");
	}
	public void test6() {
		System.out.println("complete test 6");
	}
	public static void main(String[] args) {
		multipleiinhe obj = new multipleiinhe();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		obj.test5();
		obj.test6();
	  
	}
	}
		
