package oopLessons.exeptions;

public class CheckedException {
	public static void main(String[] args) {
		startCar(0);
		System.out.println("Едем за грибами");
	}
	public static void startCar(int fuel) {
		checkFuel(fuel);
		System.out.println("Машина едет!");
	}
	public static void checkFuel(int fuel) {
		if (fuel <= 0) {
			throw new RuntimeException("Бензина нет!");
		}
	}
}
