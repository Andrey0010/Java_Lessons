package oopLessons.functional_interfaces;

public class Bird implements Sounding{
	@Override
	public void makeSound() {
		System.out.println("Bird is singing");
	}
}
