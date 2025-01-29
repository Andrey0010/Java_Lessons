package videos.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Order {
	private ArrayList<Position> list;
	private double totalSum;

	public Order(ArrayList<Position> list) {
		this.list = list;
		this.totalSum = 0;
	}
	public void calculateTotalSum() {
		for (Position i : list) {
			totalSum += i.getSum();
		}
	}
	public void addProducts(Position ...positions) {
		list.addAll(Arrays.asList(positions));
	}
	public void printCheck() {
		for (Position i : list) {
			System.out.println(i);

		}System.out.println("Сумма к оплате: " + totalSum);
	}

	@Override
	public String toString() {
		return "Order{" +
				"list=" + list +
				", totalSum=" + totalSum +
				'}';
	}
}
