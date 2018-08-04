package Collection;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person1> {

	@Override
	public int compare(Person1 p1, Person1 p2) {
		return p1.getAge()-p2.getAge();
	}

}
