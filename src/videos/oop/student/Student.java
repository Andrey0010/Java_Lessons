package videos.oop.student;

import java.util.Arrays;

/*
Создайте класс Student, который описывает студента.

Поля:

name (имя, тип String),
grades (массив оценок, тип int[]).

Реализуйте методы:
Метод averageGrade(), возвращающий среднюю оценку студента.
Метод addGrades(int... newGrades): добавляет новые оценки к массиву (varargs).
Метод toString(), который возвращает информацию о студенте: имя и его оценки.
Напишите код для создания нескольких студентов, добавления оценок и расчёта их средней оценки.*/
public class Student {
	private String name;
	private int[] grades;

	public Student(String name, int[] grades) {
		this.name = name;
		this.grades = grades;
	}
	public double averageGrade() {
		int n = 0;
		for (int i : grades) {
			n += i;
		}
		return (double) n / grades.length;
	}
	public void addGrades(int ...newGrades) {
		int length = grades.length;
		grades = Arrays.copyOf(grades, grades.length + newGrades.length);
		System.arraycopy(newGrades, 0, grades, length, newGrades.length);
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", grades=" + Arrays.toString(grades) +
				'}';
	}
}
