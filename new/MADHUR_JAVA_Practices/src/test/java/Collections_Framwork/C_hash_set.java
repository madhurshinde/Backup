package Collections_Framwork;

import java.util.HashSet;
import java.util.Iterator;


public class C_hash_set {

	
	public static void main(String[] args) {
	
		C_hash_set obj =new C_hash_set();
	//	obj.AccessMethod();
		obj.hashSetMethod();	
	}

	public void AccessMethod() {
		
		HashSet ha =new HashSet();
		ha.add("MAdhur");
		ha.add("Shinde");
		ha.add(30);
		ha.add('M');
		
//		for(int i=0; i<ha.size();i++) {
//			System.out.println(ha.get);			// get method not available 
//		}
		for(Object obj:ha) {
			System.out.println("by for each =" +obj);
		}
		
		Iterator it= ha.iterator();
		while(it.hasNext()) {
			System.out.println("By iterator = "+it.next());
		}
	}
	
	public void hashSetMethod() {
	
		HashSet h =new HashSet();         // doesn�t permit null  non synchronized.
		h.add("hi");					 //  doesn't maintain the insertion order
		h.add("he");
		h.add("sjk");
		h.add(345);
		h.add(true);
		h.add('h');
		h.add(null);
		h.add(null);					// only one null accept
		
		System.out.println(h);
		System.out.println(h.add(345)); // false return if duplicate value try to add

	// remove
		h.remove('h');
		System.out.println(h);
		
	// isEmpty
		System.out.println("Check Empty = "+ h.isEmpty());

	//Set and get method are not present in HashSet
		
	//Contains
		System.out.println(h.contains("hi"));
		
	//Size
		System.out.println("Size is = "+ h.size());
		
		}
	}




