package d_Array_verifiy;

public class array_declare {

	public static void main(String[] args) {
		int a[] = {243,453,376 };                       // 1st declare 
		char []b = {'a','b','c','d','e'};               // 2nd declare
		int []c;                                      // 3rd declare 
		
		{
		//	c = new  int c [] {20,30,50};
           System.out.println(a[1]);                     // print by no 
		   System.out.println(a[2]);

		   System.out.println();
		}
		{
			System.out.println(b[3]);
			System.out.println(b[2]);
		}
		System.out.println(a.length);                   //for length
	}
}
