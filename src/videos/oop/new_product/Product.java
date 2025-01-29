package videos.oop.new_product;
/*Задача : Управление заказами в магазине
Создайте систему учёта заказов в интернет-магазине.
Каждый заказ должен содержать информацию о товарах и их количестве.
Реализуйте функционал добавления товаров в заказ,
подсчёта общей стоимости заказа и вывода списка товаров.*/
public class Product {
	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}


	@Override
	public String toString() {
		return "Product{" +
				"name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}

