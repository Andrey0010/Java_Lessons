package videos.oop.car_repair;

public class Jeep extends Vehicle {
	private double horsePower;

	public Jeep(String model, double horsePower) {
		super(model);
		this.horsePower = horsePower;
	}
}
