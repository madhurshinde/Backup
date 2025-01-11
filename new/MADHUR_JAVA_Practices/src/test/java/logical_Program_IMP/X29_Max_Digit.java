package logical_Program_IMP;

import java.util.Scanner;

public class X29_Max_Digit {

	//Java Program To Print Max Digit From Given Number | Java While Loop
	//Example input 32457 --output 7
	
	public static void main(String[] args) {
	
	// using input by user scanner class  
		Scanner sc= new Scanner(System.in);   // scanner class object 
		int num= sc.nextInt();
		//	int num =233469;
		int max=0;
		
		while(num!=0) {
			
		if(num%10>max) {
			max=num%10;
		}
		num=num/10;
		
		}
		System.out.println("maximum no "+max);
	}
}

