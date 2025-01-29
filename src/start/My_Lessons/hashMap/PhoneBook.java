package start.My_Lessons.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Создайте телефонный справочник, где ключом является имя человека,
а значением — его номер телефона. Реализуйте функции добавления,
удаления и поиска номера телефона.*/

public class PhoneBook {
	private Map<String, Integer> phoneBook;

	public PhoneBook() {
		this.phoneBook = new HashMap<>();
	}
	Scanner scan = new Scanner(System.in);

	public void addNumber() {
		System.out.println("Введите имя:");
		String name = scan.nextLine();
		System.out.println("Введите номер:");
		int number = scan.nextInt();
		phoneBook.put(name, number);
	}
	public void deleteNumber(String name) {
		phoneBook.remove(name);
	}
	public void findNumber(String name) {
		int n = 0;
		for (String key : phoneBook.keySet()) {
			if (key.equalsIgnoreCase(name)) {
				System.out.println(key +  ": " + phoneBook.get(key));
				n++;
			}
		}
		if (n == 0) {
			System.out.println("Такого имени нет в справочнике");
		}
	}
	public static void main(String[] args) {
		PhoneBook task003 = new PhoneBook();
		task003.addNumber();
		System.out.println(task003.phoneBook);
		task003.deleteNumber("Андр");
		System.out.println(task003.phoneBook);


	}
}
