package Collections_Framwork;

import java.util.ArrayList;
import java.util.Iterator;


public class A_Array_List {
	public static void main(String[] args) {
	
		A_Array_List obj =new A_Array_List ();
		obj.arrayListaddMethods();
		obj.featchProceess();
	}
	
	public void featchProceess() {
		
		ArrayList hi = new ArrayList();        // elements can be added and removed from an ArrayList whenever you want  
		hi.add("madhur");                    // ArrayList internally uses a dynamic array to store the elements             not synchronized
		hi.add(255454); 
		hi.add("ll");
		System.out.println("All Array = "+hi);
		
	// 1.Read BY index value 
		 System.out.println("By One by ONE = " +hi.get(0)); //,madhur
		 System.out.println("By One by ONE = " +hi.get(1)); // 255454
		 System.out.println("By One by ONE = " +hi.get(2)); // 11

    //2. Read By using For Loop 
		 for(int i=0; i < hi.size(); i++) {
			 System.out.println("By For Loop =" +hi.get(i));
		 }
		 
    //3 by for each loop
		 for(Object one:hi) {
			 System.out.println("for Each loop ="+ one);
		 }
		 
	// 4.By itereator interface 
		  Iterator i = hi.iterator();
		     while(i.hasNext()) {                
		        System.out.println("iteraotr ="+i.next());	 	 
		     }
	}
	
	public void arrayListaddMethods() {	
	//1.Add
		System.out.println("1.Add elements in Array List");	
		ArrayList AL=new ArrayList();				//  Add duplicate,null value ,order maintain ,Dynamic Array + Hetro Data Type 
		AL.add(4);
		AL.add("Madhur");
		AL.add(true);
		AL.add(54545);
		AL.add(33.6);
		AL.add(4);
		AL.add('A');
		AL.add('A');
		AL.add(null);
		AL.add("Automation");
	    System.out.println(AL);
		
	    ArrayList AL1=new ArrayList();			
		AL1.add("Test1");
		AL1.add("Test2");
		AL1.add("Test3");
		System.out.println(AL1);
		
	 //2. Size of Array	
		System.out.println("2 .Find the size of Array ="+AL.size());
		System.out.println("2.Find the size of Array ="+AL1);
	
	//3.Remove 
		System.out.println("Original Array LISt = "+AL);
		System.out.println(AL.remove(0));
		System.out.println("After Remove 0 index = "+AL);
		System.out.println(AL.remove(3));
		System.out.println("After Remove 3 index = " +AL);
		
	//4. Contains   return True if present 
		System.out.println(AL.contains("Madhur"));
		System.out.println(AL.contains("MAdhuR"));  // CAse Sensative
		System.out.println(AL.contains(787897));
		System.out.println(AL.contains(54545));
		
	//5.Insert NEw Eleement in sepecific postion
		AL.add(0, "First MADHUR");
		System.out.println(AL);
		AL.add(5, "5TH MADHUR");
		System.out.println(AL);
		
	//6. Get Specific Element in array List 
		System.out.println(AL.get(0));
		
	//7. replace 
		AL.set(0, "Replace First MAdhur");
		System.out.println(AL);
		
	//8. is Empty 
		System.out.println(AL.isEmpty());
		
	}	
}
