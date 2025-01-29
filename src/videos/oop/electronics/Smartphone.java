package videos.oop.electronics;

public class Smartphone extends Good{
	private String brand;
	private int memory;

	public Smartphone(String type, String brand, int memory) {
		super(type);
		this.brand = brand;
		this.memory = memory;
	}

	@Override
	public void goodInfo() {
		System.out.printf("%s, производитель %s, объем памяти %d\n", getType(), brand, memory);
	}

	/*@Override
	public String toString() {
		return "Smartphone{" +
				"brand='" + brand + '\'' +
				", memory=" + memory +
				'}';
	}*/
}
