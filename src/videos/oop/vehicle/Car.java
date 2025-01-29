package videos.oop.vehicle;
/*Класс Car должен добавлять атрибут о количестве пассажиров (passengers).
Переопределите метод move() для вывода информации о движении автомобиля и количестве пассажиров.*/
public class Car extends Vehicle{
	private int passengers;

	public Car(int speed, int passengers) {
		super(speed);
		this.passengers = passengers;
	}

	@Override
	public void move() {
		System.out.printf("Автомобиль движется со скоростью %d с коилчеством пассажиров %d\n", getSpeed(), passengers);
	}
}
