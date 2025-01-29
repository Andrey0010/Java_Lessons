package videos.product;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Product milk = new Product("Milk", 100);
		Product sugar = new Product("Sugar", 120);
		Product bread = new Product("Bread", 130);

		Position position1 = new Position(milk, 3);
		Position position2 = new Position(bread, 3);
		Position position3 = new Position(sugar, 3);

		ArrayList<Position> list1 = new ArrayList<>();
		Order order1 = new Order(list1);

		order1.addProducts(position1, position2, position3);
		order1.calculateTotalSum();
		order1.printCheck();

		ArrayList<Position> list2 = new ArrayList<>();
		Order order2 = new Order(list2);
		order2.addProducts(position1);
		order2.calculateTotalSum();
		order2.printCheck();



	}
}
