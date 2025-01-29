package videos.oop.students;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Student ivan = new Student("Ivan", new ArrayList<>(Arrays.asList(2, 3, 4)));
		Student petr = new Student("Petr", new ArrayList<>(Arrays.asList(3, 3, 4)));
		Student alex = new Student("Alex", new ArrayList<>(Arrays.asList(3, 3, 4)));


		Teacher teacher = new Teacher(new ArrayList<>(Arrays.asList(ivan, petr)));
		System.out.println(teacher);
		Student egor = new Student("Egor", new ArrayList<>(Arrays.asList(3, 4, 5)));
		Student ksenya = new Student("Ksenya", new ArrayList<>(Arrays.asList(5, 4, 5)));
		teacher.addStudents(egor, ksenya);
		teacher.addStudents(alex);
		System.out.println(teacher);
		teacher.addMarks(egor, 4, 4, 4);
		System.out.println(egor);
		System.out.println(teacher.average("Egor"));
		System.out.println("_______________");
		System.out.println(teacher);
	}
}
