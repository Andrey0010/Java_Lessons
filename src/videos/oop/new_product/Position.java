package videos.oop.new_product;

public class Position {
	private Product product;
	private int number;
	private double sum;

	public Position(Product product, int number) {
		this.product = product;
		this.number = number;
		this.sum = number * product.getPrice();
	}

	public double getSum() {
		return sum;
	}

	@Override
	public String toString() {
		return "Position{" +
				"product=" + product +
				", number=" + number +
				", sum=" + sum +
				'}';
	}
}
