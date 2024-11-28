package d_Array_verifiy;

public class Swaping_reverse_array {

	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		
		System.out.println(a);
         System.out.println(b);		
		int c;
	   c=a;  //backup 
	   a=b;
	   b=c;  //restore
	   

		System.out.println(a);   // a value reverse now 20 
        System.out.println(b);  // b value reverse now 10 
	   
	}
}
