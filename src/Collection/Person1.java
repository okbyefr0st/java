package Collection;

public abstract class Person1 implements Comparable<Person1> {

	private String name;
	private int age;

	public Person1() {
	}

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name" + name + "\t Age: " + age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return 0;
	}

		


	@Override
	public int compareTo(Person1 p) {
		return name.compareTo(p.name);	}
}
