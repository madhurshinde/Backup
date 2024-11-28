package abstractclassss;

public class concrateclass extends abstractclasss {			  // extends use to extend class to this class

	public void test () {
		System.out.println("concrate class:- override");
	}
	public  void test2()        						   // complete test2 after providing body
	{
		System.out.println("concrate class complete with body test2 ");
	}
	
	public void test3()         							// complete test3 after providing body 
	{
		System.out.println("concrate class complete with body test 3");
	}

	public static void main(String[] args) {
		concrateclass obj = new concrateclass();
		obj.test();
		obj.test(3);
		obj.test2();
		obj.test3();
		
//		abstractclasss obj = new abstractclasss();
//		Can not Create object 	of Abstract class bcoz of incomplete methods 
	
		System.out.println("dynamic binding ");
		abstractclasss obj2 = new concrateclass();
		obj2.test();
		obj.test(2);
		obj2.test2();
		obj2.test3();
	}
}


