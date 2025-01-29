package oop_mine;

import oopLessons.nested_classes.Human;
import videos.oop.electronics.Good;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
	public static void main(String[] args) {
		Food food = new Food("Хлеб", LocalDate.of(2025, 1, 25), 120);
		Clothes clothes = new Clothes("Футболка", "Хлопок", 500);
		Electronics electronics = new Electronics("Телефон", "Черный", 20000);

		Order order1 = new Order(LocalTime.of(17, 30), "ул. Ленина, д. 1", food, clothes, electronics);
		//Order.OrderInfo orderInfo = new Order.OrderInfo(LocalTime.of(17, 30), "ул. Ленина, д. 1");
		//order1.setOrderInfo(orderInfo);
		order1.printOrder();
		System.out.println("________");
		order1.discount();
		order1.printOrder();
		System.out.println("________");
		order1.check();



	}

}
