package videos.oop.car_repair;

public class TruckMechanic implements Mechanic {
	private String name;

	public TruckMechanic(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean canRepair(Vehicle vehicle) {
		return vehicle instanceof Truck;
	}

	@Override
	public void repair(Vehicle vehicle) {
		System.out.printf("Механик %s принял автомобиль [ %s ] в ремонт\n", name, vehicle.getModel());
	}
}
