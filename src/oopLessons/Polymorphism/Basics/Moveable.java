package oopLessons.Polymorphism.Basics;

public interface Moveable {
	int count = 1;
	//public final static int COUNT = 1;

	public void move();

	default void back() {
		System.out.println("Возвращаемся назад");
	}
}
