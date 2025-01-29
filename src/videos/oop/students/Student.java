package videos.oop.students;

import java.util.ArrayList;

/*Задача 2: Управление студентами
Создайте систему учёта студентов. Для каждого студента необходимо хранить
его имя и список оценок. Реализуйте функционал добавления новых студентов,
добавления оценок студентам и вычисления среднего балла для каждого студента.*/
public class Student {
	private String name;
	private ArrayList<Integer> listMarks;

	public Student(String name, ArrayList<Integer> listMarks) {
		this.name = name;
		this.listMarks = listMarks;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Integer> getListMarks() {
		return listMarks;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", listMarks=" + listMarks +
				'}';
	}
}
