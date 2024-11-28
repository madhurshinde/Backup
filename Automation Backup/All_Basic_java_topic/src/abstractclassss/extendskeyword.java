package abstractclassss;

public class extendskeyword extends abstractclasss {
	public  void test2()            // incomplete test2 then abstract word need
	{
		System.out.println("concreate class test 1");
	}

	
	public  void test3()             // incomplete test3 then abstract word need
	
	{
		System.out.println("concreate class test 2");
	}
	public static void main(String[] args) {
		extendskeyword obj = new extendskeyword();
		obj.test2();
		obj.test3();
	}
	
}
