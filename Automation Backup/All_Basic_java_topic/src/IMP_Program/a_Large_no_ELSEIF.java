package IMP_Program;

public class a_Large_no_ELSEIF {

	public static void main(String[] args) {
		int a= 100;
		int b = 20;
	    int c= 50 ;
	
	   
	    if (a<b) {              // 10<20
	    	      if(b<c) {
	    	    	  System.out.println("c is greater");
	    	      }
	    	      else {
	    	    	  System.out.println("b is grater");
	    	      }
	    }
	    else if (a<c) {
                System.out.println("c is Greater");	
                     }
	              else {
	    	        System.out.println("a is greater");
	              }
	}
}
