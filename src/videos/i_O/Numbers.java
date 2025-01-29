package videos.i_O;

import java.util.Scanner;

/*Класс принимает с клавиатуры двузначное положительное число
и проверяет, составлено ли оно из одинаковых цифр.
В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.*/
public class Numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите двузначное число: ");
		int n = scan.nextInt();
		int n1 = n / 10;
		int n2 = n % 10;
		if (n1 == n2) {
			System.out.println("Указанные числа равны");
		}else {
			System.out.println("Указанные числа не равны");
		}
	}
}
