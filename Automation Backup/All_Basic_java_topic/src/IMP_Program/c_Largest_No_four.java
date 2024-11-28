package IMP_Program;

public class c_Largest_No_four {

	
	public static void main(String[] args) {
		int a= 100;
		int b = 200;
	    int c= 500 ;
	    int d = 2500;
	    
	if(a>b) { 
	    	if(a>c)
	    		if(a>d){
	    			System.out.println("a is greater");
	    		       }
	    		else   {
	    			System.out.println("d is gerater");
	    		       }
	}
	else if (b>c) {
		     if(b>d){
		       System.out.println("b is greter");		     
		            }
		     else   {
		    	 System.out.println("d is greter");
		            }
	}
	else if (c>d) {
 		      System.out.println("c is greater ");
	               }
	else{
		  System.out.println("d is greater");
	     }
	  }
	} 
	    	


