package videos.oop.electronics;
/*Задача: Магазин электроники
У каждого товара есть атрибуты: тип товара и количество.
У каждого товара есть краткое описание.

Реализуйте классы с несколькими товарами.
Дополнительные атрибуты: производитель и объем памяти.

Реализуйте класс "Склад", который хранит информацию о наличии товара и предоставляет методы для:
добавления нового товара на склад
списания товаров при продаже
проверки наличия товара в заданном количестве
Реализуйте метод: сводная информация о наличии всех товаров на складе.
Реализуйте механизм покупки товара: проверьте, есть ли товар в нужном количестве на складе,
и обновите данные при успешной покупке.
*/
public abstract class Good {
	private String type;
	private int quantity;

	public Good(String type) {
		this.type = type;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getType() {
		return type;
	}

	public abstract void goodInfo();

	@Override
	public String toString() {
		return "Good{" +
				"type='" + type + '\'' +
				", quantity=" + quantity +
				'}';
	}
}
