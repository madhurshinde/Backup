package logical_Program_IMP;

public class X26_Separate_Each_Digit_From_Number {

	//Java Program To Separate Each Digit From Number | Java For Loop
	// Example  inpur 123
	// output
	//3
	//2
	//1
	public static void main(String[] args) {
		
		int num=12360;
		 while(num!=0) {
			 System.out.println(num%10);  //3,2,1
			 num=num/10;   //
			 System.out.println(num);//1236/123/12
			 
		 }
	}
	
}
