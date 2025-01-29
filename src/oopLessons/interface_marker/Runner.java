package oopLessons.interface_marker;

public class Runner {
	public static void main(String[] args) {
		Bird bird = new Bird();
		Plane plane = new Plane();
		if (bird instanceof Alive) {
			System.out.println("this object is alive");
		}
		if (plane instanceof Alive) {
			System.out.println("this object is alive");
		}else
			System.out.println("this object is NOT alive");
	}
}
