package abstractclassss;

public class concrateclass extends abstractclasss {

	public void test () {
		System.out.println("abstract class:- incomplete as well as complete method override");
	}
	public  void test2()           // complete test2 after providing body
	{
		System.out.println("abstract class complete with body and this class is concrate class ");
	}
	
	public void test3()         // complete test3 after providing body 
	{
		System.out.println("all");
	}

	public static void main(String[] args) {
		concrateclass obj = new concrateclass();
		obj.test();
		obj.test2();
		obj.test3();
		
	}
}


