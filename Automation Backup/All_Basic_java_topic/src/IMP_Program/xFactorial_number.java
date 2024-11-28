package IMP_Program;

public class xFactorial_number {

	public static void fact (int num) {
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			 
			  fact = fact*1;	
		}
		System.out.println(fact);
	}
 public static void main(String[] args) {
	 xFactorial_number.fact(5);
}
}
