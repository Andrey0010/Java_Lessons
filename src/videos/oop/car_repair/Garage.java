package videos.oop.car_repair;

/*Создайте класс Garage, который:
Содержит список механиков (List<Mechanic>).
Имеет метод repairVehicle(Vehicle vehicle), который передаёт объект транспорта подходящему механику.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Garage {
	private List<Mechanic> mechanics = new ArrayList<>();
	private List<Vehicle> vehiclesForRepair = new ArrayList<>();

	public Garage(Mechanic ...mechanic) {
		mechanics.addAll(Arrays.asList(mechanic));
	}
	private void checkAvailable(Vehicle ...vehicles) {
		vehiclesForRepair.clear();
		for (Vehicle vehicle: vehicles) {
			if (vehicle.isBroken()) {
				int check = 0;
				for (Mechanic mechanic : mechanics) {
					if (mechanic.canRepair(vehicle)) {
						System.out.printf("Механик %s может принять автомобиль [ %s ] в ремонт\n", mechanic.getName(), vehicle.getModel());
						check++;
					}
				}
				if (check == 0) {
					System.out.printf("Механика для ремонта автомобиля [ %s ] сегодня нет в гараже\n", vehicle.getModel());
				}else {
					vehiclesForRepair.add(vehicle);
				}
			}
			else {
				System.out.printf("Автомобиль [ %s ] исправен\n", vehicle.getModel());
			}
		}
	}
	public void repairVehicles(Vehicle ...vehicles) {
		Scanner scan = new Scanner(System.in);
		checkAvailable(vehicles);
		for (Vehicle vehicle : vehiclesForRepair) {
			boolean isFound = false;
			while (!isFound) {
				System.out.printf("Назначьте механика для ремонта автомобиля [ %s ]\n", vehicle.getModel());
				String name = scan.next();
				for (Mechanic mechanic : mechanics) {
					if (mechanic.canRepair(vehicle) && mechanic.getName().equalsIgnoreCase(name)) {
						isFound = true;
						mechanic.repair(vehicle);
						break;
					}
				}
				if (!isFound) {
					System.out.println("Ошибка: механика с таким именем нет или укзанный механик не ремонтирует такие авто.");
				}
			}
		}
	}
}





