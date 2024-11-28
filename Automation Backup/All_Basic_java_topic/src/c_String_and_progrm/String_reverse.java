package c_String_and_progrm;

public class String_reverse {

	public static void main(String[] args) {
	
		 String a ="Madhur Shinde";
	
		 System.out.println(a.length());
		 
		 int b= a.length();         // 13                       // string length save in int 
  		 for (int i= b-1 ; i>=0; i-- ) {             //13 > 0  13 large   
			 System.out.print(a.charAt(i));         //  print 13 e , 12 d
		 }
		 
		 
	}
}
