package videos.modulo;

/*Назовем «степенью четности» числа количество четных цифр в нем.
Например, для числа 4612 степень четности равна 3 (в его составе три четных цифры - 4, 6 и 2).

Напишите класс, который принимает с клавиатуры положительное
трехзначное число, а затем вычисляет и выводит на экран его «степень четности».*/

import java.util.Scanner;

public class Numbers_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите трехзначное положительное число: ");
		int n = scan.nextInt();
		int n1 = n / 100;
		int n2 = n / 10 % 10;
		int n3 = n % 10;
		int m = 0;
		if (n1 % 2 == 0)
			m++;
		if (n2 % 2 == 0)
			m++;
		if (n3 % 2 == 0)
			m++;
		System.out.println("Степень четности числа " + n + " = " + m);
	}
}
