package videos.oop.student;

public class Runner {
	public static void main(String[] args) {
		Student student = new Student("Ivan", new int[] {2, 3, 4});
		System.out.println(student);
		student.addGrades(5, 5, 5);
		System.out.println(student);
		student.addGrades(2, 3, 4);
		System.out.println(student);
		System.out.println(student.averageGrade());

	}
}
