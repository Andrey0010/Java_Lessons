package oopLessons.record;

public record HumanRecord(int birthYear,
						  String name,
						  String surname,
						  String lastName
						  ) {
	public HumanRecord {
		System.out.println("Hello from record!");
	}
	public void info() {
		System.out.println(name + " " + surname);
	}
}
