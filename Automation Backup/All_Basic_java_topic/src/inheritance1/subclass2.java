package inheritance1;

public class subclass2 extends superclass {

	public void test4()                 //  property of subclass we inherit superclass in subclass1,2 this is call multiple inheritance
	{
		System.out.println("subclass2 property and also inherit the property of superclass");
	}
	public static void main(String[] args) {
	 
		subclass2 obj =new subclass2();            //create object to cl nonstatic method
		obj.test4();                              // call subclass own property   
		obj.test();                               // call test propery of superclass by name of subclass  done bcoz of inheritance 
		obj.test1();
		subclass2.test2();
		
	}
}
