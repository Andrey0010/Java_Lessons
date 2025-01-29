package oop_mine;
/*Создайте класс "Заказ", который может содержать набор товаров.
Используйте вложенные классы для представления деталей каждого товара в заказе.
Реализуйте систему скидок для определённых категорий товаров, используя принцип инверсии зависимостей.*/

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order implements Filtre{
	private List<Good> goods = new ArrayList<>();
	private OrderInfo orderInfo;

	public Order(LocalTime deliveryTime, String address, Good...good) {
		goods.addAll(Arrays.asList(good));
		this.orderInfo = new OrderInfo(deliveryTime, address);
	}
	public void printOrder() {
		goods.forEach(Good::goodInfo);
		System.out.printf("Адрес доставки: [ %s ]. Время доставки [ %s ]\n", orderInfo.address, orderInfo.deliveryTime);
	}
	public void discount() {
		for (Good good : goods) {
			if (good.getType().equalsIgnoreCase("Хлеб"))
				good.setPrice(good.getPrice() - good.getPrice() * 0.05);
		}
	}
	@Override
	public void check() {
		for (Good good : goods) {
			if (good.getPrice() > 120)
				good.goodInfo();
		}
	}

	public static class OrderInfo {
		private LocalTime deliveryTime;
		private String address;

		public OrderInfo(LocalTime deliveryTime, String address) {
			this.deliveryTime = deliveryTime;
			this.address = address;
		}
		@Override
		public String toString() {
			return "OrderInfo{" +
					"deliveryTime=" + deliveryTime +
					", address='" + address + '\'' +
					'}';
		}
	}
	@Override
	public String toString() {
		return "Order{" +
				"goods=" + goods +
				", orderInfo=" + orderInfo +
				'}';
	}
}
