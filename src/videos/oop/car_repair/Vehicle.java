package videos.oop.car_repair;

/*Создайте базовый класс Vehicle с атрибутами:
String model,
boolean isBroken (по умолчанию true).*/

public abstract class Vehicle {
	private String model;
	private boolean isBroken;

	public Vehicle(String model) {
		this.model = model;
		this.isBroken = true;
	}

	public String getModel() {
		return model;
	}

	public boolean isBroken() {
		return isBroken;
	}
}
