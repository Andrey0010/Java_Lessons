package videos.i_O;

import java.util.Scanner;

public class I_O {
	public static class Task_001 {

	}

	/*Напишите класс, который */
	public static class Task_002 {
		public static void main(String[] args) {
			Scanner scan  = new Scanner(System.in);
			System.out.println("Введите размер стороны а прямоугольника: ");
			int a  = scan.nextInt();
			System.out.println("Введите размер стороны b прямоугольника: ");
			int b  = scan.nextInt();
			int c  = a * b;
			int d = a * 2  + b * 2;
			System.out.println("Площадь прямоугольника: " + c);
			System.out.println("Периметр прямоугольника: " + d);
		}
	}

	public static class Task_003 {
		public static void main(String[] args) {
			Scanner scan  = new Scanner(System.in);
			System.out.println("Введите число №1: ");
			int n = scan.nextInt();
			System.out.println("Введите число №2: ");
			int m = scan.nextInt();
			float a = (float) (n + m) / 2;
			System.out.println("Среднее арифметическое: " + a);
		}
	}

	/*Напишите класс, который сначала заносит в переменную строковое значение Привет,
		а затем принимает с клавиатуры ваше имя.
		Класс должен вывести на экран в одной строке сообщение,
		составленное из строкового значения Привет, знака «запятая» и вашего имени.*/
	public static class Task_004 {
		public static void main(String[] args) {
			String string  = "Привет";
			Scanner scan = new Scanner(System.in);
			System.out.println("Введите Ваше имя: ");
			String name = scan.next();
			System.out.println(string + ", " + name);
		}
	}

	/*Напишите класс, который принимает с клавиатуры фамилию пассажира и город, в который он вылетает.
		Класс должен построить строковую переменную, которая будет содержать сообщение Пассажир ... вълетает в ... ,
		в котором вместо многоточий будут фигурировать фамилия пассажира и название города, в который он вылетает.
		Эту строковую переменную следует вывести на экран.*/
	public static class Task_005 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Введите имя пассажира: ");
			String name = scan.next();
			System.out.println("Введите название города: ");
			String city = scan.next();
			String message = name + " вылетает в " + city;
			System.out.println(message);
			System.out.printf("%s вылетает в %s", name, city);
		}

	}

	/*Напишите класс, который принимает с клавиатуры фамилию, имя и отчество,
		а затем выводит на экран инициалы (без пробелов и через точку).*/
	public static class Task_006 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Введите фамилию: ");
			String surname = scan.next();
			System.out.println("Введите имя: ");
			String name = scan.next();
			System.out.println("Введите отчество: ");
			String fatherName = scan.next();
			String initials = surname.charAt(0) + "." + name.charAt(0) + "." + fatherName.charAt(0);
			System.out.println(initials);
		}
	}

	/*Напишите класс, который проводит расчет индекса массы тела.
		Формула: BMI = weight(kg)/(height*height(m)).*/
	public static class Task_007 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Введите вес в кг: ");
			double weight = scan.nextDouble();
			System.out.println("Введите рост в м: ");
			double height = scan.nextDouble();
			double bmi = weight / (height * height);
			System.out.printf("ИМТ = %f", bmi);
		}
	}
}
