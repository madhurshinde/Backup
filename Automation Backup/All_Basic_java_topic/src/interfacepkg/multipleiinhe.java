package interfacepkg;

public class multipleiinhe implements interface1 , interface2   { 
	//multiple inheritance  done inheritance

	public void ownMethod() {
		System.out.println("own method 1");	}
	
	public void ownMethod2() {
		System.out.println("own method 2");	}
	
// below Are uncomplete method which is completed 
	public void test1() {                                             
	    System.out.println("interface1 method 1 complete");	}
	
	public void test2() {
		System.out.println("interface1 method 2 complete");	}
	
	public void test5() {
		System.out.println("interface2 method 1 complete");}
	
	public void test6() {
		System.out.println("interface 2 method 2 complete");}

	public static void main(String[] args) {
		multipleiinhe obj = new multipleiinhe();
		System.out.println(multipleiinhe.a);	  //variable in interface 1
		System.out.println(multipleiinhe.b);    // by default static public final
		obj.test1();
		obj.test2();	
//		multipleiinhe.test3(); 	     // Calling the static method of interface
//		obj.test4();   				unable to access interface Private  outside class
		obj.test5();
		obj.test6();
	    obj.ownMethod();
	    obj.ownMethod2();   
	}   	}		