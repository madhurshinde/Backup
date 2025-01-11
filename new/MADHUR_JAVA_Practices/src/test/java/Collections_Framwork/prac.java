package Collections_Framwork;

public class prac {

	
	
	public static void main(String[] args) {
		
		String one="hahaha";
		String two ="hahaha";
		String Three="Hahaha";
		String four=new String ("hahaha");
		
		//location and name both check
		System.out.println(one==two);        
		System.out.println(one==Three);  
		System.out.println(one==four);
		
		// only check name		
		System.out.println(one.equals(two));
		System.out.println(one.equals(Three)); 
		System.out.println(one.equals(four));
		
	}
}
