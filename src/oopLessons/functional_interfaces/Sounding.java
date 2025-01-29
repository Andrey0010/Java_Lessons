package oopLessons.functional_interfaces;

@FunctionalInterface
public interface Sounding {
	void makeSound();
	default void doSmonething() {
		System.out.println("Do something");
	}
}
