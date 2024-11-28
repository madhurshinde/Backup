package Practices_all;

public class Variables {

 //Variables 	
 	int a= 10;                                                                //instance variable /nonstatic variable 
	public int b = 41 ;
	private int c = 15 ;
	protected int d = 451 ;	

	static int e= 52 ;                                                            //static  variable 
	public static int f =12 ;
	private static int g = 15 ;
	protected static int h = 451 ;	
	
  public static void hiStatic ()                                                   // static method 
	 {
	  int i= 124 ;
	 
	  System.out.println(i+e+f+g+h);    //124+52+12+15+451                        local+ static 
	
	  Variables RF = new Variables ();
	  System.out.println(i + RF.a+ RF.b + RF.c+ RF.d);//124+10+41+15+451         local +Nonstatic 
	 }
	
   public void HiNon_Static()                                                    //non static method 
     {
	  int j = 101 ;
	  System.out.println(j+e+f+g+h); //101+52+12+15+451                          //local+static 
	  System.out.println(j+a+b+c+d); //101+10+41+15+451                         //local +non static 
     }
	
   public static void main(String[] args) {                           //main method 
		Variables.hiStatic();
		Variables hi =new Variables();
		hi.HiNon_Static();
	}

}
