package zCollections;

import java.util.ArrayList;
import java.util.Iterator;


public class Array_List {
	public static void main(String[] args) {
	
	 ArrayList hi = new ArrayList();        // elements can be added and removed from an ArrayList whenever you want  
	   hi.add("madhur");                    // ArrayList internally uses a dynamic array to store the elements             not synchronized
	   hi.add(255454); 
	  hi.add("ll");
	  
	  // By itereator interface 
	  Iterator i = hi.iterator();
	     while(i.hasNext()) {                
	        System.out.println(i.next());	 	 
	     }
	  
	  //BY index value 
	 System.out.println(hi.get(0)); //,madhur
	 System.out.println(hi.get(1)); // 2
	 System.out.println(hi.get(2)); // 11
}	 
}