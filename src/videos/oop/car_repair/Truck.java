package videos.oop.car_repair;
/*Truck — добавляет атрибут cargoWeight.*/
public class Truck extends Vehicle {
	private String cargoWeight;

	public Truck(String model, String cargoWeight) {
		super(model);
		this.cargoWeight = cargoWeight;
	}
}
