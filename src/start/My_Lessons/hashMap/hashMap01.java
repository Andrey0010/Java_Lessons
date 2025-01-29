package start.My_Lessons.hashMap;

import java.util.HashMap;

public class hashMap01 {
	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<>();
		//map.put('a', 2);
		map.put('b', 3);
		map.put('c', 4);
		map.put('d', 4);
		System.out.println(map);
		System.out.println(map.get('a'));
		//map.put('a', 1);
		System.out.println(map.get('a'));
		System.out.println(map.get('d'));
		System.out.println(map.containsKey('d'));
		System.out.println(map.containsValue(4));
		System.out.println(map.values());
		map.forEach((k, v) -> System.out.println(k + " " + v));
		System.out.println(map.getOrDefault('a',10));
		System.out.println(map);

		}


}

