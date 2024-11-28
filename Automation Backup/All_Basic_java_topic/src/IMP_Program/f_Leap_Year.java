package IMP_Program;

public class f_Leap_Year {
	
	public static void main(String[] args) {
		
	int year=1998;
	
	 if( year%4==0 && year%400==0 && year %100 == 0)
	
			 {
				System.out.println( " Is Leap year " +year); 
			 }
	else {
		System.out.println(" Not a leap year " +year);
	}
	}
}


//    public static void main(String[] args) {
//	
//      int  a= 2004;
//	 
//     if (a %4 ==0) {
//          if (a %100 == 0) 
//        	  if(a % 400 ==0) 
//	      		  System.out.println(" Is a leap year" +a);          
//	        	 else 
//	        		System.out.println("is not a leap year");
//                      }
//   else {
//    	 System.out.println("not a leap year"+a);
//     }
//    }
//}
//    
//
