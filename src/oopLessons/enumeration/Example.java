package oopLessons.enumeration;

public class Example {
	public static void main(String[] args) {
		CountryOld[] countries = CountryRunner.getCountries();
		for (CountryOld countryOld : countries) {
			if (countryOld.getName().equalsIgnoreCase("Греция")) {
				System.out.println(countryOld.getPopulation());
			}
		}
	}
}
