
package logical_Program_IMP;

import java.util.Random;

public class A6_String_Repeated_Que {
	
	//Fibonacci Series in java program
	public static void main(String[] args) {
	
		A6_String_Repeated_Que a=new A6_String_Repeated_Que();
//	    a.evenOdd();
//	    a.maximumNoin3No();
//		a.fibonacciSerial();
//		a.factorialNumber();
		a.primeNumCheck();
//		a.FindVowelCharacter();
//		a.reverseNumber();
//		a.SwapingNumber();
//		a.perfectNo();
//		a.SumOfDigit();
//		a.emptyNull();
//		a.randomNumber();
		a.nonrepectedchar();
	}	
	
	
	
	public void evenOdd(){
		// find even num and odd number from 1 to 10
		int num= 1;
		while(num<=10) {
		if(num%2==0) {
			System.out.println("Even no is "+num);
		}else {
			System.out.println("odd no is "+num);	
		} 
		num++;
		}
	}
	
	public void maximumNoin3No(){
		
	int a=299;
	int b=56;
	int c=398;

	if(a>b && a>c) {
	System.out.println(a+" is Max no" );
	}else if(b>c) {
	System.out.println(b+ " is max no");
	}else {
	System.out.println(c+ " is max no");
		}	
	}
	
	public void fibonacciSerial() {
   //1,1,2,3,5,8,13   addition 
		
		int firstnum=0;     int secondnum=1;  	    int sum;

		for(int i=0; i<=10; i++) {
			sum=firstnum+secondnum;											// adding 1st and 2nd value 
			System.out.println("Fibonaccic series = " +sum);
			firstnum=secondnum;													   // Swap  the value 
			secondnum=sum; 
		}
									}
	
	public void factorialNumber(){
	// 5=1*2*3*4*5=120	
		int num=5;     int fact=1;
		
		for( int i=1; i<=num; i++) {
			fact= fact * i;
								}
		System.out.println("factorial of 5 number is = "+ fact);
							}	

	public void primeNumCheck() {
		 //prime no=number divisible by 1 or itself  then it is prime  num    5 divided by 1 and 5
		 // example= 2,3,5,7,11,13
		
		// 1str way to give input by Scanner class
//		Scanner sc= new Scanner(System.in);       
//		int num= sc.nextInt();

		// 2nd way to give input 
		int num=8;
		int count=0;
		for(int i=1; i<=num;i++) {
			if(num%i==0)  {
			    count ++; }
			}	
		if(count==2) {
			    System.out.println("prime no "+num);	
			}else {
			    System.out.println("NOt prime no "+num);
			}
							}
	
	public void FindVowelCharacter() {	

//		Scanner sc= new Scanner(System.in);       
//		String name = sc.next();

		String name="madhurshindeeiou";
		int vowel=0;
		int consonats=0;
		for(int i=0; i<name.length(); i++) {
		   char c=name.charAt(i);
		   if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			   System.out.println("vowel are = "+c);  
			   vowel++;
			 }else {
				 System.out.println("consonants are = "+c);
				 consonats++;
			 }
				}
		System.out.println(vowel+ "count");
		System.out.println(consonats+"count ");								
		}
	
	
	
	 public void reverseNumber() {
//		 Scanner sc =new Scanner(System.in);
//			int num=sc.nextInt();
		 	int num =1234;
		 int count=0;
			while(num!=0) {
				System.out.print(num%10);
				num=num/10;
				count++;
			}
			System.out.println("   Count the Number of Digits in a Number ="+count);
			
		}
	   public void SwapingNumber() {
		   //Assinging one value to other 
		   int a=10;   int b=20;
			
			int c=a; //10
			a=b;     //20
			b=c;     //10
			System.out.println("Swap value with USing The 3rd variable");
			System.out.println("A=10 now value after swap A = "+a);
			System.out.println("B=20 now value after Swap B = "+b);

			
			int i=100;			int j=200;	
			i=i+j; //30
			j=i-j; //30-20 ans 10
	        i=i-j;
	        System.out.println("Swap directly ");
	        System.out.println("A=100 now value after swap A = "+i);
			System.out.println("B=200 now value after Swap B = "+j);
	   }
	   
	   
	   public void perfectNo() {
		 //a positive interger that is equal to the sum of its proper divisible
			//example 6= 1,2,3 sum =6
		   
//			Scanner sc=new Scanner(System.in);
//			int num=sc.nextInt(); 
			int sum=0;
			int num =6;
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
	   
	   public void SumOfDigit() {
//			Example  input 123= output 6
 		   
		   int value =1234;
			int sum=0;
			while(value!=0) {
				sum=sum+value%10;
				value =value/10;
				System.out.println(value%10);
			}
			System.out.println("sum of value "+sum);
		}
	   	
	   
	   public void emptyNull() {
		   
		   String n="";
		   String na=null;
		   String le="67jdkk";
		 System.out.println(n.isEmpty());   // checking empty  
		   System.out.println(na==null);	// Checking Null
		   System.out.println(le.length());	   // find length
	   }
	   
	   
	   public void randomNumber() {
		   
		   Random random=new Random();
		   int number =random.nextInt();
		   int numberlimit =random.nextInt(100);
		   System.out.println("limited number means bound = "+numberlimit);
		   System.out.println("generate Random number "+number);
	   }
	   
	   public void nonrepectedchar() {
		   
		   boolean nonrepected=true;
		   String check="maadhhuur Shindde";
		   for(int i =0; i < check.length(); i++) {
			   for(int j=0; j < check.length(); j++) {
				   
				   if(check.charAt(i)==check.charAt(j)) {
				//	   nonrepected=false;
						System.out.println("Duplicate ="+check.charAt(i));
					   //	   break;
				   }else {
					   System.out.println("Non repected="+check.charAt(i));
			   }
//			   if(nonrepected) {
//				   System.out.println(check.charAt(i));
//			  // break;
//			   }			   
		   }
	   }
	   }}
	


