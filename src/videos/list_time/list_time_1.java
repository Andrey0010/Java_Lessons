package videos.list_time;

import java.util.ArrayList;
import java.util.List;

public class list_time_1 {
	public static void main(String[] args) {
		// Создание списка через интерфейс List (реализация - ArrayList)
		List<Integer> list1 = new ArrayList<>();
		// Создание списка через ArrayList
		ArrayList<Integer> list2 = new ArrayList<>();

		// Замер времени для List
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			list1.add(i);
		}
		long endTime = System.nanoTime();
		System.out.println("Time for List: " + (endTime - startTime) + " ns");

		// Замер времени для ArrayList
		startTime = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			list2.add(i);
		}
		endTime = System.nanoTime();
		System.out.println("Time for ArrayList: " + (endTime - startTime) + " ns");
	}
}

