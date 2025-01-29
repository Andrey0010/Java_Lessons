package videos.oop.vehicle;

/*Создайте базовый класс Vehicle (транспортное средство):
Атрибут: скорость (speed).
Метод: move(), который выводит сообщение о движении транспорта со скоростью.*/

public abstract class Vehicle {
	private int speed;

	public Vehicle(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}
	public abstract void move();

}
