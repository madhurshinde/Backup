package Practices_all;

public class methods_Assess_modifer {
    int a= 20;
    static int b = 45;
	
  public static void myName()
	{
	 System.out.println("public A.S through Out Project");
	 methods_Assess_modifer k = new methods_Assess_modifer();
	 System.out.println(k.a+b);
	}
	
  private static void myPrivate()
	{
		System.out.println("Private method Within Class only");
	}

  protected static void myProtected()
	{
		System.out.println("Protected Method outside the package in case of inheritance only ");
	}
  static void myDefault()
	 {
		 System.out.println("default method Within Package");
	 }
	
  public void mySirname()
	{
    System.out.println("Non static Method");		
    System.out.println(a+b);
	}
  
  private void myPrivate_N()
	{
		System.out.println("Private method non Static ");
	}
	 
  protected void myProtected_n()
	{
		System.out.println("Protected method non static");
	}
	 
  void myDefaulte_N()
	{
		System.out.println("Default Method Non static");
	}
	
	public static void main(String[] args) {
		methods_Assess_modifer.myName();
		methods_Assess_modifer.myPrivate();
		methods_Assess_modifer.myProtected();
		methods_Assess_modifer.myDefault();
	
	methods_Assess_modifer h= new methods_Assess_modifer();
		h.mySirname();
		h.myPrivate_N();
		h.myProtected_n();
		h.myDefaulte_N();
	}
}