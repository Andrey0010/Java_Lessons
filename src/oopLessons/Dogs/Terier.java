package oopLessons.Dogs;

public class Terier extends Dog {

	public Terier(int countTeeth) {
		super(countTeeth);
	}

	@Override
	public void run() {
		System.out.println("Терьер бежит");
	}

	@Override
	public void breathe() {
		System.out.println("Терьер дышит");

	}
}
