package Hierarchical_Inheritance;

public class Son1 extends Father{

	public void mobile1(){
		System.out.println("Son 1 mobile samsang");
	}

	public void bike1(){
		System.out.println("son 1 bike splender");
	}
	
	public static void main(String[] args) {
		
	
	Son1 s1 =new Son1();
	s1.mobile1();
	s1.bike1();
	s1.car();
	s1.Money();
	s1.Home();
	}
	
	


}
