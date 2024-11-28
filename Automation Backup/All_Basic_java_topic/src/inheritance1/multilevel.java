package inheritance1;

public class multilevel extends subclass1 {

	public void test5()                 //  property of 3rdlevel  
	{
		System.out.println(" multilevel (child) property and also inherit the property of superclass(gradfather) and superclass1 (father)");
	}
	
	public static void main(String[] args) {
	 
		multilevel obj =new multilevel();            //create object to cl nonstatic method
		obj.test5();                                // call multilevel own property   
        obj.test03();                              	// property of subclass 1
		obj.test();                               // call test property of superclass(grandfather) with property of superclass(father)  
		obj.test1();
		multilevel.test2();
		
	}
}
