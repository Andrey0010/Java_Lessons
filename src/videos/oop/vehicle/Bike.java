package videos.oop.vehicle;
/*Класс Bike должен добавлять атрибут о типе велосипеда (type, например, "горный", "дорожный").
Переопределите метод move() для вывода информации о движении велосипеда и его типа.*/
public class Bike extends Vehicle{
	private String type;

	public Bike(int speed, String type) {
		super(speed);
		this.type = type;
	}

	@Override
	public void move() {
		System.out.printf("%s велосипед движется со скоростью %d\n", type, getSpeed());
	}
}
