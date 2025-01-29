package videos.oop.animals;

public class Cat extends Pet {
	private String color;

	public Cat(String name, int age, String species, String color) {
		super(name, age, species);
		this.color = color;
	}

	@Override
	public void sound() {
		System.out.println("Кошка мяучет");
	}
	@Override
	public String petDescription() {
		return super.petDescription();
	}
	@Override
	public String petDescription(String format) {
		return super.petDescription(format);
	}
	@Override
	public String toString() {
		return "Pet{" +
				"name=" + getName() +
				", age=" + getAge() +
				", species=" + getSpecies() +
				", color=" + color +
				'}';
	}
}
