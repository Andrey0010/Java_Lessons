package oopLessons.Polymorphism;

public class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("Собака ест");
	}
	public void bark() {
		System.out.println("Woof-woof");
	}
}
