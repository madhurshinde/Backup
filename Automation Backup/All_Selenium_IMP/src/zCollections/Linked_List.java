package zCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) { 
		LinkedList ji = new LinkedList();       // LinkedList internally uses a doubly linked list ...   not synchronized
		 ji.add("Shinde"); 
		 ji.add(5457);
		 ji.add("454545aaaaaa");
		 
		 
		 //BY interator Interface
		 Iterator hi = ji.iterator();
		 while(hi.hasNext()) {
			  System.out.println(hi.next());}
		 
		 //BY index value
		 System.out.println(ji.get(0));
		 System.out.println(ji.get(1));
		 System.out.println(ji.get(2));		 
	}
}
