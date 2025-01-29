package videos.oop.students;

/*Реализуйте функционал добавления новых студентов,
добавления оценок студентам и вычисления среднего балла для каждого студента.*/

import java.util.ArrayList;
import java.util.Arrays;

public class Teacher {
	private ArrayList<Student> listStudents;

	public Teacher(ArrayList<Student> listStudents) {
		this.listStudents = listStudents;
	}
	public void  addStudents(Student ...students) {
		listStudents.addAll(Arrays.asList(students));
	}
	public void addMarks(Student student, int ...marks) {
		for (int i : marks) {
			student.getListMarks().add(i);
		}
	}
	/*public double average(String name) {
		int sum = 0;
		int n = 0;
		for (Student i : listStudents) {
			if (name.equals(i.getName())) {
				ArrayList<Integer> marks = i.getListMarks();
				for (int j : marks) {
					sum += j;
					n++;
				}
				return (double) sum / marks.size();
			}
		}
		return 0;
	}*/

	public double average(String name) {
		int sum = 0;
		for (Student i : listStudents) {
			if (name.equals(i.getName())) {
				for (int j : i.getListMarks()) {
					sum += j;
					}
				return (double) sum / i.getListMarks().size();
			}
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"listStudents=" + listStudents +
				'}';
	}
}

