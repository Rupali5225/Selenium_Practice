package day28.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ListIntoQueue {
	public static void main(String args[]) {
	List l1 = new ArrayList();
	l1.add("a");
	l1.add("ab");
	l1.add("abc");

	Queue<String> queue = new PriorityQueue<String>();
	queue.addAll(l1);

	queue.forEach(obj -> {
		System.out.println(obj);
	});
	
	
//	 queue.add(Arrays.asList(l1));
//	  if (!queue.isEmpty()) {
//	    current = queue.poll();
//	  }
	
	}	
}
