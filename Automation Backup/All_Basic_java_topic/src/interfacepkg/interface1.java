package interfacepkg;

public interface interface1 {
	
    int a =20;              // variable in interface are always Public,static,final
    int b =35;
    int c = 45;
    
	void test1();    		//incomplete method .no need to use abstract or public keyword 
	void test2();    		// we only declare method and use later as required
	
	static void test3() {              // After java 8 we can write body to static method       
		System.out.println("Interface 1 =public static method with body");
	}
	
	private static void test4() {			//hello private keyword accept after java 9
		System.out.println("interface 2 = private static method with body");
	}
	public static void main(String[] args) {
		interface1.test3();
		interface1.test4();
	}
}


