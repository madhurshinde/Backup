package logical_Program_IMP;

public class X28_Sum_Each_Digit {

	//Java Program To Find Sum Of Each Digit Of Given Number | Java While Loop
	
//	Example  input 123= output 6
	
	public static void main(String[] args) {
		
		
		int value =1234;
		int sum=0;
		while(value!=0) {
			sum=sum+value%10;
			value =value/10;
			System.out.println(value%10);
		}
		System.out.println("sum of value "+sum);
	}
	
}
