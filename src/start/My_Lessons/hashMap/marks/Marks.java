package start.My_Lessons.hashMap.marks;
/*Храните в Map имена студентов и их оценки.
Реализуйте поиск среднего балла всех студентов
и отображение студентов с максимальной/минимальной оценкой.*/
import javax.swing.*;
import java.util.*;

public class Marks {
	public static void main(String[] args) {
		Map<String, ArrayList<Integer>> map = new HashMap<>();
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2, 3, 4));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5));
		ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(5, 3, 4));
		list1.add(5);
		map.put("Vasya", list1);
		map.put("Petr", list2);
		map.put("Katya", list3);
		System.out.println(map);
		int sum = 0;
		int n = 0;
		for (ArrayList<Integer> i : map.values()) {
			for (int j : i) {
				sum += j;
				n++;
			}
		}
		System.out.println((double) sum / n);
		int max = 0;
		for (ArrayList<Integer> i : map.values()) {
			for (int j : i) {
				if (j > max)
					max = j;
			}
		}
		System.out.println(max);
		int min = 5;
		for (ArrayList<Integer> i : map.values()) {
			for (int j : i) {
				if (j < min)
					min = j;
			}
		}
		System.out.println(min);
		for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
			if (entry.getValue().contains(max))
				System.out.println("У " + entry.getKey() + " есть " + max);
			if (entry.getValue().contains(min))
				System.out.println("У " + entry.getKey() + " есть " + min);
		}
	}
}
