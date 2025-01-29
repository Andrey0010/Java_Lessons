package oopLessons.Polymorphism.Basics;

public class Car implements Moveable{

	public void move() {
		System.out.println("Машина едет");
	}
	public void turnOf() {
		System.out.println("Машина выключилась");
	}

	@Override
	public void back() {
		System.out.println("Машина возвращается назад");
	}
}
