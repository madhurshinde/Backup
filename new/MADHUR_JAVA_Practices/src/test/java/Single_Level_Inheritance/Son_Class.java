package Single_Level_Inheritance;

public class Son_Class  extends Father_Class {   // extends Key word to inherit
	
   public void bike() {         	//Son class own method
	   System.out.println("Son own Bike Fz");
   }
 
   public static void main(String[] args) {
	
	   System.out.println("calling method by Create Object of Son class");	   
	   Son_Class son = new Son_Class();
	   son.bike();                 //    
	   son.Car();
	   son.Home();
	   son.Money();
	   son.Property();
	   
	   System.out.println("calling method by Create Object of Father class");
	   Father_Class fa =new Father_Class();
	   fa.Car();
	   fa.Money();
	   fa.Home();
	   fa.Property();
	//   fa.bike();      // we can not cl bike method bcoz its not available in Father class
	                   //Error :-The method bike() is undefined for the type Father_Class
   		}      }
