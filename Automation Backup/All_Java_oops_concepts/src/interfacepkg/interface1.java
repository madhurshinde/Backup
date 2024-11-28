package interfacepkg;

public interface interface1 {
    int a =20;              // variable in interface are always Public,static,final
    int b =35;
    int c = 45;
    
	
	public void test1();                                //incomplete method  in interface no need to use abstract  or public keyword 
	public void test2();                                // we only declare method and use later as required
	public void test3();
	
	public static void test9() {                        // we can give body to static method        
		System.out.println(" After java 8 we can write body to static method ");
	}
	public static void main(String[] args) {
		interface1.test9();
	
	}
}


