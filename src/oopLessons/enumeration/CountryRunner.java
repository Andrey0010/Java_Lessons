package oopLessons.enumeration;

import java.util.Arrays;

public class CountryRunner {
	public static void main(String[] args) {
		System.out.println(Country.ARGENTINA.getName());
		System.out.println(CountryOld.ARGENTINA.getName());
		System.out.println(Arrays.toString(Country.values()));
		System.out.println(Country.valueOf("JAPAN").getPopulation());

	}
	public static CountryOld[] getCountries() {
		CountryOld[] countries = new CountryOld[3];
		countries[0] = new CountryOld("Япония", 300_000_000, "японский");
		countries[1] = new CountryOld("Греция", 10_000_000, "греческий");
		countries[2] = new CountryOld("Аргентина", 47_000_000, "аргентинский");

		return countries;
	}
}
