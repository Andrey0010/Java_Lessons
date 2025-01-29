package oopLessons.enumeration;

public class CountryOld {
	private String name;
	private long population;
	private String language;
	public static final CountryOld ARGENTINA = new CountryOld("Аргентина", 47_000_000, "аргентинский");

	public CountryOld(String name, long population, String language) {
		this.name = name;
		this.population = population;
		this.language = language;
	}

	public static CountryOld getARGENTINA() {
		return ARGENTINA;
	}

	public String getName() {
		return name;
	}
	public long getPopulation() {
		return population;
	}
	public String getLanguage() {
		return language;
	}

	@Override
	public String toString() {
		return "Country{" +
				"name='" + name + '\'' +
				", population=" + population +
				", language='" + language + '\'' +
				'}';
	}
}
