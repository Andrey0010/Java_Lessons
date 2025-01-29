package videos.oop.animals;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat("Murzik", 5, "кот", "black");
		System.out.println(cat);
		System.out.println(cat.petDescription());
		cat.sound();

	}
}
