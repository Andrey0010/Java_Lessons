package oopLessons.interfacesInheritance;

public interface Moveable {
	void move();
	default void eat() {
		System.out.println("Движущееся животное есть");
	}

}
