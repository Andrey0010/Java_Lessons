package oopLessons.anonymous_classes;

public class Runner {
	public static void main(String[] args) {
		Alive dog = new Alive() {
			@Override
			public void eat() {
				System.out.println("Dog eats");
			}
			@Override
			public void breathe() {
				System.out.println("Dog breathes");
			}
		};
		dog.eat();
		dog.breathe();

		Animal cat = new Animal() {
			@Override
			public void eat() {
				System.out.println("Cat eats");
			}
			@Override
			public void breathe() {
				System.out.println("Cat breathes");
			}
		};
	}
}
