package start.My_Lessons.equals_hashcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Car {
	private String model;
	private int year;

	public Car(String model, int year) {
		this.model = model;
		this.year = year;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Car car = (Car) o;
		return year == car.year && Objects.equals(model, car.model);
	}
	@Override
	public String toString() {
		return "Car{" +
				"model='" + model + '\'' +
				", year=" + year +
				'}';
	}
	@Override
	public int hashCode() {
		return Objects.hash(model, year);
	}
	public static void main(String[] args) {
		Set<Car> set = new HashSet<>();
		Car car1 = new Car("BMW", 2005);
		Car car2 = new Car("VolksWagen", 1994);
		Car car3 = new Car("BMW", 2005);
		set.add(car1);
		set.add(car2);
		set.add(car3);
		System.out.println(set);

		System.out.println(car1.hashCode());
	}

}
