package b_Condition_loop;

public class K_Right_left_Start_total {

  public static void main(String[] args) 
	{
	 for(int a= 1; a <= 5; a++ )
	  {                                                       
	   for( int c= 5 ;c>= a ; c-- )         // print 0 (5 to 1) 
	     {                 
		 System.out.print("0");			   // 5*0,4*0,3*0,2*0,1*0
		 }
		  for(int b =1 ;b <=a ; b++)      // print * (1 to 5)
		   {             
		    System.out.print("* ");       // 1*,2*,3*,4*,5*   
		   } 
	        System.out.println( );		
	  }
	  
	for(int a= 5 ; a >= 1 ; a-- )              // no of lines
	 {
	  for( int c= 5 ;c>= a ; c-- )             // space print
	   {
		System.out.print(" $");                // for square box   both $ space and * space 
       }
	    for(int b =1 ;b <=a ; b++)             // star print
	     {
		  System.out.print("* ");             // for peramid  * and space print
		 }
	      System.out.println( );		
	 }
    }
                                      } 
