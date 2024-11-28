package polymorphisum;

public class overloading
{
   
  public void method1() 
    {                                                    // non static method 
     System.out.println("Non static");
    }
     
   public void method1(int a)                          //  non static method overloading argument int a
   {                                         
    System.out.println("Non static are");
   }
   public void method1 (char b)                        // non static method overloading argument char b
    {                       
     System.out.println("Non static are overloaded");
    } 
 
   
   
   public static void method2 ()                       // static method 
   {                     
   System.out.println(" method "); 
   }
     
   public static void method2 (int b)                 // Static method overloading argument int b
   {  
	System.out.println("static method overloaded ");
   } 
    
	public static void main(String[] args) {           // run here
		overloading obj =new overloading();  // create object
         obj.method1('b');
         overridding.method2();
	}	 
}


