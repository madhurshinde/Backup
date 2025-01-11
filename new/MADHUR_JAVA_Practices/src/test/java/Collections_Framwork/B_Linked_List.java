package Collections_Framwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class B_Linked_List {

	public static void main(String[] args) { 
		
		B_Linked_List obj =new B_Linked_List();
	//	obj.accesslinklist();
		obj.methodOfLinkedList();
	}
	
	public void accesslinklist() {
		
		LinkedList ji = new LinkedList();       // LinkedList internally uses a doubly linked list ...   not synchronized
		 ji.add("Shinde"); 
		 ji.add(5457);
		 ji.add("454545aaaaaa");		 
		
			// 1.Read BY index value 
		 System.out.println("By One by ONE = " +ji.get(0)); //,madhur
		 System.out.println("By One by ONE = " +ji.get(1)); // 255454
		 System.out.println("By One by ONE = " +ji.get(2)); // 11

    //2. Read By using For Loop 
		 for(int i=0; i < ji.size(); i++) {
			 System.out.println("By For Loop =" +ji.get(i));
		 }
		 
    //3 by for each loop
		 for(Object one:ji) {
			 System.out.println("for Each loop ="+ one);
		 }
		 
	// 4.By itereator interface 
		  Iterator i = ji.iterator();
		     while(i.hasNext()) {                
		        System.out.println("iteraotr ="+i.next());	 	 
		     } 
	}
	
	public void methodOfLinkedList() {		
		//1.Add
		System.out.println("1.Add elements in Array List");	
		LinkedList LL=new LinkedList();				//  Add duplicate,null value ,order maintain ,Dynamic Array + Hetro Data Type 
		LL.add(4);
		LL.add("Madhur");
		LL.add(true);
		LL.add(54545);
		LL.add(33.6);
		LL.add(4);
		LL.add('A');
		LL.add('A');
		LL.add(null);
		LL.add("Automation");
		System.out.println("Linked List Added are = "+LL);			
			
	   //2. Size of Array	
		System.out.println("2 .Find the size of Array ="+LL.size());
	
	   //3.Remove 
			System.out.println("Original Array LISt = "+LL);
			System.out.println(LL.remove(0));
			System.out.println("After Remove 0 index = "+LL);
			System.out.println(LL.remove(3));
			System.out.println("After Remove 3 index = " +LL);
			
		//4. Contains   return True if present 
			System.out.println(LL.contains("Madhur"));
			System.out.println(LL.contains("MAdhuR"));  // CAse Sensative
			System.out.println(LL.contains(787897));
			System.out.println(LL.contains(54545));
			
		//5.Insert NEw Eleement in sepecific postion
			LL.add(0, "First MADHUR");
			System.out.println(LL);
			LL.add(5, "5TH MADHUR");
			System.out.println(LL);
			
			System.out.println("5.~~~~~~~~~~~~~~~~~~~");
			LL.addFirst("AT FIRST By First");
			System.out.println(LL.getFirst());
			LL.addLast("AT LAST by Last");
			System.out.println(LL.getLast());
			
			System.out.println(LL);
		//6. Get Specific Element in array List 
			System.out.println("element at index 0= "+LL.get(0));
			
		//7. replace 
			LL.set(0, "Replace First MAdhur");
			System.out.println(LL);
			
		//8. is Empty 
			System.out.println(LL.isEmpty());
		}
	}























