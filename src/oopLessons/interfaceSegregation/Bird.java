package oopLessons.interfaceSegregation;

public class Bird implements Flyable{
	@Override
	public void fly() {
		System.out.println("Птица летит по воздуху");
	}
}
