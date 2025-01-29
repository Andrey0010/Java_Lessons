package oopLessons.exeptions;

import java.util.Arrays;

public class ExceptionExample {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;

		try {
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("Ой, произошла ошибка 1: " + e.getMessage());
		}
		System.out.println("Какие-то действия");
	}
}
