package start.My_Lessons.hashMap.marks;
/*Рейтинг студентов
Храните в Map имена студентов и их оценки.
Реализуйте поиск среднего балла всех студентов
и отображение студентов с максимальной/минимальной оценкой.*/
import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Integer> list = new ArrayList<>();

	public Student(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public ArrayList<Integer> getList() {
		return list;
	}
	public void addList(int ...marks) {
		for (int i : marks) {
			list.add(i);
		}
	}
	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", list=" + list +
				'}';
	}
}
