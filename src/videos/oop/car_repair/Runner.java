package videos.oop.car_repair;

public class Runner {
	public static void main(String[] args) {
		Car car = new Car("Mersedes", "Diesel");
		Truck truck = new Truck("BMW", "2000");
		Jeep jeep = new Jeep("Jeep", 350);

		TruckMechanic truckMechanic1 = new TruckMechanic("Oleg");
		TruckMechanic truckMechanic2 = new TruckMechanic("Sergey");
		CarMechanic carMechanic1 = new CarMechanic("Egor");
		CarMechanic carMechanic2 = new CarMechanic("Matvey");

		Garage garage = new Garage(truckMechanic1, truckMechanic2, carMechanic1, carMechanic2);
		garage.repairVehicles(car, truck, jeep);
	}
}
