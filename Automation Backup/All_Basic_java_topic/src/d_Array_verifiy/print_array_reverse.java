package d_Array_verifiy;

public class print_array_reverse {

	
	public static void main(String[] args) {
		int a[] = {12,15,52,48,46,58};           // homogenious data
	     
		
		int size = a.length;   // is 6  but index is 5
		
		System.out.println("Size of array"+size);
		
		
		System.out.println( "print Array Assending  0 to 5 length "); 
		for(int i =0 ; i< a.length ; i++) {           // to print all array 
		   System.out.println(a[i]);	
		}
		
		
		
		System.out.println( " print Array Desending 5 to 0 "); 
		for (int i = (a.length-1);i>=0 ; i--) {              // for print reverse array 
			System.out.println(a[i]);
		}
		

	}
}
