package polymorphisum;

public class overridding extends overloading {         // extends property of Method overridding (superclass)
	 
	
	public void method1() {                                // method 1 non static overriddeing done 
	    System.out.println(" method1  Madhur Shinde is here");}
       
	
	public static void method2 (int b) {
    	 System.out.println("method 2 static method override is possible or not");}
          
	
    public void newcl() {
	    super.method1();                                 // super keyword use to call superclass method
	    super.method2(1);
	    // this.method1();                                 // this keyword use to call same method result
	    }
	
    
    
	 public static void main(String[] args) {
	       overridding obj =new overridding ();
           obj.method1();                        /// same memory 
           overridding.method2(10);             ///new memeory
           obj.newcl();      	              // memory   
   }}	  