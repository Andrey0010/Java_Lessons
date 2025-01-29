package oopLessons.interface_vs_abstract_class;

public class Ivan implements Swimmable {
	private Boat boat;

	public void setBoat(Boat boat) {
		this.boat = boat;
	}

	@Override
	public void swim() {
		System.out.println("Ivan swims");
	}
}
