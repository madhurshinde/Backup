package Collections_Framwork;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator;

public class D_HashMap {

	public static void main(String[] args) {
		
		
	
}
	
	public void hashMapMethod() {
		
		D_HashMap h = new D_HashMap();               //may have one null key and multiple null values
		
		h.put(2,"Shinde");                                     //maintains no order             maintains no order
		h.put(null,null);
		h.put(null,"yavatmal");
		System.out.println(h.get(1));
		System.out.println(h.get(null));
		System.out.println(h.get(2));
		
	//first way to access	
		Set set =h.entrySet();
		System.out.println(set);
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry =(Map.Entry)itr.next();
			System.out.println(entry.getValue());		
			System.out.println(entry.getKey());
		}
		
		
	//2nd way 
		for(Map.Entry me :h.entrySet) {
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
	}
}