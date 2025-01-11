package Collections_Framwork;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		PriorityQueue<String> q =new PriorityQueue<String>();         //Element in this queue is associated with a priority value
		q.add("18");                                                  // doesn�t permit null
		q.add("hello");
		q.add("new itera");
		
		Iterator<String> h = q.iterator();
		while(h.hasNext()) {
			System.out.println(h.next());
		}
	}
}
