package logical_Program_IMP;

public class X24_Prime_NOT {

	
	//Java Program To Check Given Number is Prime or Not | Java For Loop
	//prime no=number divisible by 1 or itself
	// example= 2,3,5,7,11,13
	
	public static void main(String[] args) {
		
	int num=8;
	int count=0;
	for(int i=1; i<=num;i++) {
		if(num%i==0) {
		    count ++;
		  }
		}	
	if(count==2) {
		    System.out.println("prime no "+num);	
		}else {
		    System.out.println("NOt prime no "+num);
		}
			}
		}
