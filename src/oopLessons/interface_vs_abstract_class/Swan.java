package oopLessons.interface_vs_abstract_class;

public class Swan extends Bird implements Swimmable {
	public Swan(String color) {
		super(color);
	}
	@Override
	public void swim() {
		System.out.println("Swan swims");
	}
}
