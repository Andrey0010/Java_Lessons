package oopLessons.exeptions;

public class FinallyExample {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			throw new ArithmeticException("Ошибка " + e.getMessage());
		} finally {
			System.out.println("Программа работает дальше");
		}
	}
}
