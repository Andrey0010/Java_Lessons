package start.My_Lessons.hashMap;

/*Подсчёт повторяющихся символов в строке
Напишите программу, которая подсчитывает
количество единиц каждого символа в строке и выводит результат.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_001_1 {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Введите набор знаков:");
		String line = scan.nextLine();
		char[] array = line.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char i : array) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		System.out.println(map);
	}
}

