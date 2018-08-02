
public class Person {

	private String name;
	private int age;

	public Person() {
		this("Anonymous", -1);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println("Name :" + name + "\tAge :" + age);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (this.name.equals(p.name) && age == p.age)
				return true;
		}

		return false;
	}

	@Override
	public void finalize() throws Throwable {
		System.out.println("Person is no more!!!");
	}

	public static void main(String[] args)

	{

		// Person p1 = new Person("Polo", 21);
		// Person p2 = new Person("Polo", 21);
		//
		// p1.print();
		//
		// System.out.println(p1.hashCode());
		// System.out.println(p1);// implicitly calls toString
		//
		// System.out.println(p1.equals(p2));

		Person p = null;

		for (int c = 1; c <= 5; c++)
			p = new Person();

		System.gc(); // requesting gc
	}

	// @Override
	// public String toString() {
	// return "Name :" + name + "\tAge :" + age;
	// }

}
