package logical_Program_IMP;

import java.util.Scanner;

public class X33_PerfectNO {

	// 33 check given no is perfect number or not
	//a positive interger that is equal to the sum of its proper divisible
	//example 6= 1,2,3 sum =6

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt(); 
	int sum=0;

	for (int i=1; i<num; i++){
		if(num%i==0){
			System.out.println(i);
			sum=sum+i;
		}		
	}
	if(num==sum){
		System.out.println("perfect no");
	}else{ 
		System.out.println("not perfect no");
		}
	}
}