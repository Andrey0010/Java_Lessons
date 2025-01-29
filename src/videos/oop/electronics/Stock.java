package videos.oop.electronics;
import java.util.ArrayList;
import java.util.List;
/*
-добавление нового товара на склад
-проверка наличия товара в заданном количестве
-информация о наличии всех товаров на складе
-механизм покупки товара
-списание товаров при продаже
*/
public class Stock {
	private List<Good> goods;

	public Stock() {
		this.goods = new ArrayList<>();
	}

	public void addGoods(int number, Good good) {
		goods.add(good);
		good.setQuantity(good.getQuantity() + number);
		removeDuplicates();
	}
	private void removeDuplicates() {
		for (int i = 0; i < goods.size(); i++) {
			for (int j = i + 1; j < goods.size(); j++) {
				if (goods.get(i).equals(goods.get(j))) {
					goods.remove(j);
					j--;
				}
			}

		}
	}
	public void stockInfo() {
		goods.forEach(System.out::println);
	}
	public boolean checkNumber(Good good, int number) {
		for (Good i : goods) {
			return (good.equals(i) && i.getQuantity() >= number);
		}
		return false;
	}
	public void sellGoods(Good good, int number) {
		if (checkNumber(good, number)) {
			good.setQuantity(good.getQuantity() - number);
		}else {
			System.out.println("Данного количества товара нет на складе");
		}
		if (good.getQuantity() == 0)
			goods.remove(good);
	}

	@Override
	public String toString() {
		return "Stock{" +
				"goods=" + goods +
				'}';
	}
}





