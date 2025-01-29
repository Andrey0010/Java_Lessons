package oopLessons.interfacesInheritance;

public interface Eatable {
	default void eat() {
		System.out.println("Животное есть");
	}
}
