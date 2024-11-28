package logical_Program_IMP;

public class X25_Factors_Given_Number {

//	Java Program To Print Divisor / Factors Of Given Number | Java For Loop
//  divisor :- a number divided an interger num perfectly
//  example :-input 6  output- 1,2 ,3,6
	
	public static void main(String[] args) {
	
		int num =8;
		
		for(int i=1; i<=10; i++ ) {
			
			if(num%i==0) {
				System.out.println("divided by number"+i);
			    }
		}
			}
	}
	