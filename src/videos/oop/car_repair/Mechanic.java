package videos.oop.car_repair;
/*Автосервис: Ремонт автомобилей
Создайте интерфейс Mechanic с методом:
void repair(Vehicle vehicle).

Создайте базовый класс Vehicle с атрибутами:
String model,
boolean isBroken (по умолчанию true).

Создайте классы-наследники:
Car — добавляет атрибут engineType (например, Diesel).
Truck — добавляет атрибут cargoWeight.

Реализуйте два класса, представляющих механиков:
CarMechanic — ремонтирует только объекты класса Car.
TruckMechanic — ремонтирует только объекты класса Truck.

Создайте класс Garage, который:
Содержит список механиков (List<Mechanic>).
Имеет метод repairVehicle(Vehicle vehicle), который передаёт объект транспорта подходящему механику.

Дополнительно:
Если в гараже нет подходящего механика, выводится сообщение: No mechanic available for [model]..
Добавьте возможность динамического добавления механиков в гараж.

Задача:
Создайте список транспортных средств с разными типами.
Реализуйте процесс ремонта для всех машин в списке.
Цель: Понять интерфейсы, динамическое распределение задач, принцип инверсии зависимостей.*/
public interface Mechanic {
	void repair(Vehicle vehicle);
	boolean canRepair(Vehicle vehicle);
	String getName();
}
