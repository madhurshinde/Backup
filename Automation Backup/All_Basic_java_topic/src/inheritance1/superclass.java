package inheritance1;

public class superclass {

    public void test() {                                  // 1 st property of superclass
	System.out.println(" inheritance is a oops concept parent child relationship ");
     }
     
    public void test1 () {                               //  2nd property of superclass
    	System.out.println("one class is acqired property of other class ");
    }
    public static void test2() {                        //3rd property of superclass
    	System.out.println("static method call directly whithout obj ");
    }
    private static void checkprivate() {
    	System.out.println("static private method access inside the class");
    }
    private void noncheckprivate() {
    	System.out.println("static private method access inside the class");
    }

    
    public static void main(String[] args) {
		superclass obj =new superclass ();              //create object to cl nonstatic method
		obj.test();                                    // call test propery 1 by obj   
		obj.test1();                                  // cl test1  property 2 by obj
		obj.noncheckprivate();
		superclass.test2();                           // cl test2 directly with class name bcoz of static method
		superclass.checkprivate();
    }
}
