package day26.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorArrayList {

	public static void main(String args[]) {
		ArrayList list = new ArrayList();// Creating arraylist
		list.add("Mango");// auto-upcasting from String to Object class object
		list.add("Apple");
		list.add("Banana");
		list.add("123");
		// Printing the arraylist object
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);
		// accessing particular element
		//System.out.println(list.get(0));
		
		
		
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("Traversing list through for-each loop:");
		// Traversing list through for-each loop
		for (Object fruit : list) {
			System.out.println(fruit);
		}
		
		
		// changing the element
		list.set(1, "Dates");
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);
		
		
		// Sorting the list
		Collections.sort(list);//by default it sort the passed collection element in assending order and store it in the same collection
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);

		
		System.out.println("Traversing list through forEach() method:");
		// The forEach() method is a new feature, introduced in Java 8.
		list.forEach(a -> { // Here, we are using lambda expression
			System.out.println(a);
		});
	
		System.out.println("Traversing list through Iterator interface:");
		Iterator itr = list.iterator();
		/**
		 * List element: [Banana, Dates, Grapes, Mango]
		 * Iterator is a Interface in collection, which is used to iterate collection elements
		 * Iterator interface has following method to iterate collection elements
		 * 1. hasNext() ---> boolean --> true next element is present, false no next element
		 * 2. next() ---> Object --> it will return next element from collection
		 * 3. remove() --> void --> element deletion
		 * Iterator object can be use to iterate a collection only once, for 2nd iteration create new Iterator object
		 */
//		System.out.println(itr.hasNext());
//		System.out.println(itr.next());//123
//		System.out.println(itr.next());//Dates
//		System.out.println(itr.next());//Grapes
//		System.out.println(itr.next());//Mango
//		System.out.println(itr.next());//NoSuchElementException exception
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(itr.hasNext());//
		
		System.out.println("*********with used Iterator Object**********");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*******with new Iterator Object************");
		Iterator itr2 = list.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Is ArrayList Empty: "+al.isEmpty());  
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Hanumat");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		al2.add(new String("Pune"));
		System.out.println("al list elements: "+al);
		System.out.println("al2 list elements: "+al2);
		
		//ratianAll ====>remove a1 keep a12 ele
		al.retainAll(al2);
		System.out.println("al list after retailAll(): "+al);
		System.out.println("iterating the elements after retaining the elements of al2");
		Iterator itr1 = al.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		// can store duplicate
		List l2=new ArrayList();
		l2.add("Pune");
		l2.add("Pune");
		l2.add(123);
		l2.add("Pune");
		l2.add(null);
		System.out.println(l2);
		
/*****************************************************************************************/		
		
		IteratorArrayList a1=new IteratorArrayList();
		a1.display();
		
		List<IteratorArrayList> l1=new ArrayList<IteratorArrayList>();
		l1.add(new IteratorArrayList());
		l1.add(a1);
		
		l1.get(0).display();
		l1.get(1).display();
	//  
	}
	void display() {
		System.out.println("Hi, I am display method");
	}
	
}
