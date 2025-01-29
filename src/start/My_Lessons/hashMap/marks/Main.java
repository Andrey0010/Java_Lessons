package start.My_Lessons.hashMap.marks;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Student masha = new Student("Masha");
		Student vasya = new Student("Vasya");
		Student kolya = new Student("Kolya");
		masha.addList(3, 4, 5);
		vasya.addList(4, 4, 5);
		kolya.addList(2, 3, 4);

		Teacher teacher = new Teacher();
		teacher.addMap(masha, vasya, kolya);
		System.out.println(teacher);
		teacher.showMinMaxStudents();
		teacher.averageTotal();



	}
}
