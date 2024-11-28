package logical_Program_IMP;

public class X23_Print_Result {

	//Java Program To Print Result Of 1^2 + 2^2 + 3^2 + 4^2 + 5^2 | Java For Loop
	//(^ means Square)
	public static void main(String[] args) {
	
		int sum=0;
		for(int i=0;i<=5;i++) {
			sum =sum+(i*i);
		}
		System.out.println(sum);
	}
}
