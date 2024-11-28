package method_accesspecifier;

public class accessinotherclass extends accesspecifer {

	public static void main(String[] args) {
		System.out.println("calling all accesss modifier in other class in same package");
		accesspecifer.publicaccess();
		accesspecifer obj =new accesspecifer();  // create object to call default,proteted,private
		obj.defaultaccess();                     // call default                                     // level 2
		obj.protectedaccess();                   // call protected
	   //obj.privateaccess();	                 // call private (unable to call in other class )
	}
	
}

