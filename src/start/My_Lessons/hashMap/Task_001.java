package start.My_Lessons.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_001 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = scan.nextLine();
		scan.close();

		Map<Character, Integer> charCountMap = new HashMap<>();

		for (char c : input.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
