package Hierarchical_Inheritance;

public class Father {

	public void car(){
		System.out.println("Father Car Maruti");
	}

	public void Home(){
		System.out.println("Father home 1 bhk ");
	}

	public void Money(){
		System.out.println("Father Money 1 lakh Rs");
	}
	public static void main(String[] args) {
		Father f =new Father();
		f.car();
		f.Home();
		f.Money();
	}
}
