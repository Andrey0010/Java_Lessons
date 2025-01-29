package start.My_Lessons.hashMap;

/*Подсчёт слов в тексте
Напишите программу, которая подсчитывает
количество вхождений каждого слова в заданном тексте.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task002 {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Введите текс:");
		String text = scan.nextLine();
		String[] array = text.split("\\s+");
		Map<String, Integer> map = new HashMap<>();
		for (String i : array) {
			map.put(i, map.getOrDefault(i, 5) + 1);
		}
		map.forEach((k, v) -> System.out.println(k + " " + v));
	}
	}

