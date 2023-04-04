package day28.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class duplicateEle {


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
		System.out.println("Traversing list through for loop:");
		
		
		
	for (int i = 0; i < list.size(); i++) {
           int flag = 0;  

			for (int j = i+1; j < list.size(); j++) {
		           int count = 0;

		if(list.get(i)==(list.get(j))) {
			count++;
			list2.add(count);


		}
		else {
			list2.add(0);

		}

		
			//System.out.println(list.get(i));
		}
	}
		System.out.println("+++++++++++++++++");

		for (int i = 0; i < list2.size(); i++) {


			System.out.println(list2.get(i)); {
				
			}
			
		System.out.println("+++++++++++++++++");
		//System.out.println(+count);

	}

	}

}
