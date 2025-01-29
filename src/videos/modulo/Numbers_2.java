package videos.modulo;

/*Напишите класс, который принимает с клавиатуры целое положительное трехзначное число
и выводит его на экран в «полном виде»: например, для числа 729 это будет выглядеть как 700+20+9.
 */

import java.util.Scanner;

public class Numbers_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите целое трехзначное положительное число");
		int n = scan.nextInt();
		int n1 = n / 100;
		int n2 = n / 10 % 10;
		int n3 = n % 10;
		System.out.println(n1 * 100 + "+" + n2 * 10 + "+" + n3);

	}
}
