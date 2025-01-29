package oopLessons.class_object.clone.person;

public class PersonRunner {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person person = new Person("VasyaA", 121);
		Object clone = person.clone();
		System.out.println(person);
		System.out.println(clone);
	}
}
