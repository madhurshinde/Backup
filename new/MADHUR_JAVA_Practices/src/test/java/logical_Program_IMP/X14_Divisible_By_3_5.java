package logical_Program_IMP;

public class X14_Divisible_By_3_5 {
//  1 to 50 number divisible by 5 or 3

	public static void main(String[] args) {
	
	for(int i=1; i<=50; i++) {	
		if(i%5==0||i%3==0) {
		System.out.println("divisible by 5 or 3 "+i);
		}else{
		System.out.println("NOT divisible");
	}
}
}
}