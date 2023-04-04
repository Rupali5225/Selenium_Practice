package day28.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import day26.Collection.ArrayListDemo;

public class uniqueEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list2 = new ArrayList();// Creating arraylist - default size is 10

		List list = new ArrayList();// Creating arraylist - default size is 10
		int fre[]=new int[list.size()];
		int same=-1;

		list.add("Mango");//string is an object so directly auto-upcasting from String to Object class object //
		list.add("Mango");//string is an object so directly auto-upcasting from String to Object class object //
		list.add("bananan");//string is an object so directly auto-upcasting from String to Object class object //
		list.add("orange");//string is an object so directly auto-upcasting from String to Object class object //

		
		
		
		// Printing the arraylist object
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);//toString overrided in Collection
		System.out.println("Traversing list through for loop:");
		
		ArrayList uniqueList = (ArrayList) list.stream().distinct().collect(Collectors.toList());

		//List<list> distinctElements = list.stream()
//	            .distinct()
//	            .collect( Collectors.toList() );
		
//		for (int i = 0; i < list.size(); i++) {
//            int flag = 0;  
//
//			for (int j = i+1; j < list.size(); j++) {
//
//			if(list.get(i)!=(list.get(j))) {
//			}
//			list2.add(list.get(i));
//
//			
//			//System.out.println(list.get(i));
//			}
//		}
		System.out.println("+++++++++++++++++");

		for (int i = 0; i < uniqueList.size(); i++) {


			System.out.println(uniqueList.get(i)); {
				
			}
			
		System.out.println("+++++++++++++++++");

	}

	}
}
