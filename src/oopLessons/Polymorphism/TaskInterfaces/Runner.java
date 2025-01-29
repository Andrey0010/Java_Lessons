package oopLessons.Polymorphism.TaskInterfaces;

public class Runner {
	public static void main(String[] args) {
		Fish fish = new Fish();
		Duck duck = new Duck();
		Plane plane = new Plane();
		Swimmable[] pool = {fish, duck};
		Flyable[] sky = {duck, plane};
		for (Swimmable i : pool) {
			i.swim();
		}
		for (Flyable i : sky) {
			i.fly();
		}
	}
}
