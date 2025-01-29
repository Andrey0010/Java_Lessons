package videos.i_O;

/*Напишите программу, которая высчитывает площадь окружности по заданному радиусу.*/

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите значение радиуса: ");
		double r = scan.nextDouble();
		double a = Math.PI * Math.pow(r, 2);
		System.out.println("Площадь окружности = " + a);
	}
}
