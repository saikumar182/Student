package java_lang;

import java.util.Comparator;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
@Override
	
	public String toString() {
		return this.name + ":" + this.age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

class CompareByAge implements Comparator<Person> {
	
	public int compare(Person p1, Person p2) {
		return p1.getAge() - p2.getAge();
	}
}
