package logical_Program_IMP;

import java.util.Scanner;

public class X30_ReverseGivenNo {
	
	//Java Program To Find Reverse Of Given Number | Java While Loop
	//input 345 outbut 543
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		
		while(num!=0) {
			System.out.println(num%10);
			num=num/10;
		}
	}

}
