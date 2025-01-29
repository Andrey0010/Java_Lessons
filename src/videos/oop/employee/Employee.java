package videos.oop.employee;
/*Задача: Класс Employee
Создайте класс Employee, который описывает сотрудника.

Поля:
name (имя сотрудника)
baseSalary (основная зарплата)
bonus (бонус)

Реализуйте методы:
Конструктор, принимающий имя и основную зарплату.
Поле bonus должно инициализироваться нулём.
Метод calculateSalary, возвращающий общую зарплату сотрудника (основная зарплата + бонус).
Метод addBonus, который задает бонус к зарплате.
Метод compareSalaries который сравнивает
зарплаты двух сотрудников и возвращает имя сотрудника с большей зарплатой.
Напишите код для создания нескольких сотрудников, добавления бонусов и сравнения их зарплат.*/

public class Employee {
	private String name;
	private double baseSalary;
	private double bonus;

	public Employee(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
		//this.bonus = 0;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double calculateSalary() {
		return baseSalary + bonus;
	}
	public void addBonus(double sum) {
		bonus = 0;
		bonus += sum;
	}
	public static String compareSalaries(Employee employee1, Employee employee2) {
		if (employee1.calculateSalary() > employee2.calculateSalary()) {
			return "У сотрудника " + employee1.name + " зарплата больше";
		} else if (employee2.calculateSalary() > employee1.calculateSalary()) {
			return "У сотрудника " + employee2.name + " зарплата больше";
		}return "У этих сотрудников одинаковые зарплаты";
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", baseSalary=" + baseSalary +
				", bonus=" + bonus +
				'}';
	}
}
