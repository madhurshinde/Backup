package logical_Program_IMP;

public class X34_printPattrn {


	public static void main(String[] args) {
		
		X34_printPattrn obj=new X34_printPattrn();
		obj.square12345_Pattern();
		obj.printSquare1111_Pattern();
		obj.Triangle_pattern_1to5();
		obj.fullTriangle();
		obj.reverseTriangle();
		obj.diamond_Pattern();
	}
	

	public 	void square12345_Pattern() {	
				//		12345
				//		12345
				//		12345
				//		12345
				//		12345

		for(int i=0; i<5; i++){
			for(int j=1; j<=5; j++){
				System.out.print(j);
				}
				System.out.println(); 
		}
	}
	
	public void printSquare1111_Pattern() {
			//		11111
			//		22222
			//		33333
			//		44444
			//		55555
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println( );
			}
		System.out.println("Square USing *");
			for(int i=1; i<=5; i++) {
				for(int j=1; j<=5; j++) {
					System.out.print("*");
				}
				System.out.println( );
				}
	}
	
	
	public void Triangle_pattern_1to5() {
		//37 | Java Program To Print Right Side Triangle | Java Nested For Loop
					//		1
					//	    12
					//	   123
					//	  1234
					//	 12345

		for(int i=1; i<=5; i++){			
			for(int s=1; s<=6-i; s++) {   // print blank Space
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {   // print no 
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++){	
			for(int s=1; s<=6-i; s++) {   // print blank Space
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {   // print no 
				System.out.print(j);
			}
			System.out.println();
		} 		}
	
		public void fullTriangle() {
					//	    *
					//	  * * *
					//	 * * * *
					//  * * * * *
			

			System.out.println("Print triangle");	
		for(int i=1; i<=5; i++) {    // 
			
			for(int s=1; s<=5-i; s++){ // 5 Space/4/3/2/1
				System.out.print(" ");
			}
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}			
//			for(int k=1; k<=i; k++) {
//				System.out.print("*");
//			}
			
			for(int j=1; j<=i*2-1; j++) {  // 1<=1*2-1 (1)//2<3//3<5
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
	}
		
		
		public void reverseTriangle() {
   	//39 | Java Program to Print Reverse Full Triangle Pattern | Java Nested For Loop
			//	
			//			*********
			//			 *******
			//			  *****
			//			   ***
			//			    *

			System.out.println("Print Reverse triangle");
			for(int i =5; i>=1; i--) {        
				for(int j=1; j<=5-i; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=i*2-1; j++) {
					System.out.print("*");
				}
				System.out.println( );
			}
		}
		
		
		
		public void diamond_Pattern() {
			
			System.out.println("Print Diamond PAttern");
			for(int i=1; i<=4; i++) {
				
				for(int s=1; s<=5-i; s++){ // 5 Space/4/3/2/1
					System.out.print(" ");
				}			
				for(int j=1; j<=i*2-1; j++) {  // 1<=1*2-1 (1)//2<3//3<5
					System.out.print("*");
				}		
				System.out.println(" ");
			}

		  for(int i =5; i>=1; i--) {        
				for(int j=1; j<=5-i; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=i*2-1; j++) {
					System.out.print("*");
				}
				System.out.println( );
			}
		}
	}

	


