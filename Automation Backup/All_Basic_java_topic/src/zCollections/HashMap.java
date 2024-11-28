package zCollections;

public class HashMap {

	public static void main(String[] args) {
		
	HashMap<Integer,String> h = new HashMap<>();               //may have one null key and multiple null values
	h.put(2,"Shinde");                                     //maintains no order             maintains no order
	h.put(null,null);
	h.put(null,"yavatmal");
	System.out.println(h.get(1));
	System.out.println(h.get(null));
	System.out.println(h.get(2));
		
}
}