public class Person implements Comparable<Person> {

	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return name + " - " + id;
	}

	@Override
	public int compareTo(Person o) {
		return id - o.getId();
	}
}
