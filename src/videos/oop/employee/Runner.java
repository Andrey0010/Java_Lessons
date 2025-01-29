package videos.oop.employee;

public class Runner {
	public static void main(String[] args) {
		Employee ivan = new Employee("Ivan", 3000);
		Employee sergey = new Employee("Sergey", 4000);
		System.out.println(ivan);
		System.out.println(sergey);
		ivan.addBonus(1000);
		System.out.println("__________");
		System.out.println(ivan);
		System.out.println(sergey);
		System.out.println(Employee.compareSalaries(ivan, sergey));
		System.out.println("__________");
		sergey.addBonus(300);
		System.out.println(ivan);
		System.out.println(sergey);
		System.out.println(Employee.compareSalaries(sergey, ivan));

		ivan.setBonus(5000);
		System.out.println(ivan);
		System.out.println(ivan.calculateSalary());

	}
}
