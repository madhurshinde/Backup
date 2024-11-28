package zCollections;

import java.util.Hashtable;

public class HashTable {               // both contains values based on the key //both contains only unique keys//  maintains no order

	public static void main(String[] args) {
		Hashtable<Integer, String> htable = new Hashtable< Integer, String>();
		htable.put(5, null);                   //does not accept any null key or value                 is synchronized. maintains no order
		htable.put(3, "MAdhur");             //does not accept any null key or value
 		htable.put(3, "Shinde");
		htable.put(2, "Shinde");
		
		
		System.out.println(htable.get(3));
		System.out.println(htable.get(5));
	}
}
