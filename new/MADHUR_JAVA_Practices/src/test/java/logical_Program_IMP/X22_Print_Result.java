package logical_Program_IMP;

public class X22_Print_Result {

	//Java Program To Print Result Of 1/2 + 2/3 + 3/4 + 4/5 + 5/6 | Java For Loop
	
	public static void main(String[] args) {
		
		double sum=0; 						//use double as calculation is in decimal
		for(double i=1;i<=10;i++) {
			sum = sum + i/(i+1);      // bracket is naccesary
		}
		System.out.println(sum);
	}
}
