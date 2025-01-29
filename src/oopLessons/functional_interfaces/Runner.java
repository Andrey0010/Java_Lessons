package oopLessons.functional_interfaces;

public class Runner {
	public static void main(String[] args) {
		Sounding cat = new Cat();
		cat.makeSound();
		Sounding bird = () -> System.out.println("Bird is singing");
		bird.makeSound();
	}
}
