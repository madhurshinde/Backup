package interfacepkg;

public interface interface2 {
	
	void test5();       //incomplete method in interface no Need of public and abstract keyword
	void test6();      // we only declare method and use later as required
	
	static void test7() {       // we can give body to static method        
		System.out.println(" 2nd interface = static public method");
	}
	
	private static void test8() {		// we can use private method
		System.out.println("2nd interface= Private Static methods");
	}
	
	static void main(String[] args) {		//main method also no need to mention public keyword
		interface2.test7(); 
		interface2.test8();
	}  }


