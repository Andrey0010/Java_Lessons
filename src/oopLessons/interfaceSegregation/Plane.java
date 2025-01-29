package oopLessons.interfaceSegregation;

public class Plane implements Flyable, Drivable{
	@Override
	public void drive() {
		System.out.println("Самолет едет по земле");
	}

	@Override
	public void fly() {
		System.out.println("Самолет летит по воздуху");
	}
}
