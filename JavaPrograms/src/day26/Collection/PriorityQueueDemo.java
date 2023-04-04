package day26.Collection;

import java.util.Iterator;
import java.util.Queue;

// while adding element in Queue, it will always keep smallest element on the top


public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new java.util.PriorityQueue<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		System.out.println(queue.size());
		System.out.println("element() will return top-most element of queue : "+queue.element());
		System.out.println("head element of the queue using peek():" + queue.peek());
		System.out.println("Iterating elements using foreach");
		for(Object a:queue) {
			System.out.println("foreach each" +a);
		}
		
		  int i=1;  
		    while(i<10){  
		        System.out.println(i);  
		    i++;   
		    }
		Iterator itr = queue.iterator();
		System.out.println(itr.next());
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}

}
