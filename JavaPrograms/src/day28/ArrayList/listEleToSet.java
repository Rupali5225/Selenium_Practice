package day28.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class listEleToSet {
	public static void main(String args[]) {
		List l1 = new ArrayList();	
		l1.add("a");
		l1.add("ab");
		l1.add("abc");	
		Set<String> s1 = new HashSet<String>();
		s1.addAll(l1);
		
		System.out.println(s1);
	}
}
