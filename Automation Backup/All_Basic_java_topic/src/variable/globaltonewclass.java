package variable;

public class globaltonewclass {
		  
	public static void main(String[] args) {
		
	   Globallocalvariable obj =new Globallocalvariable();	// obj create for nonstatic cll in other class
		System.out.println(obj.b);
		System.out.println(Globallocalvariable.a);
	}
}