package practices;

import org.openqa.selenium.grid.Main;

public class Throwables {
	
	public void division (int e, int b ) {
		int f = e/b;                            //10/2 = 5,,, 10/0 =  stop
		System.out.println("division done "+f);                // stop zla 
		
		
		// next to new progrm  execution stop
		
	    System.out.println(" new progrm star" );
	
	}
	

	public void div (int a , int b) {
    try {                                     

		int c = a/b;                                   // exception nahi   so print 
		{
		 System.out.println("divison done ans " +c);              // print      exception 	
        }	
    }		
    catch (Exception e) {                             // exception nhi  so skip 
    	System.out.println(e);                            //
    }
    finally {
    	System.out.println("print kar kahi pan karun");                  // kahi pan ho result show 
    }
    
    
    
     System.out.println("new progrm star");
}

	
	
	public static void main(String[] args) {
		Throwables o = new Throwables ();
         o.div(10,0);
       //o.division(10, 0);
	}
}