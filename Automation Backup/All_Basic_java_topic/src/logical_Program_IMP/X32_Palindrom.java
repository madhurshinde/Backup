package logical_Program_IMP;

import java.util.Scanner;

public class X32_Palindrom {

	
	// check palindrom no

	//121 same as reverse

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int rev=0;

	int numba =num;

	while(num!=0){
	// System.out.println(num%10);
			rev=rev*10+num%10;
			System.out.println(rev);
			num=num/10;
	}

	if(numba==rev) {
		System.out.println("palindrom");
	}else{
		System.out.println("not palindrom");

	}
	}
}

