package start.My_Lessons.hashMap.marks;

import java.util.*;

public class Marks01 {
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
		int max = 0;
		int min = 5;
		List<String> maxStudents = new ArrayList<>();
		List<String> minStudents = new ArrayList<>();

		for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
			for (int grade : entry.getValue()) {
				sum += grade;
				n++;
				if (grade > max) {
					max = grade;
					maxStudents.clear();
					maxStudents.add(entry.getKey());
				} else if (grade == max) {
					maxStudents.add(entry.getKey());
				}
				if (grade < min) {
					min = grade;
					minStudents.clear();
					minStudents.add(entry.getKey());
				} else if (grade == min) {
					minStudents.add(entry.getKey());
				}
			}
		}

		System.out.println("Average grade of all students: " + (double) sum / n);
		System.out.println("Maximum grade: " + max);
		System.out.println("Minimum grade: " + min);
		System.out.println("Students with maximum grade (" + max + "): " + maxStudents);
		System.out.println("Students with minimum grade (" + min + "): " + minStudents);
	}
}
