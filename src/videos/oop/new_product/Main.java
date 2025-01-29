package videos.oop.new_product;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Product bread = new Product("Bread", 100);
		Product milk = new Product("Milk", 120);
		Product sugar = new Product("Sugar", 130);

		Position position1 = new Position(bread, 1);
		Position position2 = new Position(milk, 2);
		Position position3 = new Position(sugar, 3);

		ArrayList<Position> list1 = new ArrayList<>();
		Order order1 = new Order();
		order1.addPositions(position1, position2, position3);
		order1.addPositions(position2);
		order1.calculateSum();
		//order1.printCheck();
		order1.print();

	}
}
