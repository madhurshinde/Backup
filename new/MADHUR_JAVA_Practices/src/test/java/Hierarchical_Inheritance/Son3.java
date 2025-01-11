package Hierarchical_Inheritance;

public class Son3 extends Father{

	public void mobile3(){
		System.out.println("Son 3 mobile Apple");
	}

	public void bike3(){
		System.out.println("son 3 bike R15");
	}
	
	public static void main(String[] args) {
		
	
	Son3 s3 =new Son3();
	s3.mobile3();
	s3.bike3();
	s3.car();
	s3.Money();
	s3.Home();
	}
}
