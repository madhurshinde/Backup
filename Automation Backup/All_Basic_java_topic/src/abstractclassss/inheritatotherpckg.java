package abstractclassss;

 import inheritance1.superclass;                              // import the package to this package 
 
public class inheritatotherpckg extends superclass {         // extends use to extend class to this class

	   public void test22() {
			
				System.out.println(" proerty of new package ");
			}
	      
		public static void main(String[] args) {
			inheritatotherpckg obj =new inheritatotherpckg();
			obj.test22();
			obj.test();
			obj.test1();
			inheritatotherpckg.test2();
			
	   	
		}
		}
