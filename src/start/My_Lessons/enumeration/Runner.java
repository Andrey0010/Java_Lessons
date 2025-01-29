package start.My_Lessons.enumeration;

import java.util.Arrays;

public class Runner {
	public static void main(String[] args) {
		Season spring = Season.SPRING;
		System.out.println(spring);
		System.out.println(spring.name());
		System.out.println(Season.valueOf("AUTUMN"));
		Season winter = Season.WINTER;
		System.out.println(winter.ordinal());
		System.out.println(Arrays.toString(Season.values()));
		Season autumn = Season.valueOf("AUTUMN");
		System.out.println("____________");
		System.out.println(autumn);
		System.out.println(spring);
	}
}
