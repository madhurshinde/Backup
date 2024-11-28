package G_Exception;

public class UNCheck_handleBy_try_catch {
	

	public void division (int a,int b) {
	   try {
          int c= a/b ;                                    //multiple try can be use // every try should have catch or final block try k andar multiple try possible
           System.out.println(c);
	    }catch (Exception e) {                                       // Exception is class e is ref of that class
	          System.out.println(" invalid input ");
	      }finally {                                              //  use to write final block  which does not affect on this code                      
      System.out.println("Exception is over");	
}
}
        
		
	public static void main(String[] args) {
		UNCheck_handleBy_try_catch obj= new UNCheck_handleBy_try_catch();
         obj.division(120,0);  
	      }
	}


