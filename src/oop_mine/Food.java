package oop_mine;

import java.time.LocalDate;

public class Food implements Good {
	private String type;
	private LocalDate expiry;
	private double price;

	public Food(String type, LocalDate expiry, double price) {
		this.type = type;
		this.expiry = expiry;
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
		System.out.printf("Товар [ %s ]. Срок годности [ %s ]. Цена: [ %.2f ]\n", type, expiry, price);
	}
}
