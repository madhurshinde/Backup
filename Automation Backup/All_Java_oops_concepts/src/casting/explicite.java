package casting;

public class explicite {

 public static void main(String[] args) {
	

	// Explicite casting means higher type of data to low type data type
    double d = 13.1548;                               //8 byte =64 bit 
		  
    int e =(int)d;                                  //int 4byte =32 bit                 
   
    short g = (short)d;			                   //Short 2 bye =16 bit 

		 System.out.println("data loss occurs in explicite Casting " +e);             // 8 byte to 4 byte convert
		 System.out.println(+g);                                                     // 8 byte to 2 byte convert
	 }
	 
}
