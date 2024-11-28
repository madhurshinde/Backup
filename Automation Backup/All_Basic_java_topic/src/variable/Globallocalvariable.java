package variable;

public class Globallocalvariable {
	
      	                     //Global variable (permanant variable) inside the class but outside method and Scope is throught class
    static int a= 25 ;             // 1 st type Class/Static global variable 
    int b =35 ;                 // 2 nd type instance /non Static global variable
   
   
   public void hi() {
	   System.out.println(a);
	   System.out.println(b);
   }
   
   public static void main(String[] args) {
	
	                        // Local variable (Temporary Variable) inside the method and Scope is within the method  
	   int c =20;	       // 3rd local variable 

	   System.out.println("local variable ( Call Within method)");
	   System.out.println(+c);  
	
	   
	  System.out.println( "Class/Static variable (call to same and other class)"); 
	  System.out.println (a);
	 
	 System.out.println("instance /non Static variable (call to same and other class by creating Object )");
	 
	 Globallocalvariable obj = new Globallocalvariable(); // create object to call non static global variable 
	 System.out.println(obj.b);   // non static call by object
	 obj.hi();
	   
	   
}
}
