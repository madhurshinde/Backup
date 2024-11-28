package logical_Program_IMP;

public class X9_Calculation_switch {

	
	public static void main(String[] args) {
		
	int a=10;
	int b=20;
	String Operation ="substraction";
	switch(Operation) {
	case "add":
		System.out.println(a+b+"add");
		break;
	case "multi":
		System.out.println(a*b+" multi");
		break;
	case "substraction":
		System.out.println(a-b+" substraction");
		break;
	}
}
}
