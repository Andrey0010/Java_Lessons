package videos.modulo;

/*Напишите класс, который принимает с клавиатуры целое положительное трехзначное число
и выводит на экран его цифры, разделенные знаком «пробел», но в обратном порядке.
То есть для числа 415 будет выведено на экран 5 1 4. */

import java.util.Scanner;

public class Numbers_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число: ");
		int n  = scan.nextInt();
		int n3 = n % 10;
		int n2 = n / 10 % 10;
		int n1 = n / 100;
		System.out.println(n3 + " " + n2 + " " + n1);
	}
}
