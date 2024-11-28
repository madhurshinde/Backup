package polymorphisum;

public class overloadmain {
		
     public static void main(int a) {        // main method overlaod
    	 System.out.println(" hello ");
	}
     public static void main(int a , char b)  //main method overload
     { 
		System.out.println(" sir");
	}
     public static void main(String[] args) // main method cll
     {
    	 overloadmain.main(1, 's');
    	 overloadmain.main(12);
	}
}
