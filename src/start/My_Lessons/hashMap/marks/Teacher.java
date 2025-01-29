package start.My_Lessons.hashMap.marks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Teacher {
	private Map<String, ArrayList<Integer>> map;

	public Teacher() {
		this.map = new HashMap<>();
	}
	public void addMap(Student ...student) {
		for (Student i : student) {
			map.put(i.getName(), i.getList());
		}
	}
	public void averageTotal() {
		int sum = 0;
		int n = 0;
		for (ArrayList<Integer> i : map.values()) {
			for (int j : i) {
				sum += j;
				n++;
			}
		}
		System.out.println("Средняя оценка по всем ученикам: " + (double) sum / n);
	}
	public int findMax() {
		int max = 0;
		for (ArrayList<Integer> i : map.values()) {
			for (int j : i) {
				if (j > max)
					max = j;
			}
		}
		return max;
	}
	public int findMin() {
		int min = 5;
		for (ArrayList<Integer> i : map.values()) {
			for (int j : i) {
				if (j < min)
					min = j;
			}
		}
		return min;
	}
	public void showMinMaxStudents() {
		ArrayList<String> maxNames = new ArrayList<>();
		ArrayList<String> minNames = new ArrayList<>();
		for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
			if (entry.getValue().contains(findMax()))
				maxNames.add(entry.getKey());
			if (entry.getValue().contains(findMin()))
				minNames.add(entry.getKey());
		}
		System.out.printf("Студенты с максимальной оценкой (%d): %s\n", findMax(), maxNames);
		System.out.printf("Студенты с минимальной оценкой (%d): %s\n", findMin(), minNames);
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"map=" + map +
				'}';
	}
}
