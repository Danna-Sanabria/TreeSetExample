import java.util.TreeSet;

public class TestTreeSet {

	TreeSet<Person> personList;
	TreeSet<Person> secondPersonListPersons;

	public TestTreeSet() {
		personList = new TreeSet<Person>();
		secondPersonListPersons = new TreeSet<Person>();
		init();
	}

	private void init() {
		personList.add(new Person(1, "Juan"));
		personList.add(new Person(5, "Carlos"));
		personList.add(new Person(3, "Laura"));
		personList.add(new Person(7, "Lina"));
	}

	private void print() {
		for (Person person : personList) {
			System.out.println(person);
		}
	}

	private void addList() {
		secondPersonListPersons.add(new Person(2, "Karen"));
		secondPersonListPersons.add(new Person(4, "Camilo"));
		secondPersonListPersons.add(new Person(6, "Juana"));
		secondPersonListPersons.add(new Person(8, "Jhon"));
		personList.addAll(secondPersonListPersons);
	}

	private Person getFirstPerson() {
		return personList.first();
	}

	private Person getLastPerson() {
		return personList.last();
	}

	private Person getPreviousPerson(Person person) {
		return personList.lower(person);
	}

	private Person getNextPerson(Person person) {
		return personList.higher(person);
	}

	private void deleteList() {
		personList.clear();
	}

	public static void main(String[] args) {
		TestTreeSet testTreeSet = new TestTreeSet();
		testTreeSet.print();
		testTreeSet.addList();
		System.out.println("\n");
		testTreeSet.print();
		System.out.println("\n");
		System.out.println("La primera persona en la lista es: " + testTreeSet.getFirstPerson());
		System.out.println("La ultima persona en la lista es: " + testTreeSet.getLastPerson());
		Person camilo = new Person(4, "Camilo");
		System.out.println("La persona que esta antes que Camilo es: " + testTreeSet.getPreviousPerson(camilo));
		System.out.println("La persona que esta después que Camilo es: " + testTreeSet.getNextPerson(camilo));
		testTreeSet.deleteList();
		testTreeSet.print();
	}
}
