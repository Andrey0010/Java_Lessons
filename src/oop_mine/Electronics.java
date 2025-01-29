package oop_mine;

public class Electronics implements Good {
	private String type;
	private String color;
	private double price;

	public Electronics(String type, String color, double price) {
		this.type = type;
		this.color = color;
		this.price = price;
	}
	@Override
	public String getType() {
		return type;
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
	public void goodInfo() {
		System.out.printf("Товар [ %s ]. Цвет [ %s ]. Цена: [ %.2f ]\n", type, color, price);
	}
}
