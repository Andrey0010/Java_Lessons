package oopLessons.dependencyInversion;

public class Runner {
	public static void main(String[] args) {
		Poodle poodle = new Poodle();
		Shepherd shepherd = new Shepherd();
		Terier terier = new Terier();
		Zoo zoo = new Zoo(terier, shepherd);
		Zoo zoo1 = new Zoo(poodle, shepherd);
	}
}
