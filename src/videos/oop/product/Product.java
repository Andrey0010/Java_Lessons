package videos.oop.product;
/*
Создайте класс Product, который описывает товар. У класса должны быть:
Поля:
name (название товара),
price (цена товара),
discount (скидка в процентах).

Конструктор, который принимает name и price.
Поле discount должно по умолчанию быть равно 0.

Метод getFinalPrice(), который возвращает итоговую цену с учетом скидки.
Создайте несколько объектов и продемонстрируйте их работу.*/
public class Product {
	private String name;
	private double price;
	private int discount;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		//this.discount = 0;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public double getFinalPrice() {
		return price - price * discount / 100;
	}

	@Override
	public String toString() {
		return "Product{" +
				"name='" + name + '\'' +
				", price=" + price +
				", discount=" + discount + "%, final price=" + getFinalPrice() +
				'}';
	}
}