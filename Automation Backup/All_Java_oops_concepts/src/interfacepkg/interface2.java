package interfacepkg;

public interface interface2 {
	
	public void test4();                                //incomplete method  in interface no need to use abstract  or public keyword 
	public void test5();                                // we only declare method and use later as required
	public void test6();
	
	public static void test8() {                        // we can give body to static method        
		System.out.println(" 2nd interface ");
	}
	public static void main(String[] args) {
		interface2.test8();      // pending multiple interface in inheritance 
	}
	
	

}
