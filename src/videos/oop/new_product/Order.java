package videos.oop.new_product;
/*-добавить товары в заказ
  -посчитать общую стоимость
  -вывести список товаров и общую сумму*/
import java.util.ArrayList;
import java.util.Arrays;

public class Order {
	private ArrayList<Position> positions;
	private double totalPrice;

	public Order() {
		this.positions = new ArrayList<>();
		this.totalPrice = 0;
	}
	public void addPositions(Position ...position) {
		positions.addAll(Arrays.asList(position));
	}
	public void calculateSum() {
		for (Position i : positions) {
			totalPrice += i.getSum();
		}
	}
	public void printCheck() {
		for (Position i : positions) {
			System.out.println(i);
		}
		System.out.println("Общая сумма заказа: " + totalPrice);
	}
	public void print() {
		positions.forEach(System.out::println);
		System.out.println(totalPrice);;
	}

	@Override
	public String toString() {
		return "Order{" +
				"positions=" + positions +
				", totalPrice=" + totalPrice +
				'}';
	}
}
