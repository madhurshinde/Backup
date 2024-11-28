package IMP_Program;

import java.util.Scanner;

public class xfibonacci_series {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner scann = new Scanner(System.in);
		
		int num = scann.nextInt();
		System.out.println(scann);
		
		System.out.println(num + " is input and following is outoput;");
    
	int a =0;
    int b =1;
    int c =1;
    
    for(int i=1; i< num; i++) {
    	System.out.println(a+",");
    
    a=b;
    b=c;
    c=a+b;
    
    }
	}
}
