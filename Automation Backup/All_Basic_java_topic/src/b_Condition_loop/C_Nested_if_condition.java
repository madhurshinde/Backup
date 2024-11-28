package b_Condition_loop;

public class C_Nested_if_condition {

	public static void hello() {
		int a = 2 ;
		int b = 5;

    if(a!=b)   // condition 1 true then move to 2nd step
         {
           if (a>b)   // condition 2 true then move to 3 rd step
              {
                if (a>2)  // condition 3 true then statement print
                   {
        	        System.out.println( " a is grate than 2 "); // if any condition is false then no statement print 
                   }  
   } else
      {    
       System.out.println(" a value is 1 ");   // no condtion  then else print
      
      }}}
 
	public static void By() {
        int a= 10;
        int b= 20;
         int c=50;

            if (a<b) {
            	     if(b<c) {
            	    	  System.out.println(" c is large ");
            	     }
            	     else {
            	    	 System.out.println("B is large ");
            	      }
            } else {
        	   System.out.println("a is small");
           }
            	     }
	public static void main(I_line[] args) {
		C_Nested_if_condition.hello();
		C_Nested_if_condition.By();
	}
}

   