package videos.modulo;

/*Напишите класс, который принимает с клавиатуры целое положительное двузначное число
и выводит на экран его цифры, разделенные знаком «пробел». */

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите целое положительное двузначное число: ");
		int n = scan.nextInt();
		int n2 = n % 10;
		int n1 = n / 10;
		System.out.println(n1 + " " + n2);

	}
}
