package videos.oop.car_repair;
/*Car — добавляет атрибут engineType (например, Diesel).*/
public class Car extends Vehicle{
	private String engineType;

	public Car(String model, String engineType) {
		super(model);
		this.engineType = engineType;
	}
}
