package oopLessons.class_object;

public class Runner {
	public static void main(String[] args) {
		Cat cat = new Cat("Murzik");
		Class<? extends Cat> aClass = cat.getClass();
		System.out.println(aClass.getName());
		System.out.println(aClass.toString());

	}
}
