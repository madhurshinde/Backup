package method_accesspecifier;

public class accesspecifer {

	public static void publicaccess()                         // public access Specifier / modifier
	     {
		System.out.println(" public access modifier ");
	     }
	
	void defaultaccess ()
	    {                                                    // default access Specifier /  modifier 
	 	System.out.println(" Default access modifier ");
	    }
	
	protected void protectedaccess() 
	    {                                                    // protected access Specifier /  modifier 
		System.out.println(" protected access modifier");
	    }
	private void privateaccess()                             //private access Specifier /  modifier //level 1
	    {
		System.out.println(" private access modifier");
	    }
	public static void main(String[] args) {
		System.out.println("calling all accesss modifier in same class");
		accesspecifer.publicaccess();
		accesspecifer obj =new accesspecifer();              // create object to call default,proteted,private
		obj.defaultaccess();                                // call default
		obj.protectedaccess();                             // call protected
		obj.privateaccess();	                          // call private 
	}
	
}
