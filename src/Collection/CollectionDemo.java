package Collection;

import java.awt.List;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("oracle");
		v.add("Microsoft");
		v.add("Google");
		v.add("Apple");
		v.add("IBM");

		System.out.println(("--Iterating over vector using each"));
		for (String elem : v)
			System.out.println(elem);

		System.out.println("--Iterating over vector using Iterator");
		Iterator<String> itr = v.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		LinkedList<String> lst = new LinkedList<>();
		lst.add("Tesla");
		lst.add("Apache");
		lst.addFirst("Apple");

		v.addAll(lst);
		System.out.println("--Iterating over updated using for each");
		for (String elem : v) {
			System.out.println(elem);
		}
		HashSet<String> set = new HashSet<>(v);
		System.out.println("--Iterating over HashSet using for each");
		for (String elem : set)
			System.out.println(elem);
		// Converting set into treeset
		TreeSet<String> tree = new TreeSet<>(set);
		System.out.println("Iterating over Treeset using for each");
		for (String elem : tree.descendingSet())
			System.out.println(elem);

		System.out.println("--Iterating over Treeset  using Java 8 foreach()");
		// New way to iterate from Java 8
		tree.forEach(System.out::println);
		
		
		String[] week = {"Sun","Mon","Tues","Wed","Thurs","Fri","Sat"}
		List<String>days=
	}
}
