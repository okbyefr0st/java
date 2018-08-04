package Collection;

import java.util.TreeSet;

public class PersonSorting {

	public static void main(String[] args) {
//		PersonComparator pc = new PersonComparator();
//		TreeSet<Person1> persons = new TreeSet<>();
		
		
		TreeSet<Person1> persons= new TreeSet<>((p1,p2)->p1.getAge()-p2.getAge());
		persons.add(new Person1("Polo", 21));
		persons.add(new Person1("Lili", 19));
		persons.add(new Person1("Mili", 20));

		persons.forEach(System.out::println);
	}

}
