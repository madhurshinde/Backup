
package b_Condition_loop;

public class J_down_up_Start_patten {

  public static void main(String[] args)
    {                                                // assending  1 to 5  * print 
	 for(int a=1; a <=5 ; a++)                      // total lines 5 
	 {           
	  for(int b=1; b<=a ;b++)                      // control start Print    1*,2*,3*,4*
		{
		 System.out.print("*");                  // { } start and end are imp 
		}
	     System.out.println( );
     }	
		                                        // decending 5 to 1 * print 
    for(int a=5; a >= 1 ; a--)                 //  Total no of lines
	 {             
	  for(int b=1; b<=a ;b++)               // Control Start print  5*,4*,3*,2*,1*
	   {
        System.out.print("*");        
        }
	    System.out.println( );
     }                                   // only chnge b value  for increment and decrement
    }
                               }
