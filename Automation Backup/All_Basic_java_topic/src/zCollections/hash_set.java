package zCollections;

import java.util.HashSet;
import java.util.Iterator;


public class hash_set {

	
	public static void main(String[] args) {
		HashSet<String> h =new HashSet<String>();              // doesn’t permit null            non synchronized.   doesn't maintain the insertion order
		h.add("hi");
		h.add("he");
		h.add("sjk");
		
         Iterator hi = h.iterator();
         while(hi.hasNext()) {
        	 System.out.println(hi.next());
         
         }      
	}
}
