package videos.oop.product;

public class Runner {
	public static void main(String[] args) {
		Product product = new Product("Milk", 100);
		System.out.println(product);
		product.setDiscount(5);
		System.out.println(product);
	}
}
