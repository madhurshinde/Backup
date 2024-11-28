package casting;

public class implicite {

	public static void main(String[] args) {
		
	
	//implicite casting means lower type of data base to high type data type
    int a = 13;                                    //4 byte   32 bit                    
		
	  double b =(int) a ;                             //8 bytes ..64bit             
	
	  long c =(int)a;                                // 8 byte ...64 bit               
		 
		System.out.println("NO Data loss occurs in implicite casting " +b);
		System.out.println(+c);
}
}
