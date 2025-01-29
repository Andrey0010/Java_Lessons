package oop_mine;

public class Clothes implements Good {
	private String type;
	private String material;
	private double price;

	public Clothes(String type, String material, double price) {
		this.type = type;
		this.material = material;
		this.price = price;
	}
	@Override
	public double getPrice() {
		return price;
	}
	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String getType() {
		return type;
	}
	@Override
	public void goodInfo() {
		System.out.printf("Товар [ %s ]. Материал [ %s ]. Цена: [ %.2f ]\n", type, material, price);
	}
}
