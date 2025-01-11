package logical_Program_IMP;

public class X18_Sum_Even_Numbers {

	//Java Program To Print Sum Of Even Numbers From 1 to 10 | Java For Loop
	//2,4,6,8,10 = 30 
	
public static void main(String[] args) {
	
	int sum =0;
	for(int i=1; i<=10; i++) {
		if(i%2==0) {
	  sum =sum+i;
		}
	}
	System.out.println("Sum of all Even no "+sum);
  }
}