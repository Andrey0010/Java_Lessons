package videos.oop.electronics;

public class Main {
	public static void main(String[] args) {
		Smartphone smartphone = new Smartphone("Смартфон", "Samsung", 512);
		Smartphone smartphone1 = new Smartphone("Смартфон", "Apple", 1024);
		Laptop laptop = new Laptop("Ноутбук", "Asus", 512);

		smartphone.goodInfo();
		smartphone1.goodInfo();
		laptop.goodInfo();
		System.out.println("________");
		Stock stock = new Stock();
		stock.addGoods(11, smartphone);
		stock.addGoods(5, smartphone1);
		stock.addGoods(3, laptop);
		stock.addGoods(3, smartphone1);
		stock.stockInfo();
		System.out.println("_________");
		stock.sellGoods(smartphone, 3);
		stock.stockInfo();
	}
}
