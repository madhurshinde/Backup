package OverloadingCTP;

public class overloadingNonStatic {

	public void Test()	{
		System.out.println("No Argument method");
	}
	public void Test(int number)	{
		System.out.println("integer Argument method"+number);
	}
	public void Test(String name)	{
		System.out.println("String Argument method"+name);
	}
	public void Test(String name , int rollNo)	{
		System.out.println(rollNo+"String and int Argument method"+name);
	}
	public void Test(String name ,String pass ,int no)	{
		System.out.println("Two String and integer Argument method"+pass);
	}
	
	public static void main(String[] args) {
		
		overloadingNonStatic ol =new overloadingNonStatic();
		ol.Test();
		ol.Test(28);
		ol.Test("Madhur");
		ol.Test("Madhur",28);
		ol.Test("Madhur","Shinde",28);
	}
	}
