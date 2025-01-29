package oopLessons.Polymorphism.Basics;

public class Runner {
	public static void main(String[] args) {
		Moveable car = new Car();
		Dog dog = new Dog();
		car.move();
		dog.move();

		Moveable[] moveables = new Moveable[2];
		moveables[0] = car;
		moveables[1] = dog;

		for (Moveable i : moveables) {
			i.move();
			i.back();
		}


	}
}
