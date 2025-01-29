package videos.i_O;

import java.util.Scanner;

/*Трехзначное число называется «дважды четным», если и оно само, и
сумма его цифр - четные. Напишите класс, который принимает с клавиатуры
трехзначное положительное число и проверяет, является ли оно «дважды четным».
В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
*/
public class Numbers_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите трехзначное число: ");
		int n = scanner.nextInt();
		int n1 = n / 100;
		int n2 = n / 10 % 10;
		int n3 = n % 10;
		if (n % 2 == 0 && (n1 + n2 + n3) % 2 == 0) {
			System.out.println("Данное число является дважды четным");
		}else {
			System.out.println("Данное число не является дважды четным");
		}
	}
}
