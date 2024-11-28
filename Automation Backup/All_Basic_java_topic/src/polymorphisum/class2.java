package polymorphisum;

public class class2 extends class01 {                           

	public void M1 ()                                                             // M1 method overridding 
	{
		System.out.println(" method M1 overridding ");
	}
    
	public void M2() {                                                            // M2 method overridding 
		System.out.println(" method M2 overridding  ");		
    }
	
	public static void M3 () {                                                   // M3 static method overridding but 
		System.out.println("Static Method M3 overridding ");
	}
	
    public static void M4() {                                                    // M4 static mehod overridding 
	System.out.println("Static Method M4 overridding  ");
	}
	
    

    public static void main(String[] args) {
		class2 obj = new class2();
		obj.M1();
		obj.M2();
		class2.M3();
		class2.M4();
	}
}
