package day26.Collection.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class HashSetDemo {
	public static void main(String[] args) {
	Set<String> set = new TreeSet<String>();
//	Set<String> set = new HashSet<String>();

//	set.add("Ravi");
//	set.add("Vijay");
//	set.add("Ravi");// it don't get added in set
	set.add("A");
	set.add("D");
	set.add("1");
	set.add("2");
	set.add("6");

	set.add("3");// it don't get added in set
	set.add("8");
	set.add("7");
	set.add("6");
	


	Iterator<String> itr = set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}
