package inheritance1;

public class subclass1 extends superclass   // extends keyword to inherit property of superclass
{
   public void test03()                      // property of superclass
       	{
	    System.out.println(" property of subclass1 :- inherit property of superclass");
	    }
	
   public static void main(String[] args) {
	  subclass1 obj = new subclass1 ();    //create object to cl nonstatic method
	  obj.test03();                        // call subclass own property                         
	  obj.test();                          // call test propery of superclass by name of subclass  done bcoz of inheritance 
	  obj.test1();
	  subclass1.test2(); 
	  
	}
}
