package videos.oop.vehicle;

/*Реализуйте метод displayMovement(Vehicle vehicle), который вызывает метод move() для объекта Vehicle.
Создайте массив (или список) объектов типа Vehicle, который включает автомобили и велосипеды с разными характеристиками.
Выведите движение всех транспортных средств, используя цикл и метод displayMovement.*/
public class TransportTest {
	public static void displayMovement(Vehicle vehicle) {
		vehicle.move();
	}

	public static void main(String[] args) {
		Vehicle car = new Car(120, 4);
		Vehicle bike = new Bike(15, "Горный");
		Vehicle[] transport = {car, bike};

		for (Vehicle i : transport) {
			i.move();
		}
	}
}
