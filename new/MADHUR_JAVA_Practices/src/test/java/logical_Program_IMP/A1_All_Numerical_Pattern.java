package logical_Program_IMP;

public class A1_All_Numerical_Pattern {

	public static void main(String[] args) {

		
		System.out.println("* pattern");
		for(int i=1; i<5; i++) {							// *
			for(int j=1; j<=i;j++) {						// * *
				System.out.print("*");						// * * *
			}												// * * * *
			 System.out.println( );
		}	
		
		System.out.println("* NORMAL STATEMENT :-print 1 , 22, 333");
		for(int i=1; i<5; i++) { //1//2      				// 1
			for(int j=1; j<=i;j++) { //1 					// 2 2
				System.out.print(i); //1//2//3				// 3 3 3
			}												// 4 4 4 4
			System.out.println( );
		}	
		
		System.out.println("* NORMAL STATEMENT:- print 1, 12,123");
		for(int i=1; i<5; i++) {							//1
			for(int j=1; j<=i;j++) {						//1 2
				System.out.print(j);						//1 2 3
			}												//1 2 3 4
			System.out.println( );
		}
		
		System.out.println("* NORMAL STATEMENT:- print 1,2,3,4,5");
		int k=0;
		for(int i=1; i<5; i++) {							// 1
			for(int j=1; j<=i;j++) {						// 2 3
				k++;    //1//2//3//4						// 4 5 6
				System.out.print(k);						// 7 8 9 10
			}
			System.out.println( );
		}
		

		System.out.println("* NORMAL STATEMENT:- print return 4,3,3,1");
															// 1
		for(int i=1; i<5; i++) {							// 2 1
			for(int j=i; j>=1;j--) {						// 3 2 1
				System.out.print(j);						// 4 3 2 1
			}
			System.out.println( );
		}
		
		System.out.println("* NORMAL STATEMENT:- print same 12321");
		for(int a=1; a<=5; a++) {                           //1
			for(int b=1; b<=a; b++) {					   // 1 2 1
				System.out.print(b);					  //  1 2 3 2 1
			}											 //   1 2 3 4 3 2 1
			for(int c=a-1; c>=1; c--) {					//    1 2 3 4 5 4 3 2 1	
				System.out.print( c );
				}											
			System.out.println( );						 
		}
		
		System.out.println("* NORMAL STATEMENT:- print 1,2,6,3,7,10");
		for(int x=1; x<=5;x++) {					//1
			int no=x;								//2 6
			for(int y=1; y<=x; y++) {				//3 7 10
				System.out.print(" "+no);			//4 8 11 13
				no=no+5-y;							//5 9 12 14 15
			}
			System.out.println( );
		}
		
		System.out.println("NORMAL STATEMENT:- number 5 to 1 reverse");
	for(int i=1; i<=5;i++) {							//5 4 3 2 1
		for(int j=5; j>=i; j--) {				        //4 3 2 1
			System.out.print(j);						//3 2 1
		}                                               //2 1
		System.out.println( );							//1
	}
	
	
	System.out.println("NORMAL STATEMENT:- number 1to 12");
	int h=0;
	for(int x=1; x<5; x++) {      							//1 2 3
		for(int j=1; j<=3; j++) {							//4 5 6
			h++;											//7 8 9 
			System.out.print(" "+h);						//10 11 12
		}
		System.out.println( );
	}
	
	System.out.println( "NORMAL STATEMENT:- ");
	int count=0;
	for(int a=1; a<=5; a++) {
	if(a%2!=0) {	
		for(int b=1; b<=3;b++) {
			count=count+1;
			System.out.print(" "+count);
		}
	}else {
		int temp=count+1;
		for(int c=count+3; c>=temp; c--) {
			count=count+1;
			System.out.print(" "+count);
		}	
		}
	System.out.println( );
		}
	}
}
