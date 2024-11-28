
package c_String_and_progrm;

public class String_Buffer_billider {

	public static void main(String[] args) {
		
		
  StringBuffer a = new StringBuffer("MAdhur");                // thread sleep and synchronice   
		a.append(" Shinde");
		System.out.println(a);
		a.append(" Yavatmal");
		System.out.println(a);
        System.out.println(a.reverse());  
        System.out.println(a.charAt(5));                     // index value start from 0
        System.out.println(a.substring(3,9)); 

        
        
  StringBuilder b = new StringBuilder("Durgesh");          // not synchronised (Thread safe)  faster 
		b.append(" Shamraj");
		System.out.println(b);
		System.out.println(b.reverse());
		System.out.println(b.charAt(0));
	}
}
