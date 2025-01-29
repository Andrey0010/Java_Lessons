package oopLessons.interfacesInheritance;

public interface Alive extends Eatable, Moveable {
	@Override
	default void eat() {
		Eatable.super.eat();
	}
}
