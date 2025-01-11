package Hierarchical_Inheritance;

public class Son2 extends Father {

	public void mobile2(){
		System.out.println("Son 2 mobile xiomi");
	}

	public void bike2(){
		System.out.println("son 2 bike pleasure");
	}
	
	public static void main(String[] args) {

	Son2 s2 =new Son2();
	s2.mobile2();
	s2.bike2();
	s2.car();
	s2.Money();
	s2.Home();
	}
}
