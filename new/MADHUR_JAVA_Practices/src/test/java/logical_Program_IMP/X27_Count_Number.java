package logical_Program_IMP;

public class X27_Count_Number {

	
	//Java Program To Count Number of Digit In Given Number | Java While Loop
	
	//Example ==== input 123,  output =3
	//input 12345 = output 5
	
	public static void main(String[] args) {
		int num=1236778;
		 int count =0;
		 //Approch 1  convert interger into string then find out value of string using length method  () valueOf  method
		 System.out.println(String.valueOf(num).length());
		 
		
		 while(num!=0) {	 
	//		 System.out.println(num%10);
			 num=num/10;
			 count++;
		 }
		 System.out.println("while loop "+count);
		 	}
	

}
