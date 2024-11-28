package d_Array_verifiy;

import method_accesspecifier.accesspecifer;

public class access_tother_class extends accesspecifer {     // extends class inheritance 
	public static void main(String[] args) {
		System.out.println("calling all accesss modifier in other class of other package");
		
		access_tother_class.publicaccess();       // call public method 
		access_tother_class obj = new access_tother_class();  // create object 
	    //  obj.defaultaccess();                                // call default specifier  but not accessible 
		    obj.protectedaccess();                              // call protected specifier 
		//  obj.privateaccess();                                //call private specifier but not accessible 
		
}
}
